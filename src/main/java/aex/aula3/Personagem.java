package aex.aula3;

public class Personagem {
    
    // ATRIBUTOS:
    public String nome;
    public int vida;
    
    // CONSTRUTORES:
    // Construtor para o funcionamento do Get/Post na Web
    public Personagem () {
        
    } // FIM DO CONSTRUTOR 1
    
    // Construtor para o funcionamento via terminal/janela swing
    public Personagem (String nomeRecebido) {
        
        this.nome = nomeRecebido;   // Faz com que o heroi receba o nome digitado
        this.vida = 100;            // Determina previamente que a vida eh 100 ao criar
        
    } // FIM DO CONSTRUTOR 2
    
} // FIM DA CLASSE PERSONAGEM