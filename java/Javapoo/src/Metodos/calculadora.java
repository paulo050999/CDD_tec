package Metodos;

public class calculadora {
	public static void main(String[] args) {
		operacoes calc = new operacoes();
		int resultado =calc.somar(15,8);
		System.out.println(resultado);
		resultado = calc.somar(10, 10,10);
		System.out.println(resultado);
	}

}
