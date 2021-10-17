package FirstProject.DTO.Response;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
public class VotacaoResponseDTO {

    private Long id;
    private String pauta;
    private Integer tempoDeAberturaEmSegundos;
    private Date dataHoraAbertura;
}
