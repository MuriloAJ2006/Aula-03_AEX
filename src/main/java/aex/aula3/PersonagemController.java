package aex.aula3;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonagemController {
    
    private List<Personagem> personagensSalvos = new ArrayList<>();
    
    @GetMapping("/personagens")
    public List<Personagem> listarTodos() {
        return personagensSalvos;
    }
    
    @PostMapping("/personagens")
    public Personagem cadastrarPelaWeb(@RequestBody Personagem novoHeroi) {
        novoHeroi.vida = 100;
        personagensSalvos.add(novoHeroi);
        System.out.println("API RECEBEU POST!");
        System.out.println("Personagem " + novoHeroi.nome + " salvo.");
        return novoHeroi;
    } // FIM DO CADASTRO PELA WEB
    
} // FIM DO CONTROLADOR DO PERSONAGEM