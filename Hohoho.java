package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Hohoho {
	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1759
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int ho = sc.nextInt();
		for (int i = 1; i < ho; i++) {
			System.out.printf("Ho ");
		}
		System.out.println("Ho!");
	}

}
