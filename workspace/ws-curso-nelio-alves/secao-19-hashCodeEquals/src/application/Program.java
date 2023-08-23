package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Equals
		String a = "Maria";
		String b = "Alex";
		System.out.println(a.equals(b));

		// HashCode
		String d = "Maria";
		String c = "Alex";
		System.out.println(d.hashCode());
		System.out.println(c.hashCode());

		// Complemento da explicação, diferença ao declarar de forma literaria
		// String s1 = "Test";
		// String s2 = "Test";
		String s1 = new String("Test");
		String s2 = new String("Test");
		

		// HashCode personalizado :)
		Client c1 = new Client("Anderson", "anderson@gmail.com");
		Client c2 = new Client("Leandro", "leandro@gmail.com");
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
		System.out.println(s1 == s2);

	}

}
