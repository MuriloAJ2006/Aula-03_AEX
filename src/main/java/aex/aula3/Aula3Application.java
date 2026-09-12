package aex.aula3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Aula3Application {

	public static void main(String[] args) {
                System.setProperty("java.awt.headless", "false");
		SpringApplication.run(Aula3Application.class, args);
                
                java.awt.EventQueue.invokeLater(() -> {
                    JogoTela tela = new JogoTela();
                    tela.exibirJanela();
                });
	}

}
