package application;

import entities.Circle;
import entities.Rectangle;
import enums.Color;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(Color.WHITE,10,40); 
		Rectangle r2 = new Rectangle(Color.BLACK,20,10); 

		Circle c1 = new Circle(Color.WHITE, 14);
		Circle c2 = new Circle(Color.BLACK, 6);
		
		System.out.println(r1.color + " " + r1.area());
		System.out.println(r2.color + " " + r2.area());
		
		System.out.println(c1.color + " " + c1.area());
		System.out.println(c2.color + " " + c2.area());
		
	}

}
