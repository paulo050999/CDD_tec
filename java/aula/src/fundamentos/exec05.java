package fundamentos;

import java.util.Scanner;

public class exec05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite uma letra: ");
		
		char gen  = entrada.next().charAt(0);
		if (gen == 'm' || gen == 'M') {
			System.out.println("Gênero masculino");
		} else if (gen == 'f'|| gen == 'F') {
			System.out.println("Gênero feminino");}
			else {
				System.out.println("Caractere Inválido");
			}
			}
}
