import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);

		int x = 0;

		for (x = 0; x < 10; x++) {
			System.out.println("Digite a nota entre 0 e 10");
			double nota = ent.nextDouble();
			if (nota < 10)
				System.out.println("Valor invalido. Digite novamente");
			if (nota > 10)
				System.out.println("Valor invalido. Digite novamente");

		}

		ent.close();
	}

}
