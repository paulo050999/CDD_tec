package heranca;

public class Prof extends Pessoa{
	public double salario;
	

public Prof (String n, String c, String t) {
	super(n,c,t);
	
}
public void certifica() {
	System.out.println("O prof certificou os alunos...");
}

public void diversao() {
	System.out.println("Foi ali reprovar um aluno...");
}
}