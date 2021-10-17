package FirstProject.Service.Impl;

import FirstProject.DTO.Response.VotacaoResponseDTO;
import FirstProject.Service.VotacaoService;
import org.springframework.stereotype.Service;

@Service
public class VotacaoServiceImpl implements VotacaoService {


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