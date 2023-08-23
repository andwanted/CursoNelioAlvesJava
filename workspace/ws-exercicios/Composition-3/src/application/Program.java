package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;

import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date clientBdate = sdf.parse(sc.next());

		Client client = new Client(name, email, clientBdate);

		System.out.println("Enter order data:");
		System.out.print("Status: ");

		OrderStatus status = OrderStatus.valueOf(sc.next());

		Order order = new Order(new Date(), status, client);

		System.out.print("How many items to this order?");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter #" + (i + 1) + " item data:");
			System.out.print("Product name: ");
			String prodName = sc.next();
			System.out.print("Product price: ");
			double prodPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int prodQuantity = sc.nextInt();

			OrderItem orderItem = new OrderItem(prodQuantity, prodPrice, new Product(prodName, prodPrice));

			order.addItem(orderItem);

		}

		System.out.println("ORDER SUMMARY:");
		System.out.println(order.toString());

		sc.close();
	}

}
