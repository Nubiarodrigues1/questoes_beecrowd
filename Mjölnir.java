package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Mjölnir {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1865
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 0; i<num;i++) {
			String nome = sc.next();
			int forca = sc.nextInt();
		
			if(nome.equals("Thor")) {
				System.out.println("Y");	
			}else {
				System.out.println("N");
			}
		}

	}

}

