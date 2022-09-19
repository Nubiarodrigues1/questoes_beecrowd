package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Numerospositivos1060 {

	public static void main(String[] args) {
		// link da questão:https://www.beecrowd.com.br/judge/pt/problems/view/1060
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = 6;
		int quantidadepositivos = 0;
		for(int i = 0; i<n; i++) {
			double valor = sc.nextDouble();
			if(valor > 0) {
				quantidadepositivos +=1;
				
			}
		}
		System.out.println(quantidadepositivos + " valores positivos");
	}

}
