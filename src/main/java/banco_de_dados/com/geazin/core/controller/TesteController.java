package banco_de_dados.com.geazin.core.controller;

import banco_de_dados.com.geazin.core.domain.Teste;
import banco_de_dados.com.geazin.core.service.TesteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/teste")
public class TesteController {
    // http://locashost:8080/teste
    @Autowired
    TesteService testeService;

    // http://locashost:8080/teste/ ou // http://locashost:8080/teste
    @RequestMapping(value = {"/", ""}, method = RequestMethod.POST)
    public ResponseEntity<?> criarTeste(@RequestBody Teste teste) {
        Teste teste1 = testeService.insert(teste);
        return ResponseEntity.ok().body(teste1);
    }

}
