import java.util.Scanner;

public class Questao23 {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);

		System.out.print("Insira a quantidade de turmas: ");
		int turmas = ent.nextInt();
		float media = 0;

		for (int i = 0; i < turmas; i++) {
			System.out.print("Insira a quantidade de alunos de cada turma: ");
			int alunos = ent.nextInt();

			if (alunos <= 40) {

			}

			media = ((media * i) + alunos) / (i + 1);
		}
		System.out.println("Media de alunos: " + media);

		ent.close();

	}

}
