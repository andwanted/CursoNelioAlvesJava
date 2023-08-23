package application;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

/*
	 * Uma empresa deseja automatizar o processamento de seus contratos.
	 * O processamento deum contrato consiste em gerar as parcelas a serem pagas para aquele contrato,
	 * com base non�mero de meses desejado.
	A empresa utiliza um servi�o de pagamento online para realizar o pagamento das parcelas.
	Os servi�os de pagamento online tipicamente cobram um juro mensal, bem como uma taxapor pagamento.
	Por enquanto, o servi�o contratado pela empresa � o do Paypal,
	que aplicajuros simples de 1% a cada parcela, mais uma taxa de pagamento de 2%.
	Fazer um programa para ler os dados de um contrato (n�mero do contrato, data do contrato,
	e valor total do contrato). Em seguida, o programa deve ler o n�mero de meses paraparcelamento do contrato,
	e da� gerar os registros de parcelas a serem pagas (data e valor),sendo a primeira parcela a ser paga um m�s ap�s a data do contrato,
	a segunda parcela doismeses ap�s o contrato e assim por diante. Mostrar os dados das parcelas na tela.
	 */

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		// TODO Auto-generated method stub
		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		int contractNumber = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate contractDate = LocalDate.parse(sc.next(),fmt);
		System.out.print("Valor do contrato: ");
		double contractValue = sc.nextDouble();
		
		Contract obj = new Contract(contractNumber,contractDate,contractValue);

		System.out.print("Entre com o numero de parcelas: ");
		int numberInstallments = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		
		contractService.processContract(obj, numberInstallments);
	
		
		System.out.println("Parcelas: ");
		for(Installment installment : obj.getInstallments()) {
			System.out.println(installment);
		}

		sc.close();
	}

}
