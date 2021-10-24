package FirstProject.Service.Impl;

import FirstProject.DTO.MessageDTO;
import FirstProject.DTO.Request.VotacaoRequestDTO;
import FirstProject.DTO.Response.VotacaoResponseDTO;
import FirstProject.Domain.Pauta;
import FirstProject.Domain.Votacao;
import FirstProject.Repository.PautaRepository;
import FirstProject.Repository.VotacaoRepository;
import FirstProject.Repository.VotoRepository;
import FirstProject.Service.VotacaoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
@Slf4j
public class VotacaoServiceImpl implements VotacaoService {

    @Autowired
    private VotoRepository votoRepository;

    @Autowired
    private PautaRepository pautaRepository;

    @Autowired
    private VotacaoRepository votacaoRepository;

    public MessageDTO createVotacao(VotacaoRequestDTO request){

        try{
            log.info("Pauta ");
            Pauta pauta = pautaRepository.findById(request.getIdPauta()).get();
            log.info("Pauta {}",pauta.getId());
            Votacao votacao = Votacao.toRest(request,pauta);
            votacaoRepository.save(votacao);
            MessageDTO message = new MessageDTO();
            message.setStatus("Votacao foi aberta");
            return message;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new MessageDTO();
    }

    public VotacaoResponseDTO countVoto(String cpf, Integer voto){
        try{

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public VotacaoResponseDTO findVotacao(long id){
        var voto =  new VotacaoResponseDTO();

        return voto;
    }

}



//docker run --name votacao-postgres --network=postgres-network -e "POSTGRES_PASSWORD=Ifba@2015" -p 5432:5432 -v /home/igor/Documentos/SprintProjects/FirstProject/dados -d postgres