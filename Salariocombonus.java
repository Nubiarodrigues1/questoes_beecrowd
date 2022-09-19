package beecrowd;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Salariocombonus {

	public static void main(String[] args) {
		//link da questão: https://www.beecrowd.com.br/judge/pt/problems/view/1009
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		String nome = sc.next();
		double salario = sc.nextDouble();
		double vendas = sc.nextDouble();
		double soma = salario + vendas * 0.15;
		System.out.println("TOTAL = R$ " + df.format(soma));
		
		sc.close();
	}
}
