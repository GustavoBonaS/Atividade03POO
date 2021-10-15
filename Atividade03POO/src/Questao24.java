import java.util.Scanner;

public class Questao24 {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);

		System.out.print("Insira a quantidade de CDs: ");
		int cd = ent.nextInt();
		float totalcd = 0;
		
		for (int i = 0; i < cd; i++) {
			System.out.print("Insira o valor de cada cd: ");
			float valor = ent.nextInt();

			totalcd = valor + totalcd;
		}
		System.out.println("Valor do investimento: R$" + totalcd);

		ent.close();
		
	}
	
	
}