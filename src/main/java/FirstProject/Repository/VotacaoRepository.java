package FirstProject.Repository;

import FirstProject.Domain.Votacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VotacaoRepository extends JpaRepository<Votacao, Long> {
}
