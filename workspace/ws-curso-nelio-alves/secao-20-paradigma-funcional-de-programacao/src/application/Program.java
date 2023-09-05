package application;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Integer sum = 0;
		for (Integer x : list) {
			sum += x;
		}
		
		Integer sum = list.stream().reduce(0, Integer::sum);

	}
}