package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class NotasdaProva {

	public static void main(String[] args) {
		// Link da prova:https://www.beecrowd.com.br/judge/pt/problems/view/2344
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
			if(n==0) {
				System.out.println("E");
			}else if (n>=1 && n<=35) {
				System.out.println("D");	
			}else if ( n>=36 && n<=60) {
				System.out.println("C");
			}else if ( n>=61 && n<=85) {
				System.out.println("B");
			}else if ( n>=86 && n<=100){
				System.out.println("A");
				
			}
		}
	}



