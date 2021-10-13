import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);

		int n = 1;

		while (n <= 50) {
			if (n % 2 == 1)
				System.out.print(+n);
			n++;

		}

		ent.close();

	}

}
