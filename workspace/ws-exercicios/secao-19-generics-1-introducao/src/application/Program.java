package application;

import java.util.Scanner;

import entities.Sorteia;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Sorteia<Double> sorteia = new Sorteia<>();

		System.out.println("Digite quantos elementos serão sorteados: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um valor: ");
			Double valor = sc.nextDouble();
			sorteia.addValor(valor);
		}

		sorteia.apresentaResultado();

		sc.close();
	}

}
