package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Lanche {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1038
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();

		switch (codigo) {
		case 1:
			System.out.printf("Total: R$ %.2f%n", (quantidade * 4.00));
			break;
		case 2:
			System.out.printf("Total: R$ %.2f%n", (quantidade * 4.50));
			break;
		case 3:
			System.out.printf("Total: R$ %.2f%n", (quantidade * 5.00));
			break;
		case 4:
			System.out.printf("Total: R$ %.2f%n", (quantidade * 2.00));
			break;
		case 5:
			System.out.printf("Total: R$ %.2f%n", (quantidade * 1.50));
			break;
		default:
			break;
		}

	}

}
