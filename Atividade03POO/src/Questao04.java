import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);

		System.out.println("Popula��o do pa�s A: ");
		double a = ent.nextDouble();

		System.out.println("Taxa de crescimento do pa�s A: ");
		double taxa1 = ent.nextDouble();

		System.out.println("Popula��o do pa�s B: ");
		double b = ent.nextDouble();

		System.out.println("Taxa de crescimento do pa�s B: ");
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
