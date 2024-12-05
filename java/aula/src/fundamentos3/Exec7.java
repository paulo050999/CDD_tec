package fundamentos3;

public class Exec7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto [] = {"a", "vida", "é", "bela"};
		String frase = new String();
		for (int x=0; x<texto.length-1;x>=0) {
			frase+=texto.toUpperCase()[x]+" ";
		}
		System.out.println(frase);
	}

	}

