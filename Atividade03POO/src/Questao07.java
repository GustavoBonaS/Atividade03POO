import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ent = new Scanner(System.in);

		System.out.println("Digite o menor numero: ");
		int num1 = ent.nextInt();

		System.out.println("Digite o maior numero: ");
		int num2 = ent.nextInt();

		while (num1 < num2) {
			System.out.println(+num1);

			num1++;

		}
		ent.close();
		
	}

}
