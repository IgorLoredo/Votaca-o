package FirstProject.DTO.Response;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PautaResponseDTO {

    private String status;
    private String pautaDescription;
    public void setStatus(String status) {
        this.status = status;
    }
}
