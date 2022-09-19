package beecrowd;

import java.util.Locale;
import java.util.Scanner;

//https://www.beecrowd.com.br/judge/pt/problems/view/1073
public class QuadradoDePares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.printf("%d^2 = %d%n", i, i * i);
			}
		}
	}

}
