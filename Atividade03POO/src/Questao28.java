import java.util.Scanner;

public class Questao28 {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);

		float maior = 0;
		float menor = 0;
		float media = 0;
		float soma = 0;
		int x = 0;
		int n = 1;
		
		while (n != 0) {
			System.out.println("Insira a temperatura: ");
			int num = ent.nextInt();
			n = num;
			x++;
			if (n!=0)
			if (num > menor) {
				maior = num;
			} else {
				menor = num;
			}
			soma = num + soma;

		media = soma/x;
		
		}
			System.out.println("Menor: "+menor);
			System.out.println("Maior: "+maior);
			System.out.println("Media: "+media);
		
	
		ent.close();
	}

}
