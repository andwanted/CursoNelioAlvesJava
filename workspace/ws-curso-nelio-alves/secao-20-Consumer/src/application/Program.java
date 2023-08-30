package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;

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

		// Implementação da interface
		// list.forEach(new PriceUpdate());
		// Reference method com método estático
		// list.forEach(Product::staticPriceUpdate);
		// Reference method com método nao estático
		// list.forEach(Product::nonStaticPriceUpdate);
		// Expressão lambda declarada
//		double factor = 1.1;
//		Consumer<Product> cons = p -> {
//			p.setPrice(p.getPrice() * factor);
//		};
//		list.forEach(cons);
		//Expressão lambda inline
		list.forEach(p -> p.setPrice(p.getPrice() * 1.1));

		list.forEach(System.out::println);

	}

}
