package FirstProject.DTO.Request;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VotoRequestDTO {
    private Long idVotacao;
    private String CPF;
    private boolean ehSim;
}
