package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Animal {
	// link da questao: https://www.beecrowd.com.br/judge/pt/problems/view/1049

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String palavra1 = sc.nextLine();
		String palavra2 = sc.nextLine();
		String palavra3 = sc.nextLine();
		sc.close();

		if (palavra1.equals("vertebrado") && palavra2.equals("ave") && palavra3.equals("carnivoro")) {
			System.out.println("aguia");
		} else if (palavra1.equals("vertebrado") && palavra2.equals("ave") && palavra3.equals("onivoro")) {
			System.out.println("pomba");
		} else if (palavra1.equals("vertebrado") && palavra2.equals("mamifero") && palavra3.equals("onivoro")) {
			System.out.println("homem");
		} else if (palavra1.equals("vertebrado") && palavra2.equals("mamifero") && palavra3.equals("herbivoro")) {
			System.out.println("vaca");
		} else if (palavra1.equals("invertebrado") && palavra2.equals("inseto") && palavra3.equals("hematofago")) {
			System.out.println("pulga");
		} else if (palavra1.equals("invertebrado") && palavra2.equals("inseto") && palavra3.equals("herbivoro")) {
			System.out.println("lagarta");
		} else if (palavra1.equals("invertebrado") && palavra2.equals("anelideo") && palavra3.equals("hematofago")) {
			System.out.println("sanguessuga");
		} else if (palavra1.equals("invertebrado") && palavra2.equals("anelideo") && palavra3.equals("onivoro")) {
			System.out.println("minhoca");
			sc.close();

		}

	}
}
