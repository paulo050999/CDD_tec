package fundamentos;
import java.util.Scanner;
public class exec2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

        // Solicita os três números ao usuário
        System.out.print("Digite o primeiro número: ");
        int numero1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = entrada.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = entrada.nextInt();

        // Variável para armazenar o maior número
        int maior;

        // Verifica qual é o maior número
        if (numero1 >= numero2 && numero1 >= numero3) {
            maior = numero1;
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            maior = numero2;
        } else {
            maior = numero3;
        }

        // Mostra o maior número
        System.out.println("O maior número é: " + maior);

        // Fecha o objeto Scanner
        entrada.close();
	}

}
