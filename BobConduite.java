package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class BobConduite {

	public static void main(String[] args) {
		// Link da questão:https://www.beecrowd.com.br/judge/pt/problems/view/1589
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i= 0; i<num;i++) {
			int R1 = sc.nextInt();
			int R2 = sc.nextInt();
			System.out.printf("%d%n", R1+R2);
		}

	}

}
