import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);

		System.out.println("Digite o menor numero: ");
		int num1 = ent.nextInt();

		System.out.println("Digite o maior numero: ");
		int num2 = ent.nextInt();

		int n = num1;
		
		while (num1 < num2) {
			System.out.println(+num1);

			num1++;

		}
		System.out.println("soma: "+(n+num2));
		ent.close();
		
	}

}
