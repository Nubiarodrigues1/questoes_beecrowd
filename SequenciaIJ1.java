package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class SequenciaIJ1 {

	public static void main(String[] args) {
		// https://www.beecrowd.com.br/judge/pt/problems/view/1095
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1,j=60;j>=0; i+=3, j-=5) {
			System.out.println("I=" + i +" J=" + j);
		}
	}

}
