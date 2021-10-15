import java.util.Scanner;

public class Questao29 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		int inicio = 1;
		int fim = 10;	
		
		while (inicio < fim) {
			System.out.println("Digite a tabuada desejada");
			int tabuada = ent.nextInt();
			System.out.println("Por qual numero começar? ");
			inicio = ent.nextInt();
			System.out.println("Até qual numero ir? ");
			fim = ent.nextInt();
				if(inicio >= fim) {
					System.out.println("O Numero final é menor que o Numero inicial");
				}
		
		
		System.out.println("Montar a tabuada de: "+tabuada);
		System.out.println("Começar por: "+inicio);
		System.out.println("Terminar em: "+fim);
		
		
		while(inicio < (fim + 1)) {
			System.out.println(+tabuada+ " X " +inicio+ " = " + tabuada * inicio);
			inicio = inicio + 1;
		}
		}
		
		ent.close();
	}
	}
