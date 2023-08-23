package entities;

public class ConcreteScanner extends Device implements Scanner {
	
	
	
	public ConcreteScanner(String serialNumber) {
		super(serialNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Scan process " + doc);
	}

	public String scan() {

			return "Scanning!";
	}

}
