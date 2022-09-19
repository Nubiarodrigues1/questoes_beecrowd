package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class FatorialSimples {

	public static void main(String[] args) {
		// Link da questão: https://www.beecrowd.com.br/judge/pt/problems/view/1153
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int fatorial = 1;
		for(int i = 1; i<=n; i++) {
			fatorial*=i;
			
		}
		System.out.printf("%d%n", fatorial);
	}

}
