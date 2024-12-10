package heranca;

public class Cavalo extends Mamifero {
		

	public Cavalo (String nome) {
		super(nome);
		
	}
	public void comer(String comida) {
		System.out.printf("O cavalo %S foi comer %s\n", nome, comida);
	}
	public void locomover(String c) {
		System.out.printf("O cavalo %S foi %s\n", nome, c);
	}
}

