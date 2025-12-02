package Lab7.Ex2;

public class Square implements IShape{

	private double side;

	public Square(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public Double calculateArea() {
		return side * side;
	}

}
