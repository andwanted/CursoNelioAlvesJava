package entities;

public class Product {
	private String product;
	private Double price;

	public Product(String product, Double price) {
		super();
		this.product = product;
		this.price = price;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [product=" + product + ", price=" + price + "]";
	}

}
