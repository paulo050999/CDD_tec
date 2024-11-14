
public class Estruturas_condicionais_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Verifica se ele tem menos de 18 anos e se não é amigo do dono:
		int idade=15;
		boolean amigoDoDono=true;
		if(idade<18 && amigoDoDono == false) {
			System.out.println("Não pode entrar");
		}
		else {
			System.out.println("Pode entrar");
		}
	}

}
