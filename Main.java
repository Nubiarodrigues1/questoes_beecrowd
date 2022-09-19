package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// link da questão: https://www.beecrowd.com.br/judge/pt/problems/view/1113
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		while (x != y) {
			if (x > y) {
				System.out.println("Decrescente");
			} else {
				System.out.println("Crescente");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}

		sc.close();

	}

}
