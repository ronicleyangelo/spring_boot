package banco_de_dados.com.geazin.core.repository;

import banco_de_dados.com.geazin.core.domain.Teste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TesteRepository extends JpaRepository<Teste, Long> {

}
