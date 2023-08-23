import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em
	Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite "s", repetir o
	programa.
	Fórmula:  =
	 + 32
 */

/*
 * • Estrutura repetitiva "faça-enquanto"
	• O bloco de comandos executa pelo menos uma vez, pois a condição é verificada no final.
	• Regra:
	• V: volta
	• F: pula fora
 */

public class FacaEnquanto {

	public static double soma(double soma) {
		soma = 9 * soma / 5 + 32;
		return soma;
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char op;

		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double entrada = sc.nextDouble();
			System.out.printf("Equivalente em Fahrenheit: : " + String.format("%.1f", soma(entrada)) + "\n");
			System.out.print("Deseja repetir (s/n) ");
			op = sc.next().charAt(0);
		} while (op == 's');

		sc.close();
	}

}
