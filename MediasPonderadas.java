package beecrowd;

import java.util.Locale;
import java.util.Scanner;
//https://www.beecrowd.com.br/judge/pt/problems/view/1079
public class MediasPonderadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0;i<n;i++){
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double resultado = ( ( (a*2) + (b*3) + (c*5))/10 );
			System.out.printf("%.1f%n",resultado);
		}
	}

}
