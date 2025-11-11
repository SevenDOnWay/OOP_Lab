package Lab4.Question2B;

public abstract class Shape{
	String color;
	Boolean filled;

	public Shape() {}

	public Shape(String color, Boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Boolean isFilled() {
		return filled;
	}

	public void setFilled(Boolean filled) {
		this.filled = filled;
	}

	public abstract double getArea();
	public abstract double getPerimeter();

	@Override
	public String toString() {
		return "color = " + color + " , " + (filled ? "filled" : "not filled");
	}
}
