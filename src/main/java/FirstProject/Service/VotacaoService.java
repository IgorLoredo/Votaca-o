package FirstProject.Service;


import FirstProject.DTO.Response.VotacaoResponseDTO;

public interface VotacaoService {
    public VotacaoResponseDTO countVoto(String cpf, Integer voto);

    public VotacaoResponseDTO findVotacao(long id);
}
