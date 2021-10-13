import java.util.Scanner;

public class Questao09 {

	public static void main(String[] args) {
		
	Scanner ent = new Scanner(System.in);
	
	System.out.println("Informa a tabuada: ");
	int tab = ent.nextInt();
	
	final int tam = 10;
	
	for (int n = 0; n < tam; n++) {
		System.out.println(tab + "x" + n + "=" + (tab * n));
		
	}
	ent.close();
	}

}
