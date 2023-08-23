package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorteia<T> {

	List<T> listaSorteio = new ArrayList<>();

	public void addValor(T valor) {
		listaSorteio.add(valor);
	}

	public void apresentaResultado() {

		Random random = new Random();
		int posicao = random.nextInt(listaSorteio.size());
		T resultado = listaSorteio.get(posicao);
		System.out.println("Valor sorteado foi: " + resultado);
	}

}
