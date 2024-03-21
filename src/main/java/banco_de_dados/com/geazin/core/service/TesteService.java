package banco_de_dados.com.geazin.core.service;

import banco_de_dados.com.geazin.core.domain.Teste;
import banco_de_dados.com.geazin.core.repository.TesteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TesteService {
    @Autowired
    TesteRepository repository;

    public Teste insert(Teste t){
        return repository.save(t);
    }
}
