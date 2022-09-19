package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Gastodecombustivel {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1017
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int velocidade = sc.nextInt();
		int tempo = sc.nextInt();
		int distancia;
		double litros;

		distancia = tempo * velocidade;
		litros = (double) distancia / 12.0;

		System.out.printf("foram gastos %.3f litros de combustivel", litros);
	}

}
