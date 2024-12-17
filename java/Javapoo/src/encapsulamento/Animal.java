package encapsulamento;

public class Animal {
	private String nome;
	private String Tutor;
	private String RG;
	private String Raça;
	private String MêsAniversário;
	private int Idade;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTutor() {
		return Tutor;
	}
	public void setTutor(String tutor) {
		Tutor = tutor;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public String getRaça() {
		return Raça;
	}
	public void setRaça(String raça) {
		Raça = raça;
	}
	public String getMêsAniversário() {
		return MêsAniversário;
	}
	public void setMêsAniversário(String mêsAniversário) {
		MêsAniversário = mêsAniversário;
	}
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
	}
	
}