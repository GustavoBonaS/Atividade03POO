import java.util.Scanner;

public class Questao12 {

	public static void main(String[] args) {
	Scanner ent = new Scanner(System.in);
	
	System.out.print("Insira um numero: ");
	int n = ent.nextInt();
	
	int ultimo = 1;
	int penult = 1;
	int count = 0;
	int num = 0;
	
	if (n == 1 ||  n == 2){
	System.out.println("Numero na sequencia de Fibonacci = 1");
	
	}else {
		count = 3;
		
		while (count <= n) {
			num = ultimo + penult;
			penult = ultimo;
			ultimo = num;
			count +=1 ;
			
		}
	
		System.out.println("Numero na sequencia de Fibonacci = " +num);
	}

	ent.close();
	
	}

}
