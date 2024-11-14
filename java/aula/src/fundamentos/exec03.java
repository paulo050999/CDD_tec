package fundamentos;

import java.util.Scanner;

public class exec03 {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		
		int dia_da_semana = entrada.nextInt();
		if (dia_da_semana == 1) {
			System.out.println("É domingo");

		} else if (dia_da_semana == 2) {
			System.out.println("É Segunda");
		} else if (dia_da_semana == 3) {
			System.out.println("É terça");
		} else if (dia_da_semana == 4) {
			System.out.println("É quarta");
		} else if (dia_da_semana == 5) {
			System.out.println("É quinta");
		} else if (dia_da_semana == 6) {
			System.out.println("É sexta");
		} else if (dia_da_semana == 7) {
			System.out.println("É sábado");
		}else {
				System.out.println("Não é dia da semana");
			}

	}

}
