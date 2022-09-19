package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Dominó {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/3046
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.printf("%d%n", ((N + 1) * (N + 2)) / 2);

	}

}
