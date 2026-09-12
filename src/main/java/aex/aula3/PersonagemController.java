package aex.aula3;

// Imports para Web (GET/POST) e para Listas (ArrayList/List)
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonagemController {
    
    // Lista de Personagens (e seus atributos)
    private List<Personagem> personagensSalvos = new ArrayList<>();
    
    @GetMapping("/personagens")
    public List<Personagem> listarTodos() {
        
        // Retorna todos os personagens salvos/postados
        return personagensSalvos;
        
    } // FIM DA LISTAGEM (GET)
    
    
    @PostMapping("/personagens")
    public Personagem cadastrarPelaWeb(@RequestBody Personagem novoHeroi) {
        
        // Atribui o nome (RequestBody) e a vida do Heroi e o adiciona na lista
        novoHeroi.vida = 100;
        personagensSalvos.add(novoHeroi);
        
        // Imprime feedbacks ao usuario via terminal
        System.out.println("API RECEBEU POST!");
        System.out.println("Personagem " + novoHeroi.nome + " salvo.");
        
        // Retorna o Heroi adicionado
        return novoHeroi;
        
    } // FIM DO CADASTRO (POST)
    
} // FIM DO CONTROLADOR DO PERSONAGEM