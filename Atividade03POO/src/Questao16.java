import java.util.Scanner;

public class Questao16 {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);

		int maior = 0;
		int menor = 0;
		int soma = 0;
		int n = 1;
		
		while (n != 0) {
			System.out.println("Insira um numero: ");
			int num = ent.nextInt();
			n = num;
			if (n!=0)
			if (num > menor) {
				maior = num;
			} else {
				menor = num;
			}
			soma = (maior + menor);

		}
			System.out.println("Menor: "+menor);
			System.out.println("Maior: "+maior);
			System.out.println("Soma" + soma);
		
	
		ent.close();
	}

}
