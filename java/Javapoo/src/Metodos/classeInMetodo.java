package Metodos;

public class classeInMetodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaMetodos j1 = new JavaMetodos();
		int anos = j1.idade();
		System.out.println("A pessoa tem  " + anos + " Anos de idade");
		double dinheiro = j1.valor();
		System.out.println("A pessoa tem " + dinheiro + " Em dinheiro");
		String nomes = j1.nome();
		System.out.println("O nome da pessoa é " + nomes);
		boolean civil = j1.estado();
		System.out.println("O estado da pessoa é " + civil);
		
		
		
		
	}

}
