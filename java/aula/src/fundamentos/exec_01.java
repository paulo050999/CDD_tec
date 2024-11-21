
package fundamentos;
import java.util.Scanner;
public class exec_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

        // Solicita que o usuário digite um valor
        System.out.print("Digite um número: ");
        double valor = entrada.nextDouble();

        if (valor > 0) {
            System.out.println("O número é positivo.");
        } else if (valor < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }

        // Fecha o objeto Scanner
        entrada.close();
	}

}
