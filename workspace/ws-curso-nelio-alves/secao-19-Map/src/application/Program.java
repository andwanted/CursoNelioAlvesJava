package application;

import java.util.HashMap;
import java.util.Map;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Product, Integer> stock = new HashMap<>();

		Product p1 = new Product("TV", 900.0);
		Product p2 = new Product("Notebook", 1200.0);
		Product p3 = new Product("Tablet", 400.0);

		stock.put(p1, 10000);
		stock.put(p2, 20000);
		stock.put(p3, 15000);
		
		Product ps = new Product("TV", 900.0);
		
		//saida antes de gerar metodo equals e hashcode para producto 
		//Contains 'ps' key: false
		//após gerar os metodos
		//Contains 'ps' key: true

		
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

	}

}
