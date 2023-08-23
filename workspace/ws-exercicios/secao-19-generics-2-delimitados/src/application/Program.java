package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import services.CalculaMax;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> value = new ArrayList<>();
		value.add(new Product("Produto 1", 12));
		value.add(new Product("Produto 2", 31));
		value.add(new Product("Produto 3", 5));

		CalculaMax calc = new CalculaMax();

		System.out.println(calc.max(value));

	}

}
