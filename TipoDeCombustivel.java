package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class TipoDeCombustivel {

	public static void main(String[] args) {
		// link da questão: https://www.beecrowd.com.br/judge/pt/problems/view/1134
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		int cont2 = 0;
		int cont3 = 0;

		while (true) {
			int x = sc.nextInt();
			if (x == 4)
				break;
			if (x == 1)
				cont++;
			else if (x == 2)
				cont2++;
			if (x == 3)
				cont3++;

		}
		System.out.printf("MUITO OBRIGADO%nAlcool: %d%nGasolina: %d%nDiesel: %d%n", cont, cont2, cont3);
	}
}
