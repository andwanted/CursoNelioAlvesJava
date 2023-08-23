package model.service;

public class ServicoPaypal implements ServicoPagamentoOnline {

	@Override
	public Double taxaPagamento(double quantia) {
		// TODO Auto-generated method stub
		return quantia * 0.02;
	}

	@Override
	public Double juros(double quantia, int meses) {
		// TODO Auto-generated method stub
		return quantia * 0.01 * meses;
	}

}
