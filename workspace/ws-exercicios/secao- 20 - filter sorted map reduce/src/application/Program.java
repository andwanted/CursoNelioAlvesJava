package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> prod = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter full file path:");
		String path = sc.next();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			while (line != null) {
				String[] lin = line.split(",");
				String prodName = lin[0];
				Double price = Double.parseDouble(lin[1]);
				prod.add(new Product(prodName, price));
				System.out.println(line + " adicionado");
				line = br.readLine();
			}

			double avg = prod.stream().map(p -> p.getPrice()).reduce(0.0, (x, y) -> x + y) / prod.size();

			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

			List<String> names = prod.stream()
					.filter(p -> p.getPrice() < avg)
					.map(p -> p.getProduct())
					.sorted(comp)
					.collect(Collectors.toList());

			System.out.print("Average price: " + String.format("%.2f", avg));

			names.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}

		sc.close();
	}

}
