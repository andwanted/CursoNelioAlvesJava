package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pipeline {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

		// Operação intermediaria map
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		// Operação terminal toArray()
		System.out.println(Arrays.toString(st1.toArray()));

		// Operação terminal reduce
		int sum = list.stream().reduce(0, (x, y) -> x + y);
		System.out.println("Sum = " + sum);

		List<Integer> newList = list.stream()
				.filter(x -> x % 2 == 0)
				.map(x -> x * 10).collect(Collectors.toList());
		System.out.println(Arrays.toString(newList.toArray()));
		
	}

}
