package fundamentos_02;

import java.util.Scanner;

public class exec05_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantos alunos tem na sala?");
		int al = entrada.nextInt();
		float somaNotas = 0; 
		int t = 1;
		for (t  = 0; t<al; t++){
			System.out.println("Digite a nota do aluno " + t + ":");
			double nota = entrada.nextDouble();
			somaNotas += nota;
		}
		float media = somaNotas/al;
		System.out.println("A média da turma é: " + media);
		
			
			
	}
	}

