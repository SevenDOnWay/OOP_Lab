package Lab4.Question2B;

public class Rectangle extends Shape{
	double length;
	double width;

	public Rectangle(){};

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public Rectangle(double length, double width, String color, Boolean filled) {
		super(color, filled);
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double getArea() {
		return length * width;
	}

	@Override
	public double getPerimeter() {
		return 2 * (length + width);
	}

	@Override
	public String toString() {
		return super.toString() + " , Rectangle with length = " + length + " , width = " + width;
	}
}
