package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class SeisNumerosImpares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// https://www.beecrowd.com.br/judge/pt/problems/view/1070
		int x = sc.nextInt();
		for (int i = 0; i < 6; i++) {
//			x = x%2==0 ? x+1 : x;
			if (x % 2 == 0) {
				x += 1;
			}
			// System.out.println(x%2==0 ? x+1 : x);
			System.out.println(x);
			x += 2;
		}
	}

}
