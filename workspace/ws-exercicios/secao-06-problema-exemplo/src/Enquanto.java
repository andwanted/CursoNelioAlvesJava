import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa que l� n�meros	inteiros at� que um zero seja lido.
 * Ao final mostra a soma dos n�meros lidos
 * 
 */

/*
 	* Estrutura repetitiva "enquanto"
	� Recomendada quando n�o se sabe previamente a quantidade de
	repeti��es
	� Regra:	� V: executa e volta	� F: pula fora
 */

public class Enquanto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int entrada = 0;
		int resultado = 0;

		do {
			System.out.println("Digite um valor diferente de zero: ");
			entrada = sc.nextInt();
			resultado += entrada;

		} while (entrada != 0);

		System.out.println("Saida: " + resultado);

		sc.close();
	}

}
