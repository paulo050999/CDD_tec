package fundamentos;
import java.util.Scanner;
public class Exec06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner entrada = new Scanner(System.in);
	        int respostasPositivas = 0;
	        char resposta; // Variável única para armazenar a primeira letra da resposta

	        // Pergunta 1
	        System.out.println("Telefonou para a vítima? (Responda com 'sim' ou 'não')");
	        resposta = entrada.nextLine().trim().toLowerCase().charAt(0); // Captura a primeira letra
	        if (resposta == 's') { // Verifica se a resposta é "s"
	            respostasPositivas++;
	        }

	        // Pergunta 2
	        System.out.println("Esteve no local do crime? (Responda com 'sim' ou 'não')");
	        resposta = entrada.nextLine().trim().toLowerCase().charAt(0);
	        if (resposta == 's') {
	            respostasPositivas++;
	        }

	        // Pergunta 3
	        System.out.println("Mora perto da vítima? (Responda com 'sim' ou 'não')");
	        resposta = entrada.nextLine().trim().toLowerCase().charAt(0);
	        if (resposta == 's') {
	            respostasPositivas++;
	        }

	        // Pergunta 4
	        System.out.println("Devia para a vítima? (Responda com 'sim' ou 'não')");
	        resposta = entrada.nextLine().trim().toLowerCase().charAt(0);
	        if (resposta == 's') {
	            respostasPositivas++;
	        }

	        // Pergunta 5
	        System.out.println("Já trabalhou com a vítima? (Responda com 'sim' ou 'não')");
	        resposta = entrada.nextLine().trim().toLowerCase().charAt(0);
	        if (resposta == 's') {
	            respostasPositivas++;
	        }

	        // Classificação
	        String classificacao;
	        if (respostasPositivas == 2) {
	            classificacao = "Suspeita";
	        } else if (respostasPositivas >= 3 && respostasPositivas <= 4) {
	            classificacao = "Cúmplice";
	        } else if (respostasPositivas == 5) {
	            classificacao = "Assassino";
	        } else {
	            classificacao = "Inocente";
	        }

	        // Exibe o resultado
	        System.out.println("Classificação: " + classificacao);

	        // Fecha o Scanner
	        entrada.close();
		    }
	}

