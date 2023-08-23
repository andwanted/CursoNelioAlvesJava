import java.util.Locale;
import java.util.Scanner;

/*
Uma operadora de telefonia cobra R$ 50.00 por um plano básico que
dá direito a 100 minutos de telefone. Cada minuto que exceder a
franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
quantidade de minutos que uma pessoa consumiu, daí mostrar o valor
a ser pago*/

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos minutos foram usados? ");
		int min = sc.nextInt();
		double despesaExtra = 0.0;
		if(min > 100) {
			double diferenca = min - 100;
			despesaExtra = 2.00 *  diferenca;
			System.out.print("Minutos consumidos: " + min + "\n");
			System.out.printf("Despesa extra: R$" + String.format("%.2f", despesaExtra));
		}else {
			System.out.println("Não houve despesa extra!");
		}		
		
		
		sc.close();
	}

}
