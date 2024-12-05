package fundamentos3;

public class Exec6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto [] = {"a", "vida", "é", "bela"};
		String frase = new String();
		for (int x=0; x<texto.length;x++) {
			frase+=texto[x]+" ";
		}
		System.out.println(frase);
	}

}
