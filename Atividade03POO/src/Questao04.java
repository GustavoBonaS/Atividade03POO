import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);

		System.out.println("População do país A: ");
		double a = ent.nextDouble();

		System.out.println("Taxa de crescimento do país A: ");
		double taxa1 = ent.nextDouble();

		System.out.println("População do país B: ");
		double b = ent.nextDouble();

		System.out.println("Taxa de crescimento do país B: ");
		double taxa2 = ent.nextDouble();

		int ano = 0;

		while (a <= b) {
			a = a + (a * taxa1);
			b = b + (b * taxa2);

			ano = ano + 1;

		}
		System.out.println("Anos necessarios: " + ano);
		ent.close();

	}

}
