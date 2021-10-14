import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);

		int par = 0;
		int impar = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print("Insira um numero: ");
			int n = ent.nextInt();

			if (n % 2 == 0) {
				par++;

			} else {
				impar++;

			}

		}
		System.out.println("Numero de par: " + par);
		System.out.println("Numero de impar: " + impar);
		ent.close();

	}

}
