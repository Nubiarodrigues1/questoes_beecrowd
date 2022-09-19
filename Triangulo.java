package beecrowd;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		// link da questão: https://www.beecrowd.com.br/judge/pt/problems/view/1043
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double ladoA = sc.nextDouble();
		double ladoB = sc.nextDouble();
		double ladoC = sc.nextDouble();
		double ladoMenor = 0;
		double ladoMenor2 = 0;
		double ladoMaior = 0;

		if (ladoA > ladoB && ladoA > ladoC) {
			ladoMaior = ladoA;
			ladoMenor2 = ladoB;
			ladoMenor = ladoC;
		} else if (ladoB > ladoA && ladoB > ladoC) {
			ladoMaior = ladoB;
			ladoMenor2 = ladoA;
			ladoMenor = ladoC;
		} else {
			ladoMaior = ladoC;
			ladoMenor2 = ladoA;
			ladoMenor = ladoB;
		}
		if ((ladoMenor + ladoMenor2) > ladoMaior && (ladoMenor + ladoMaior) > ladoMenor2
				&& (ladoMenor2 + ladoMaior) > ladoMenor) {
			DecimalFormat df = new DecimalFormat("0.0");
			System.out.println("Perimetro = " + df.format(ladoMenor + ladoMenor2 + ladoMaior));
		} else {
			DecimalFormat df = new DecimalFormat("0.0");
			System.out.println("Area = " + df.format(((ladoA + ladoB) * ladoC) / 2));

		}
		sc.close();
	}

}