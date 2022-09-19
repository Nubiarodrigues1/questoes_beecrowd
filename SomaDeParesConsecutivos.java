package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class SomaDeParesConsecutivos {

	public static void main(String[] args) {
		// link da questão:https://www.beecrowd.com.br/judge/pt/problems/view/1159
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		while (x != 0) {
			int soma = 0;
			if (x % 2 != 0) {
				x += 1;
			}
			int par = 0;
			for (int i = x; par != 5; i += 2) {
				soma += i;
				par++;
			}
			System.out.println(soma);
			x = sc.nextInt();
		}
	}

}