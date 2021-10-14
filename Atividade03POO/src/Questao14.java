import java.util.Scanner;

public class Questao14 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Insira um numero: ");
		int cont = ent.nextInt();
		
		int num1 = 1;
		int num2 = 1;
		
		for (int i = 0; i < cont; i++) {
			System.out.print(+num1+ "/"+num2 + " + ");
			num1++;
			num2 = num2 + 2;
		}
		
		ent.close();
	}

}
