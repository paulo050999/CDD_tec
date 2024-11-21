package fundamentos;

import java.util.Scanner;

public class Exec06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		
	}

}
