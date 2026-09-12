package aex.aula3;

// Imports do Java Swing
import javax.swing.*;
import java.awt.*;

public class JogoTela {

    public void exibirJanela() {
        
        // COMPONENTES
        JFrame janela = new JFrame("Criação de Personagens");
        JLabel rotulo = new JLabel("Digite o nome do Herói: ");
        JTextField campoNome = new JTextField(15);
        JButton botaoCadastrar = new JButton ("Cadastrar no Jogo");
        
        // ACOES DOS COMPONENTES
        botaoCadastrar.addActionListener(evento -> {
            String textoDigitado = campoNome.getText();
            Personagem novoHeroi = new Personagem(textoDigitado);
            System.out.println("Personagem criado!");
            System.out.println("Nome: " + novoHeroi.nome);
            System.out.println("Vida: " + novoHeroi.vida);
            campoNome.setText("");
        });
        
        // DESIGN DA JANELA
        janela.setLayout(new FlowLayout());
        janela.add(rotulo);
        janela.add(campoNome);
        janela.add(botaoCadastrar);
        
        // CONFIGURACOES DA JANELA
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.pack();
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
        
    } // FIM DO METODO DE EXIBICAO
    
} // FIM DA CLASSE DA TELA DO JOGO
