package entities;

import util.TesteDesconto;

public class Product implements Comparable<Product>, TesteDesconto {
	private String name;
	private Double price;

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return name.toUpperCase().compareTo(o.getName().toUpperCase());
	}

	@Override
	public boolean testPrice(double price) {
		if (price >= 1000.00) {
			System.out.println("Desconto aplicavel em: " + getName());
			return true;
		} else {
			System.out.println("Desconto não aplicavel em: " + getName());
			return false;
		}
	}

}