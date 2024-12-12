package encapsulamento;

public class Animal {
	private String nome;
	private String Tutor;
	private String RG;
	private String Raça;
	private String MêsAniversário;
	private int Idade;
	
	public void AjustarNome(String nome) {
		this.nome=nome;
		
	}
	public void mostrarNome() {
	System.out.println(this.nome);

	}
}