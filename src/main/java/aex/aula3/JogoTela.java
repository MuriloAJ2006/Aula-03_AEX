package aex.aula3;

import javax.swing.*;
import java.awt.*;

public class JogoTela {

    public void exibirJanela() {
        
        JFrame janela = new JFrame("Criação de Personagens");
        JLabel rotulo = new JLabel("Digite o nome do Herói: ");
        JTextField campoNome = new JTextField(15);
        JButton botaoCadastrar = new JButton ("Cadastrar no Jogo");
        
        botaoCadastrar.addActionListener(evento -> {
            String textoDigitado = campoNome.getText();
            Personagem novoHeroi = new Personagem(textoDigitado);
            System.out.println("Personagem criado!");
            System.out.println("Nome: " + novoHeroi.nome);
            System.out.println("Vida: " + novoHeroi.vida);
            campoNome.setText("");
        });
        
        janela.setLayout(new FlowLayout());
        janela.add(rotulo);
        janela.add(campoNome);
        janela.add(botaoCadastrar);
        
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.pack();
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
        
    } // FIM DO METODO DE EXIBICAO
    
} // FIM DA CLASSE DA TELA DO JOGO
