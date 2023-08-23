package application;

import java.util.Arrays;
import java.util.List;

public class Program {
	
	public static void main(String[] args) {
		List<Double> myInts = Arrays.asList(5.1655454, 2.1, 10.2);
		printList(myInts);
		
		List<String> myStrings = Arrays.asList("Anderson","Leandro","Sousa");
		printList(myStrings);
	}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}