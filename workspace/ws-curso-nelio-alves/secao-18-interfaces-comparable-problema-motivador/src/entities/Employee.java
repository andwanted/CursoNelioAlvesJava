package entities;

public class Employee implements Comparable<Employee> {

	private String name;
	private Double salary;

	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee other) {
		// TODO Auto-generated method stub
		//compara por nome em ordem crescente
		return name.compareTo(other.getName());
		//compara por salario em ordem crescente
		//return salary.compareTo(other.getSalary());
		//compara por salario em ordem decrescente
		//return -salary.compareTo(other.getSalary());
	}

}
