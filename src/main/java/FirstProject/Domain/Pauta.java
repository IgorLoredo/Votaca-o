package FirstProject.Domain;

import FirstProject.DTO.Request.PautaRequestDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "pauta")
public class Pauta {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String motivo;

    public static Pauta toRest(PautaRequestDTO requestDTO) {
        Pauta pauta = new Pauta();
        pauta.setId(requestDTO.getId());
        pauta.setMotivo(requestDTO.getMotivo());
        return pauta;
    }
}
