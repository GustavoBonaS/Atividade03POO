import java.util.Scanner;

public class Questao26 {

	public static void main(String[] args) {
		 Scanner ent = new Scanner(System.in);
		 System.out.println("Informe o preço do pão: ");
		 float pao = ent.nextFloat();
		 System.out.println("Panificadora Pão de Ontem - Tabela de preços");
		 System.out.println("----------------------------------");
		 for (int i = 0; i <= 50; i++) {
		 float tab = (i*pao);
			System.out.println(+i+" pães = "+tab);
		}
		 ent.close();
	}

}
