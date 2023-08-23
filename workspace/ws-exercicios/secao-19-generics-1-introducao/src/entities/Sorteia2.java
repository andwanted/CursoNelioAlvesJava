package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorteia2 {

	List<String> listaSorteio = new ArrayList<>();

	public void addValor(String valor) {
		listaSorteio.add(valor);
	}

	public void apresentaResultado() {

		Random random = new Random();
		int posicao = random.nextInt(listaSorteio.size());
		String resultado = listaSorteio.get(posicao);
		System.out.println("Valor sorteado foi: " + resultado);
	}

}
