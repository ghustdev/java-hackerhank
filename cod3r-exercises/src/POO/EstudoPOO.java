package POO;

// Ctrl + Alt + O - remove importações
import java.time.LocalDate;

public class EstudoPOO {
    // Classes Java - definições de estruturas com atributos e métodos, precisa definir encapsulamento e consequentimente getters e setters
    // Records - um tipo especial de classe,p principalmente para validar e transportar dados, pois é imutável;

    public EstudoPOO() {}
    
    public void teste() {
//        LocalDate data = LocalDate.of(2023, 10, 10);
    }
}

/* // Declaração de uma linha:
public record UsuarioDTO(String nome, int idade) {

    // Construtor Compacto para validações (sem precisar reatribuir 'this.nome = nome')
    public UsuarioDTO {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa");
        }
    }
}


public static void main(String[] args) {
    // Uso:
    UsuarioDTO dto = new UsuarioDTO("Gustavo", 20);
    System.out.println(dto.nome());  // Acesso direto (sem o prefixo 'get')
    System.out.println(dto.idade());
    System.out.println(dto);        // Saída: UsuarioDTO[nome=Gustavo, idade=20]
} */
