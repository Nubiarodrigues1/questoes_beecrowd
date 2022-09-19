package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class IdentificandoOCha {

	public static void main(String[] args) {
		// Link da questão:https://www.beecrowd.com.br/judge/pt/problems/view/2006
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int cont = 0;
		for (int i = 0; i < 5; i++) {
			if (sc.nextInt() == t) {
				cont++;
			}
		}
		System.out.println(cont);
	}

}
