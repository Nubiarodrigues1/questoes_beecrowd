package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class NotaEsquecida {

	public static void main(String[] args) {
		// link da questão: https://www.beecrowd.com.br/judge/pt/problems/view/3055
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b;
			int m = sc.nextInt();
			b = 2 * m - a;
			System.out.println(b);
		

	}

}
