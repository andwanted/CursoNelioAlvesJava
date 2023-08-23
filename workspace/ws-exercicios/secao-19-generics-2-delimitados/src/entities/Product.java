package entities;

import java.util.ArrayList;
import java.util.List;

public class Product implements Comparable<Product> {

	private String nome;
	private Integer valor;

	private List<Product> produto = new ArrayList<>();

	public Product(String nome, Integer valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public List<Product> getProduto() {
		return produto;
	}

	@Override
	public String toString() {
		return "Produto: " + nome + " " + " Valor: " + valor;
	}

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return nome.compareTo(o.nome);
	}

}
