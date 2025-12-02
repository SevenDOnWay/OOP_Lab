package Lab7.Ex2;

public class Circle implements IShape{
	double radius;


	public Circle(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public Double calculateArea() {
		return Math.PI * radius * radius;
	}

}
