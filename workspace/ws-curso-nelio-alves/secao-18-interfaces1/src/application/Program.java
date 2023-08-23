package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.CarRental;
import entities.Vehicle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String vehicle = sc.nextLine();
		System.out.print("Retirada (dd/MM/yyyy hh:mm");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(),fmt);
		System.out.print("Retorno (dd/MM/yyyy hh:mm");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(),fmt);
		System.out.print("Entre com o preço por hora:");
		System.out.print("Entre com o preço por dia:");
		
		CarRental cr = new CarRental(start,finish,new Vehicle(vehicle));
		
		
		
		sc.close();
	}

}
