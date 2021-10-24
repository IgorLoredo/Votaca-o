package FirstProject.Service;


import FirstProject.DTO.MessageDTO;
import FirstProject.DTO.Request.VotacaoRequestDTO;
import FirstProject.DTO.Response.VotacaoResponseDTO;

public interface VotacaoService {
    public VotacaoResponseDTO countVoto(String cpf, Integer voto);

    public VotacaoResponseDTO findVotacao(long id);

    public MessageDTO createVotacao(VotacaoRequestDTO request);
}
