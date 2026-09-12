package aex.aula3;

// Imports do Spring Boot
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Aula3Application {

	public static void main(String[] args) {
            
            // Chamadas da Tela e da Aplicacao Spring
            System.setProperty("java.awt.headless", "false");
            SpringApplication.run(Aula3Application.class, args);

            // Cria e invoca a Tela
            java.awt.EventQueue.invokeLater(() -> {

                JogoTela tela = new JogoTela();
                tela.exibirJanela();

            }); // FIM DO INVOCADOR
                
	} // FIM DA MAIN

} // FIM DA CLASSE