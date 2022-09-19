package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class QuantaMandioca {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/2936
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		int curupira = 300;
		int x = sc.nextInt();
		soma += x * curupira;
		int boitata = 1500;
		x = sc.nextInt();
		soma += x * boitata;
		int boto = 600;
		x = sc.nextInt();
		soma += x * boto;
		int mapinguari = 1000;
		x = sc.nextInt();
		soma += x * mapinguari;
		int iara = 150;
		x = sc.nextInt();
		soma += x * iara;
		System.out.println(soma + 225);

	}

}
