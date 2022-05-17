package lacos;



import java.util.Scanner;

public class lacos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num, soma = 0;
		
		do {
			System.out.println("Digite um número: (Se o número digitado for igual a 0, o programa será encerrado.)");
			num = scan.nextInt();
			soma = soma + num;
			
		} while (num > 0);
		System.out.println("A soma dos valores digitados é de: " + soma);

		scan.close();
	}

}