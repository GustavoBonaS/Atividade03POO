import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);

		System.out.println("Digite o user: ");
		String user = ent.next();
		System.out.println("Digite a senha: ");
		String pass = ent.next();

		while (user.equals(pass)) {
			System.out.println("Usuario e senha iguais. Digite novamente");
			System.out.println("Digite o user: ");
			user = ent.next();
			System.out.println("Digite a senha: ");
			pass = ent.next();

		}
		System.out.println("Login efetuado");

		ent.close();

	}
}
