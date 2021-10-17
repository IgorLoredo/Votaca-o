package FirstProject.DTO.Request;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VotaçaoRequestDTO {
    String status;
    String id_Voto;
    private Boolean ehSim;
}
