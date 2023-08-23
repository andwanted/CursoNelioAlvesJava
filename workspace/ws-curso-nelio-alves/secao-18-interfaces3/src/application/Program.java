package application;

import entities.ComboDevice;
import entities.ConcretePrinter;
import entities.ConcreteScanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteScanner scanner1 = new ConcreteScanner("scan1");
		
		String doc = "Conteudo doc";
		
		scanner1.processDoc(doc);
		System.out.println(scanner1.scan());
		
		ConcretePrinter printer1 = new ConcretePrinter("printer1");
		printer1.processDoc(doc);
		printer1.print(doc);
		
		ComboDevice combo1 = new ComboDevice("Combo1");
		combo1.processDoc(doc);
		System.out.println(combo1.scan());
		combo1.print(doc);
		
	}

}
