import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Insira a base: ");
		int base = ent.nextInt();
		
		System.out.println("Insira o expoente: ");
		int exp = ent.nextInt();
		
		double resultado = 0; 
		
		for (int i = 0; i < exp; i++) {
			resultado = base*base;
			resultado = base*resultado;
			
		}
		System.out.println(+ resultado);
		ent.close();
	}

}
