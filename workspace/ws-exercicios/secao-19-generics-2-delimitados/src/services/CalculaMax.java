package services;

import java.util.List;

public class CalculaMax {

	public <T extends Comparable<T>> T max(List<T> list) {

		T max = list.get(0);

		for (T l : list) {
			if (l.compareTo(max) > 0) {
				max = l;
			}
		}
		return max;
	}

}
