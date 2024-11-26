package fundamentos_02;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int a[] = new int[4];
		int b[] = new int[4];
		int c[] = new int[4];
		int d[] = new int[4];
		for (int i=0; i<a.length;i++){
			System.out.println("Digite o valor para o array A");
			a[i]=entrada.nextInt();
			System.out.println("Digite o valor para o array B");
			b[i]=entrada.nextInt();
			System.out.println("Digite o valor para o array C");
			c[i]=entrada.nextInt();
			System.out.println("Digite o valor para o array A");
			a[i]=entrada.nextInt();
	}
		for (int j: a) {
			System.out.println(j+" ");
		}
		for (int j: b) {
			System.out.println();
			System.out.println(j+" ");
}
}