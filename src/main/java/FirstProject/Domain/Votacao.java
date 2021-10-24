package FirstProject.Domain;


import FirstProject.DTO.Request.VotacaoRequestDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Getter
@Setter
@Entity
@Table(name = "votacao")
public class Votacao implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Date dataHoraAbertura;

    @Column
    private Long tempoAbertura;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "pauta_id")
    private Pauta pauta;

    public static Votacao toRest(VotacaoRequestDTO requestDTO, Pauta pauta){
        Votacao votacao = new Votacao();
        votacao.setDataHoraAbertura(new Date());
        votacao.setTempoAbertura(decideTempo(requestDTO.getTimeVotacao()));
        votacao.setPauta(pauta);
        return votacao;
    }
    private static long decideTempo(long tempoDeAberturaEmSegundos) {
        return (tempoDeAberturaEmSegundos == 0|| tempoDeAberturaEmSegundos <= 0) ? 60 : tempoDeAberturaEmSegundos;
    }
}
