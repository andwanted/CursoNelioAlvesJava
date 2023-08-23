package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Entre os dados do contrato: ");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), dtf);
		System.out.print("Valor do contrato: ");
		double value = sc.nextDouble();

		Contract obj = new Contract(number, date, value);

		System.out.print("Entre com o numero de parcelas: ");
		int parcelas = sc.nextInt();

		ContractService service = new ContractService(new PaypalService());
		service.processContract(obj, parcelas);

		System.out.println("Parcelas:");
		for (Installment installments : obj.getInstallments()) {
			System.out.println(installments.getAmount() + " " + installments.getDueDate());

		}

		sc.close();
	}

}
