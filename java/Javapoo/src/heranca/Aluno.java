package heranca;

public class Aluno extends Pessoa {
	public double nota;

public Aluno(String n, String c, String t) {
	super(n,c,t);
	
}
public void sofre() {
	System.out.printf("%S Vida de sofrimento", nome);
}
}
