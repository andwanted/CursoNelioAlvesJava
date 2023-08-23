package application;

import java.util.HashSet;
import java.util.Set;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Set<Product> set = new HashSet<>();
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		Product prod = new Product("Notebook", 1200.0);
		
		//sem a implementação este trecho é falso, pois esta comparando a referencia na memória
		//após a implementação automatica dos métodos equals e hashcode a comparação passa ser verdadeira
		System.out.println(set.contains(prod));

	}

}