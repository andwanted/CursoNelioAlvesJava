package services;

import entities.Contract;
import entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, int months) {

		double valorParcial = contract.getValue() / months;

		for (int i = 1; i <= months; i++) {

			double juros = onlinePaymentService.interest(valorParcial, i);
			double taxa = onlinePaymentService.paymentFee(valorParcial + juros);
			double valorParcela = valorParcial + taxa + juros;

			contract.getInstallments().add(new Installment(contract.getDate().plusMonths(i), valorParcela));

		}

	}

}
