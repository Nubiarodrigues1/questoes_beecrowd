package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Numerospares1059 {

	public static void main(String[] args) {
		//link da questão: https://www.beecrowd.com.br/judge/pt/problems/view/1059
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i<=100; i++){	
			if(i%2==0) {
				System.out.println(i);			
			}
		}	
	}
}
