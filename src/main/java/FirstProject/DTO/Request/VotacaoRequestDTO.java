package FirstProject.DTO.Request;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VotacaoRequestDTO {
    private String status;
    private  long idPauta;
    private long timeVotacao;
}
