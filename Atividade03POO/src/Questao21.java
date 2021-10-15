import java.util.Scanner;

public class Questao21 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Insira o total de pessoas: ");
		int total = ent.nextInt();

		float idadef = 0;
		float soma = 0;

		for (int i = 0; i < total; i++) {

			System.out.println("Insira a idade");
			float idade = ent.nextFloat();

			soma = idade + soma;

			idadef = soma / total;
		}

		System.out.println("Media de idade " + idadef);
		
		if (idadef <= 25) {
			System.out.println("Turma jovem");
			
		} else if (idadef >= 26 && idadef < 60) {
			System.out.println("Turma adulta");
			
		}else if (idadef > 60){
			System.out.println("Turma Idosa");
		}
		
		ent.close();
	}

}
