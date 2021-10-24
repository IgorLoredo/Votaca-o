package FirstProject.Repository;


import FirstProject.Domain.Voto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VotoRepository extends JpaRepository<Voto, Long> {

    List<Voto> findAllById(Long votacaoId);

    List<Voto> findAllByVotacao_Id(Long votacaoId);

    Voto findByVotacao_IdAndCpf(Long votacaoId, String cpf);
}
