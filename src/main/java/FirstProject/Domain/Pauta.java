package FirstProject.Domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "PAUTA")
public class Pauta {
    @Id
    private Integer voto;
    private String motivo;

    private Integer totalVotos;

//    public Pauta(final String motivo ){
//        this.motivo = motivo;
//    }
}
