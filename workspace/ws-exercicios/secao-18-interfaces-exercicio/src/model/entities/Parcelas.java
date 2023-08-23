package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcelas {

	public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private LocalDate dataVencimento;
	private Double valor;

	public Parcelas(LocalDate dataVencimento, Double valor) {
		this.dataVencimento = dataVencimento;
		this.valor = valor;
	}

	public LocalDate getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String toString() {
		return dataVencimento.format(dtf) + " - " + String.format("%.2f", valor);
	}

}
