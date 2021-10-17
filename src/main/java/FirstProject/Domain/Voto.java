package FirstProject.Domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Voto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "sessao_id")
    private Votacao sessaoVotacao;

    @Column(nullable = false)
    private String associado;

    @Column(nullable = false)
    private boolean ehVotoAprovativo;
}
