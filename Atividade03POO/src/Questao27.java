import java.util.Scanner;

public class Questao27 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		float preco = 1;
		float total = 0;
		int i = 0;
		while (preco != 0) {
			
			System.out.print("Insira o valor do produto: ");
			preco = ent.nextFloat();
			total = preco + total;
			i++;
			System.out.println("Apertar 0 para finalizar a compra");
			System.out.println("LOJAS TABAJARA");
			System.out.println("Produto" + i + " = " + preco);
		
		}
		System.out.println("Total da compra: " + total);
		System.out.println("Insira o dinheiro: ");
		float dinheiro = ent.nextFloat();
		System.out.println("Dinheiro: R$" +dinheiro);

		float troco = dinheiro - total;

		System.out.println("Troco: R$" + troco);

	}
}
