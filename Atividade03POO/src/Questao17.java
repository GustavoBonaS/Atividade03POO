import java.util.Scanner;

public class Questao17 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe um n�mero: ");
		int num = entrada.nextInt();

		int i = 0;

		while (i <= num) {
			if (num % 2 == 1) {
				i = i + 1;
				System.out.println("Primo");
				break;
			} else {
				System.out.println("N�o primo");
				break;
			}
		}
		entrada.close();
	}

}
