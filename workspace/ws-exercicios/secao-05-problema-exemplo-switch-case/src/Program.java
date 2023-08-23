import java.util.Locale;
import java.util.Scanner;

/*
 * Problema exemplo
	Fazer um programa para ler um valor inteiro de 1 a 7 representando um
	dia da semana (sendo 1=domingo, 2=segunda, e assim por diante).
	Escrever na tela o dia da semana correspondente, conforme exemplos.
 */

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String dia = null;
		System.out.print("Digite o dia da semana em número: ");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça-feira";
		case 4:
			dia = "quarta-feira";
		case 5:
			dia = "quinta-feira";
		case 6:
			dia = "sexta-feira";
		case 7:
			dia = "sabado";

		}
		System.out.println("Dia da semana: " + dia + " em switch-case");

		dia = null;

		System.out.print("Digite o dia da semana: ");
		n = sc.nextInt();
		if (n == 1) {
			dia = "domingo";
		}
		if (n == 2) {
			dia = "segunda-feira";
		}
		if (n == 3) {
			dia = "terça-feira";
		}
		if (n == 4) {
			dia = "quarta-feira";
		}
		if (n == 5) {
			dia = "quinta-feira";
		}
		if (n == 6) {
			dia = "sexta-feira";
		}
		if (n == 7) {
			dia = "sabado";
		}
		System.out.println("Dia da semana " + dia + " com if");

		sc.close();
	}

}
