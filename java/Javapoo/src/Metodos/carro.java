package Metodos;

public class carro {
	public String cor;
	public String modelo;
	public double preco;

	public carro() {

	}

	public carro(String cor) {
		this.cor = cor;

	}
	
	public carro(String modelo, double preco) {
		this.modelo=modelo;
		this.preco=preco;
	}

	public carro(String cor, String modelo, double preco) {
		this.cor = cor;
		this.modelo = modelo;
		this.preco = preco;
	}

	private boolean ligado = false;
	private boolean acelerar;

	void ligar() {
		if (!ligado) {
			System.out.println(modelo + " ligou");
			ligado = true;
		} else {
			System.out.println(modelo + " já está ligado");

		}
	}

	void desligar() {
		if (ligado) {
			System.out.println(modelo + " desligou");
			ligado = false;
		} else {
			System.out.println(modelo + " já está desligado");

		}
	}

	void abastecer() {
		System.out.println(modelo + " abasteceu");

	}

	void frear() {
		if (acelerar) {
			System.out.println(modelo + " freiou");
			acelerar = false;
		} else {
			System.out.println(modelo + " já está freiado");

		}
	}

	void acelerar() {

		if ((!acelerar) && ligado)  {
			System.out.println(modelo + " acelerou");
			acelerar = true;
			
		} else if(ligado) {
			System.out.println(modelo + " já está acelerando");

		
	} else {
		System.out.println(modelo + " está desligado");
		
	}
	}
}
