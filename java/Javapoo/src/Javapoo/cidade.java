package Javapoo;
public class cidade {

	public static void main(String[] args) {
		pessoa p1 = new pessoa();
		pessoa p2 = new pessoa();
		p1.cadastro();
		p2.cadastro();
		System.out.printf("%s tem %d anos e pesa %.2f quilos", p1.nome,p1.idade,p1.peso);
		p1.comer();
		
	}
	
}

