package Metodos;

public class honda extends carro {
	
	String motor ;
	public honda() {


}
	public honda(String motor, String modelo, double preco) {
		super(modelo,preco);
		this.motor=motor;
	}
}
