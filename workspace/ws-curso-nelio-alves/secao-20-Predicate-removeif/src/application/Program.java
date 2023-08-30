package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("HD Case", 80.00));

		// implementando interface
		// list.removeIf(new ProductPredicate());
		// Reference method com metodo estatico // Referencia para metodo
		// list.removeIf(Product::staticProductPredicate);
		// Referenc method com metodo nao estatico
		// list.removeIf(Product::nonStaticProductPredicate);
		// Expressao lambda declarada
		// double min = 500.0;
		// Predicate<Product> pred = p -> p.getPrice() >= min;
		// list.removeIf(pred);
		// Expressão lambda inline
		//list.removeIf(p -> p.getPrice() >= 100);

		for (Product p : list) {
			System.out.println(p);
		}

	}

}
