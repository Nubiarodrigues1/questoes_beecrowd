package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Preenchimentodevetor2 {

	public static void main(String[] args) {
		//https://www.beecrowd.com.br/judge/pt/problems/view/1177
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int t =sc.nextInt();
		int[] n = new int [1000];
		
		for(int i = 0; i<1000; i++) {
			n[i] = i %t;	
			System.out.printf("N[%d] = %d%n" , i, n[i] );
		}
	}
}
