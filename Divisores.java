package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Divisores {

	public static void main(String[] args) {
		// Link da questão: https://www.beecrowd.com.br/judge/pt/problems/view/1157
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
	}

}
