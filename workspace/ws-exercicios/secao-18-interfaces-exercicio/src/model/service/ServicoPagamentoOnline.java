package model.service;

public interface ServicoPagamentoOnline {

	Double taxaPagamento(double quantia);
	Double juros(double quantia, int meses);
	
}
