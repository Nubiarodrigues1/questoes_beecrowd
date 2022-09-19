package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class TopN {

	public static void main(String[] args) {
		// Link da questão:https://www.beecrowd.com.br/judge/pt/problems/view/1943
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		if(k==1) {
			System.out.println("Top 1");
		}else if (k>1 && k<=3) {
			System.out.println("Top 3");
		}else if (k>3 && k<=5) {
			System.out.println("Top 5");
		}else if (k>5 && k<=10) {
			System.out.println("Top 10");
		}else if (k>10 && k<=25) {
			System.out.println("Top 25");
		}else if (k>25 && k<=50) {
			System.out.println("Top 50");
		}else if (k>50 && k<=100) {
			System.out.println("Top 100");
		}

	}

}
