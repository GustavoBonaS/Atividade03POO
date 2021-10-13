import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ent = new Scanner(System.in);

		System.out.print("Nome: ");
		String nome = ent.next();

		while (nome.length() <= 3) {
			System.out.print("Nome menor do que 3 caracteres. Digite o nome novamente: ");
			nome = ent.next();
		}

		System.out.print("Idade: ");
		int idade = ent.nextInt();

		while (idade < 0 && idade > 150) {
			System.out.print("Idade invalida. Digite a idade novamente: ");
			idade = ent.nextInt();
		}

		System.out.print("Salario: ");
		float salario = ent.nextFloat();

		while (salario < 0) {
			System.out.print("Salario Invalido. Digite novamente: ");
			salario = ent.nextFloat();
		}

		System.out.print("Insira o sexo- f ou m");
		String sexo = ent.next();

		while (!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m")) {
			System.out.print("Sexo invalido. Digite novamente: ");
			sexo = ent.next();
		}

		System.out.print("Estado civil: s, c, v, d.");
		String estado_civil = ent.next();

		while ((estado_civil.equalsIgnoreCase("s")) && (estado_civil.equalsIgnoreCase("c"))
				&& (estado_civil.equalsIgnoreCase("v")) && (estado_civil.equalsIgnoreCase("d"))) {
			System.out.print("Digite o estado civil novamente: ");
			estado_civil = ent.next();
		}
		System.out.println("Cadastro Concluido");

		ent.close();
	}

}
