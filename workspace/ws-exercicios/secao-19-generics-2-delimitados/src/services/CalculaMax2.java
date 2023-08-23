package services;

import java.util.List;

public class CalculaMax2 {

	public String max(List<String> list) {

		String max = list.get(0);

		for (String l : list) {
			if (l.compareTo(max) > 0) {
				max = l;
			}
		}
		return max;
	}

}
