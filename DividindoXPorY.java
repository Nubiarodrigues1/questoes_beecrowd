package beecrowd;

import java.util.Locale;
import java.util.Scanner;
public class DividindoXPorY {

	public static void main(String[] args) {
		// link da questão:https://www.beecrowd.com.br/judge/pt/problems/view/1116
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double n = sc.nextDouble();
		for(int i = 0;i<n; i++) {
			double x;
			x = sc.nextDouble();
			double y;
			y = sc.nextDouble();
			double divisao;
			divisao = x/y;
			if(y==0) {
				System.out.println("divisao impossivel");
			}else {
				System.out.printf("%.1f%n",divisao);
			}
		}
		sc.close();
	}
}



