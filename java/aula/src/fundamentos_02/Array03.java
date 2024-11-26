package fundamentos_02;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
        double[] notas = new double[5]; 
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = ent.nextDouble();
            soma += notas[i];
        }
        
        
        double media = soma / notas.length;

        System.out.print(media);
		
        ent.close();
        
    }
}

