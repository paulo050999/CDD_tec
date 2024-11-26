package fundamentos_02;

public class Arrway01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arrayNum= {87,68,52,5,49,83,45,12,64};
		int total = 0;
		// ADICIONA O VALOR DE CADA ELEMENTO AO TOTAL
		for(int i:arrayNum) {
			total+=i;
			System.out.printf("Soma dos elementos arrayNum:%d\n",total);
			
	}

}
}