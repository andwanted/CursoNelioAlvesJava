package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			sc.nextLine();
			System.out.print("Initial balance: ");
			double initialBalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();

			Account acc = new Account(number, holder, initialBalance, withdrawLimit);

			System.out.print("Enter amount for withdaw: : ");
			double amount = sc.nextDouble();
			acc.withdraw(amount);

			System.out.printf("New balance: " + String.format("%.2f", acc.getBalance()));

		} catch (DomainException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		sc.close();
	}

}
