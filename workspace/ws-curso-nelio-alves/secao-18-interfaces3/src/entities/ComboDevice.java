package entities;

public class ComboDevice extends Device implements Scanner, Printer {

	public ComboDevice(String serialNumber) {
		super(serialNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print(String doc) {
		System.out.println("Combo printing " + doc);

	}

	@Override
	public String scan() {
		// TODO Auto-generated method stub
		return "Combo scan result";
	}

	@Override
	public void processDoc(String doc) {
		// TODO Auto-generated method stub
		System.out.println("Combo processing " + doc);
	}

}
