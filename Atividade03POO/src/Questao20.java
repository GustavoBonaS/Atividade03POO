import java.util.Scanner;

public class Questao20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);

		System.out.println("Insira o total de notas: ");
		int total = ent.nextInt();

		float notaf = 0;
		float soma = 0;

		for (int i = 0; i < total; i++) {

			System.out.println("Insira a nota");
			float nota = ent.nextFloat();

			soma = nota + soma;

			notaf = soma / total;
		}

		System.out.println("Media final: " + notaf);
		ent.close();
	}

}
