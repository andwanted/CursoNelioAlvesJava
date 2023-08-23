package entities;

public class Produto {

	private String produto;
	private Double preco;
	private int quantidade;

	public Produto() {

	}

	public Produto(String produto, Double preco, int quantidade) {
		this.produto = produto;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double calculaProduto() {
		return preco * quantidade;
	}
	

	public String toString() {
		return produto + "," + preco + "," + quantidade;
	}

}
