package FirstProject.Service.Impl;

import FirstProject.DTO.MessageDTO;
import FirstProject.DTO.Request.VotoRequestDTO;
import FirstProject.Domain.Voto;
import FirstProject.Repository.VotoRepository;
import FirstProject.Service.VotoService;
import FirstProject.Repository.Integration_external.ValidateIntegration;
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
    public VotoServiceImpl(ValidateIntegration integration, VotoRepository votoRepository){
        this.integration = integration;
        this.votoRepository = votoRepository;
    }
///     //"cpf":"19839091069",
    public MessageDTO addVoto(VotoRequestDTO requestDTO){
        try{
            logger.info("{}",requestDTO.getCPF());

            if(integration.podeVotar(requestDTO.getCPF())){
                var message = new MessageDTO();
                message.setStatus("Voto Confirmado");
                findVotacao(requestDTO.getIdVotacao());
                return message;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public MessageDTO findVotacao(long votacao){
        List<Voto> listVotos =votoRepository.findAllByVoto_Id(votacao);
        logger.info("Votos{}",listVotos.size());
        return null;
    }

}
