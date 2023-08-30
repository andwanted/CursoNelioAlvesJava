package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import util.MyComparator;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		list.sort(new MyComparator());
		list.forEach(item -> System.out.println(item));
		list.forEach(item -> item.testPrice(item.getPrice()));

	}

}
