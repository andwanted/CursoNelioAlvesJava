package application;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contrato;
import model.service.ServicoContrato;
import model.service.ServicoPaypal;
import model.entities.Parcelas;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato: ");
		System.out.print("Numero: ");
		int numeroContrato = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate dataContrato = LocalDate.parse(sc.next(),dtf);
		System.out.print("Valor do contrato: ");
		double valorContrato = sc.nextDouble();
		
		Contrato obj = new Contrato(numeroContrato,dataContrato,valorContrato);
		
		System.out.print("Entre com o numero de parcelas: ");
		int quantidadeParcelas = sc.nextInt();
		
		ServicoContrato servicocontrato = new ServicoContrato(new ServicoPaypal());
			
		servicocontrato.processarContrato(obj, quantidadeParcelas);
				
		System.out.println("Parcelas");
		for(Parcelas parcelas : obj.getParcelas()) {
			System.out.println(parcelas);
		}
		
		sc.close();
	}

}
