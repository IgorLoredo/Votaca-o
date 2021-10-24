package FirstProject.Service.Impl;

import FirstProject.DTO.MessageDTO;
import FirstProject.DTO.Request.VotoRequestDTO;
import FirstProject.Domain.Votacao;
import FirstProject.Domain.Voto;
import FirstProject.Repository.VotacaoRepository;
import FirstProject.Repository.VotoRepository;
import FirstProject.Service.VotoService;
import FirstProject.Repository.Integration_external.ValidateIntegration;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VotoServiceImpl implements VotoService {
    private static Logger logger = LoggerFactory.getLogger(VotoServiceImpl.class);


    private ValidateIntegration integration;

    @Autowired
    private VotoRepository votoRepository;

    @Autowired
    private VotacaoRepository votacaoRepository;

    @Autowired
    public VotoServiceImpl(ValidateIntegration integration, VotoRepository votoRepository) {
        this.integration = integration;
        this.votoRepository = votoRepository;
    }

    ///     //"cpf":"19839091069",
    public MessageDTO addVoto(VotoRequestDTO requestDTO) {
        try {
            logger.info("{}", requestDTO.getCPF());

            if (integration.podeVotar(requestDTO.getCPF())) {
                Votacao votacao = findVotacao(requestDTO.getIdVotacao());
                validaVotoDuplicado(requestDTO);
                Voto newVoto = new Voto(requestDTO, votacao);
                votoRepository.save(newVoto);
                var message = new MessageDTO();
                message.setStatus("Voto Confirmado");
                findVotacao(requestDTO.getIdVotacao());
                logger.info("Voto Confirmado");
                return message;
            }
            return new MessageDTO();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public Votacao findVotacao(long votacao) {
        Votacao votacao2 = votacaoRepository.findById(votacao).get();
        return votacao2;
    }

    public int validaVotoDuplicado(VotoRequestDTO requestDTO) {
        Voto votoCont = votoRepository.findByVotacao_IdAndCpf(requestDTO.getIdVotacao(), requestDTO.getCPF());
        logger.info("Votos{}", votoCont);
        if (votoCont != null && votoCont.getId() != null) {
            return 1;
        }
        return 0; // voto invalido
    }
}
