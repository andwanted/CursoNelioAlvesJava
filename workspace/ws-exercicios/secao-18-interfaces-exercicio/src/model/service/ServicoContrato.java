package model.service;

import java.time.LocalDate;

import model.entities.Contrato;
import model.entities.Parcelas;

public class ServicoContrato {

	// declaração de dependencia
	private ServicoPagamentoOnline servicoPagamentoOnline;

	public ServicoContrato(ServicoPagamentoOnline servicoPagamentoOnline) {
		this.servicoPagamentoOnline = servicoPagamentoOnline;
	}

	public void processarContrato(Contrato contrato, int meses) {

		double parcelaBasica = contrato.getValorTotal() / meses;

		for (int i = 1; i <= meses; i++) {
			LocalDate vencimentoParcela = contrato.getData().plusMonths(i);
			double juros = servicoPagamentoOnline.juros(parcelaBasica, i);
			double taxa = servicoPagamentoOnline.taxaPagamento(parcelaBasica + juros);
			double cota = parcelaBasica + juros + taxa;
			
			contrato.getParcelas().add(new Parcelas(vencimentoParcela,cota));
			
			
		}
	}

}
