package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Set<Integer> setCourseA = new HashSet<>();
		Set<Integer> setCourseB = new HashSet<>();
		Set<Integer> setCourseC = new HashSet<>();

		System.out.print("how many students for course A?");
		int a = sc.nextInt();

		for (int i = 0; i < a; i++) {
			int value = sc.nextInt();
			setCourseA.add(value);
		}

		System.out.print("how many students for course B?");
		int b = sc.nextInt();

		for (int i = 0; i < b; i++) {
			int value = sc.nextInt();
			setCourseB.add(value);
		}

		System.out.print("how many students for course C?");
		int c = sc.nextInt();

		for (int i = 0; i < c; i++) {
			int value = sc.nextInt();
			setCourseC.add(value);
		}

		Set<Integer> setTotal = new HashSet<>();
		setTotal.addAll(setCourseA);
		setTotal.addAll(setCourseB);
		setTotal.addAll(setCourseC);

		System.out.println("Total students: " + setTotal.size());

		sc.close();
	}

}
