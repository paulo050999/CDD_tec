package Metodos;

public class lojaDeCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		carro Creta = new carro();
		carro Duster = new carro("Preto");
		carro Uno = new carro("Azul", "mille", 12.000);
		Uno.ligar();
		Uno.acelerar();
		Uno.frear();
		Uno.desligar();
		Uno.acelerar();
		honda rich = new honda("v4","mont", 15.000);
		rich.ligar();
	}
	
	

}
