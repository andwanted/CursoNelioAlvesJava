package application;

import java.util.ArrayList;
import java.util.List;

import entities.Rectangle;
import entities.Circle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(10.9, 2.0));
		myShapes.add(new Circle(5.0));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(3.0));

		System.out.println("Total area: " + totalArea(myCircles));

	}

	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}

}
