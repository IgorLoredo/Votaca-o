package FirstProject.Service.Impl;

import FirstProject.DTO.Response.VotacaoResponseDTO;
import FirstProject.Service.Votacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VotacaoImpl implements Votacao {


    public VotacaoResponseDTO registarVoto(String cpf, Integer voto){
        try{

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public VotacaoResponseDTO findVotacao(int id){
        return null;
    }
}



//docker run --name votacao-postgres --network=postgres-network -e "POSTGRES_PASSWORD=Ifba@2015" -p 5432:5432 -v /home/igor/Documentos/SprintProjects/FirstProject/dados -d postgres