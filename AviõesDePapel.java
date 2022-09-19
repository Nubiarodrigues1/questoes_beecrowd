package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class AviõesDePapel {

	public static void main(String[] args) {
		// link da questão:https://www.beecrowd.com.br/judge/pt/problems/view/2339
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int p = sc.nextInt();
		int f = sc.nextInt();
		if (p / c >= f) {
			System.out.println("S");
		} else {
			System.out.println("N");
		}

	}

}
