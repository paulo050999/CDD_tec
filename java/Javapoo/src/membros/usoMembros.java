package membros;

public class usoMembros {
	
	public static void main(String[] args) {
		dataNascimento dt = new dataNascimento();
		dataNascimento dt2 = new dataNascimento();
		dt.dia=12;
		dt.mes=02;
		dt.ano=1991;
		dt2.dia=25;
		dt2.mes=01;
		dt2.ano=1992;
		System.out.printf("A data de nascimento"
				+ "é %d %d %d \n", dt.dia, dt.mes, dt.ano );
		System.out.printf("A data de nascimento"
				+ "é %d %d %d", dt2.dia, dt2.mes,dt2.ano);
	}

}
