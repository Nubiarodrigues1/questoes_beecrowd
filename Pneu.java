package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Pneu {

	public static void main(String[] args) {
		// Link da questão:https://www.beecrowd.com.br/judge/pt/problems/view/2374
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.printf("%d%n", a - b);

	}

}
