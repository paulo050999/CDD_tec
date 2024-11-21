package fundamentos_02;

import java.util.Scanner;

public class exec02_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner entrada = new Scanner (System.in);
			System.out.println("Digite um número: ");
			int numero = entrada.nextInt();
			
		    int c = 1; 
		    while (c <= numero) {
		    if (c % 2 != 0) {
		    	System.out.println(c);
		    }
		            c++; 
		        }
		    }

	}
