package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class quadrante {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1115
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		while (true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (x == 0 && y == 0) {
				break;
			}
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			if (x > 0 && y < 0) {
				System.out.println("quarto");
			}
			if (x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
		}
	}

}
