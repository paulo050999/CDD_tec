package fundamentos;

import java.util.Scanner;

public class Classe_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero:");
		 int resp = entrada.nextInt();
		System.out.println(resp);
		entrada.close();
	}

}
		
