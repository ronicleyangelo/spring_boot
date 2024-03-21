package banco_de_dados.com.geazin.core.service;

import banco_de_dados.com.geazin.core.domain.Teste;
import banco_de_dados.com.geazin.core.repository.TesteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TesteService {
    @Autowired
    TesteRepository repository;

    public Teste insert(Teste t) {
        return repository.save(t);
    }

    public void update(Teste teste, Long id) {
        if (repository.existsById(id)) {
            Teste testeExis = repository.findById(id).get();
            testeExis.setNome(teste.getNome());
            testeExis.setDescricao(teste.getDescricao());
            repository.save(testeExis);
        }
    }
}
