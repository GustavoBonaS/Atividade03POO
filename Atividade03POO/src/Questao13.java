import java.util.Scanner;

public class Questao13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ent = new Scanner(System.in);
		double num = ent.nextDouble();

		double f = num;

		while (num > 1) {
			f = f * (num - 1);
			num--;
		}

		ent.close();
	}

}
