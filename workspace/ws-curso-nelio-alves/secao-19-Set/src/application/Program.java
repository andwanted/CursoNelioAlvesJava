package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		set.add("Notebook");
		set.add("TV");
		set.add("Tablet");
		// System.out.println(set.contains("Notebook"));
		set.remove("TV");
		set.removeIf(x -> x.charAt(0) == 'N');
		System.out.println("HashSet");
		for (String p : set) {
			System.out.println(p);
		}
		System.out.println();

		Set<String> set2 = new TreeSet<>();
		set2.add("Tv");
		set2.add("Notebook");
		set2.add("Tablet");
		System.out.println("TreeSet");
		for (String p : set2) {
			System.out.println(p);
		}
		System.out.println();
		
		Set<String> set3 = new LinkedHashSet<>();
		set3.add("TV");
		set3.add("Notebook");
		set3.add("Tablet");
		System.out.println("LinkedHashSe");
		for (String p : set3) {
			System.out.println(p);
		}
	}

}
