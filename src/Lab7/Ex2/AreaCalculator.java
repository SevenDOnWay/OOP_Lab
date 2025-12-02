package Lab7.Ex2;

import java.util.ArrayList;

public class AreaCalculator{

	public Double totalArea(IShape[] shapes) {
		double total = 0;
		for (IShape shape : shapes) {
			total += shape.calculateArea();
		}
		return total;
	}

	public Double totalArea(ArrayList<IShape> shapes) {
		double total = 0;
		for (IShape shape : shapes) {
			total += shape.calculateArea();
		}
		return total;
	}

}
