package beecrowd;
import java.util.Locale;
import java.util.Scanner;

public class Maioreposicao{

	public static void main(String[] args) {
		// link da questão:https://www.beecrowd.com.br/judge/pt/problems/view/1080
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int[]numero = new int[100];
		int maior = 0;
		int posicao = 0;
		
		for(int i = 0;i<100;i++){
			numero[i] = sc.nextInt();
		}
		for(int i = 0;i<100;i++){
			if(numero[i]>maior) {
				maior = numero[i];
				posicao = i+1;	
			}
		}
		System.out.println(maior);
		System.out.println(posicao);
	}

}
