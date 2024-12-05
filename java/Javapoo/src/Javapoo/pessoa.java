package Javapoo;

import java.util.Scanner;

public class pessoa {

		String nome;
		Double peso;
		int idade;
		
		Scanner sc = new Scanner(System.in);

		public void comer() {
			System.out.printf(this.nome + " foi comer");
	        }
		public void cadastro() {
			System.out.println("Digite o nome da pessoa");
			this.nome=sc.nextLine();
			System.out.println("Digite o peso");
			this.peso=sc.nextDouble();
			System.out.println("Digite a idade da pessoa");
			this.idade=sc.nextInt();
		}
	}


