package heranca;

public abstract class Animal {
		public String nome;


public Animal(String nome) {
	this.nome=nome;
	
}
public void comer() {
	System.out.println("Foi comer");
}

public void locomover() {
	System.out.println("Foi...");
}
}