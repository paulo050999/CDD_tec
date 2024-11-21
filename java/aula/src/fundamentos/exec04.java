package fundamentos;
import java.util.Scanner;

public class exec04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma nota:");
		
		
		double nota1 = entrada.nextDouble();
		System.out.println("Digite outra nota:");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2 /2);
		
		System.out.println(media + "A média é");
		
		entrada.close();
		

	}

}
