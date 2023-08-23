package entities;

public class ConcretePrinter extends Device implements Printer {


	public ConcretePrinter(String serialNumber) {
		super(serialNumber);
		// TODO Auto-generated constructor stub
	}

	public void processDoc(String doc) {

		System.out.println("Print process " + doc);

	}

	public void print(String doc) {
		System.out.println("Printing " + doc);
	}

}
