package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.copy.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Celular", 1050.00));
		list.add(new Product("HD", 450.00));
		list.add(new Product("Case", 150.00));

		// Implementa��o da interface
		// List<String> names = list.stream().map(new
		// UpperCaseName()).collect(Collectors.toList());
		// Reference method com m�todo est�tico
		// List<String> names =
		// list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
		// Reference method com m�todo n�o est�tico
		// List<String> names =
		// list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
		// Express�o lambda declarada
		// Function<Product, String> func = p -> p.getName().toUpperCase();
		// List<String> names = list.stream().map(func).collect(Collectors.toList());
		// Express�o lambda inline
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		names.forEach(System.out::println);

	}

}
