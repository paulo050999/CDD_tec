package fundamentos_02;

public class Exec06_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Soma3 = 0;
		int Soma5 = 0;
		int SomaMultiplos = 0;
		for (int i = 1; i<21; i++) {
			if(i % 3 == 0) {
				Soma3+=i;
			}
		 if (i % 5 == 0) {
			 Soma5+=i;
		}
		 SomaMultiplos = Soma3+Soma5;
		 
			
	}
		System.out.println("A soma dos múltiplos de 3 até 20 é: " + Soma3);
		System.out.println("A soma dos múltiplos de 5 até 20 é: " + Soma5);
		System.out.println("A soma dos múltiplos de 3 e 5 é: " + SomaMultiplos);
	}
}
