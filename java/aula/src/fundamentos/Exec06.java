package fundamentos;
<<<<<<< HEAD

import java.util.Scanner;

=======
import java.util.Scanner;
>>>>>>> 90491339959f59333c0c9aa53f47c47a841e206b
public class Exec06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		Scanner entrada = new Scanner (System.in);
		System.out.println("Você telefonou para a vítima?");
		int cont = 0;
		char perg = entrada.next().charAt(0);
		if (perg == 's' || perg == 'S') {
			perg = cont+=1;
			}
		
		System.out.println("Você esteve no local do crime?");
		char perg = entrada.next().charAt(0);
		if (perg == 's' || perg == 'S') {
			(perg = cont+=1);
		}
		
		System.out.println("Você mora perto da vítima?");
		char perg = entrada.next().charAt(0);
		if (perg == 's' || perg == 'S') {
			(perg = cont+=1);
		}
		System.out.println("Você Devia para a vítima?");
		char perg = entrada.next().charAt(0);
		if (perg == 's' || perg == 'S') {
			(perg = cont+=1);
		} 
		System.out.println("Você Já trabalhou com a vítima?");
		char perg = entrada.next().charAt(0);
		if (perg == 's' || perg == 'S') {
			(perg = cont+=1);
		} else {
			(perg += 0)
		}
		
		if (perg >=2) {
			System.out.println("Culpado");
		} else {
			System.out.println("Inocente");
		}
		
		
=======
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
>>>>>>> 90491339959f59333c0c9aa53f47c47a841e206b
	}

