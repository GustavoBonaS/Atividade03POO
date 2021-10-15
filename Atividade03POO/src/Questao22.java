import java.util.Scanner;

public class Questao22 {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);

		System.out.println("Insira o total de votantes");
		int votante = ent.nextInt();

		int cand1 = 0;
		int cand2 = 0;
		int cand3 = 0;

		for (int i = 0; i < votante; i++) {

			System.out
					.println("Insira o numero do candidato" + "|| Candidato 1= 1 / Candidato 2= 2 / Candidato 3= 3||");
			int cand = ent.nextInt();

			if (cand == 1) {
				cand1 = cand1 + 1;
			} else if (cand == 2) {
				cand2 = cand2 + 1;
			} else if (cand == 3) {
				cand3 = cand3 + 1;
			}

		}
		System.out.println("Numero de votos para o candidato 1 = " + cand1);
		System.out.println("Numero de votos para o candidato 2 = " + cand2);
		System.out.println("Numero de votos para o candidato 3 = " + cand3);
		ent.close();
	}

}
