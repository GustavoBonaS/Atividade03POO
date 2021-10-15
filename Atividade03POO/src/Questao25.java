import java.util.Scanner;

public class Questao25 {

	public static void main(String[] args) {
		 Scanner ent = new Scanner(System.in);
		 
		 System.out.println("Loja Quase Dois - Tabela de preços");
		 System.out.println("----------------------------------");
		 for (int i = 0; i <= 50; i++) {
		 double tab = (i*1.99);
			System.out.println(+i+" produtos = "+tab);
		}
		 ent.close();
	}

}
