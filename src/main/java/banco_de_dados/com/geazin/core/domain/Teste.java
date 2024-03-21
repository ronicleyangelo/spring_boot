package banco_de_dados.com.geazin.core.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // defino que está calsse é uma Entidade
@Data // implementa os gettes e setts
@NoArgsConstructor // Cria um construstor padrão que não possue nenhum argumento
@Table(name = "teste") // dar o nome a tabela
public class Teste {

    private static final long serialVersionUID = 1L;;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;

    public Teste(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
    }
}
