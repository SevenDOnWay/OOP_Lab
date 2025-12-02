package Lab7.Ex3;

public class Bird extends Animal implements IFly{

	private double wingSpan;

	public Bird(String name, int age, double wingSpan) {
		super(name, age);
		this.wingSpan = wingSpan;
	}

	public double getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(double wingSpan) {
		this.wingSpan = wingSpan;
	}

	@Override
	public void fly() {
		System.out.println(getName() + " is flying with a wingspan of " + wingSpan + " meters.");
	}
}
