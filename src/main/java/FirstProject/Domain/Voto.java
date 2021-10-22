package FirstProject.Domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="VOTO")
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
}

