package FirstProject.Domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Getter
@Setter
@Entity
@Table(name = "VOTACAO")
public class Votacao implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id_votacao;

    private long time;

    @OneToMany(cascade = CascadeType.ALL,targetEntity = Pauta.class)
    private List<Pauta> pauta;


//    public Votacao(final Pauta pauta, long time) {
//        this.pauta.add(pauta);
//        this.time = time;
//    }

//    public Votacao(final Pauta pauta) {
//        this.pauta.add(pauta);
//        this.time = 60;
//    }
}
