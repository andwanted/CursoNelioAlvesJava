package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> emp = new ArrayList<>();

		System.out.print("Enter full file path: ");
		String path = sc.next();
		sc.nextLine();
		System.out.print("Enter salary: ");
		Double salaryCompare = sc.nextDouble();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				String lin[] = line.split(",");
				String name = lin[0];
				String email = lin[1];
				Double salary = Double.parseDouble(lin[2]);
				emp.add(new Employee(name, email, salary));
				line = br.readLine();
			}
			
			Comparator<String> comp = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> emails = emp.stream()
					.filter(p -> p.getSalary() > salaryCompare)
					.map(p -> p.getEmail())
					.sorted(comp)
					.collect(Collectors.toList());
			
			double sum = emp.stream()
					.filter(p -> p.getName().charAt(0) == 'M')
					.map(p -> p.getSalary())
					.reduce(0.00,(x,y) -> x + y );
				
			
			emails.forEach(System.out::println);
			
			System.out.println("Sum of salary of people whose name starts with 'M': " + sum);

		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		sc.close();
	}

}
