import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa que l� um valor
	inteiro N e depois N n�meros inteiros.
	Ao final, mostra a soma dos N n�meros
	lidos
 */

/*
 * � Estrutura repetitiva "para"
	� Usar quando se sabe previamente a quantidade de repeti��es
	� �timo para fazer contagens (progressiva ou regressiva)
	� Regra:
 */

public class Para {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int entrada;
		int total = 0;

		System.out.println("Digite um valor inteiro, depois preencha os valores solicitados: : ");
		entrada = sc.nextInt();
		for (int i = 1; i <= entrada; i++) {
			System.out.print("Digite um valor inteiro: ");
			int soma = sc.nextInt();
			total += soma;
		}
		
		System.out.println("Soma de " + entrada + " n�meros: " + total);
		sc.close();
	}

}
