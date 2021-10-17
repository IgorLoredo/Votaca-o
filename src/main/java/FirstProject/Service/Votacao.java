package FirstProject.Service;


import FirstProject.DTO.Response.VotacaoResponseDTO;

public interface Votacao {
    public VotacaoResponseDTO registarVoto(String cpf, Integer voto);
}
