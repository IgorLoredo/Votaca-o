package FirstProject.Domain;

import FirstProject.DTO.Request.VotoRequestDTO;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="VOTO")
@Slf4j
public class Voto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "sessao_id")
    private Votacao votacao;

    @Column(nullable = false)
    private String cpf;

    @Column(nullable = false)
    private boolean isVotoConfirmacao;

    public Voto(VotoRequestDTO requestDTO, Votacao votacao){
        this.cpf = requestDTO.getCPF();
        log.info(" ID votacao {}", requestDTO.getIdVotacao());
        this.votacao = votacao;
        this.isVotoConfirmacao = requestDTO.isEhSim();
    }
}

