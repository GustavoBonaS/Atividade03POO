import java.util.Scanner;

public class Questao26 {

	public static void main(String[] args) {
		 Scanner ent = new Scanner(System.in);
		 System.out.println("Informe o pre�o do p�o: ");
		 float pao = ent.nextFloat();
		 System.out.println("Panificadora P�o de Ontem - Tabela de pre�os");
		 System.out.println("----------------------------------");
		 for (int i = 0; i <= 50; i++) {
		 float tab = (i*pao);
			System.out.println(+i+" p�es = "+tab);
		}
		 ent.close();
	}

}
