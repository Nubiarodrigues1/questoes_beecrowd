package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class ConversaoDeTempo {

	public static void main(String[] args) {
		//https://www.beecrowd.com.br/judge/pt/problems/view/1019
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int valor = sc.nextInt();
		int hora = valor/(60*60);
		valor = valor%(60*60);
		int minuto = valor/60;
		valor = valor%60;
		int segundo;
		segundo = valor%60;
		
		System.out.println(hora + ":" + minuto + ":" + segundo); 
		

	}

}
