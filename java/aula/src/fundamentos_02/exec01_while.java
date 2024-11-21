package fundamentos_02;

import java.util.Scanner;

public class exec01_while {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		        Scanner entrada = new Scanner(System.in);
		        System.out.println("Quantos alunos tem na sala?");
		        int numAlunos = entrada.nextInt();
		        float somaNotas = 0; 
		        int cont = 1; 
		        while (cont <= numAlunos) {
		            System.out.println("Digite a nota do aluno " + cont + ":");
		            double nota = entrada.nextDouble();
		            somaNotas += nota; 
		            cont++;    
		           
		 }
		        float media = somaNotas/numAlunos;
	            System.out.println("A média da turma é: " + media);

	}

}
