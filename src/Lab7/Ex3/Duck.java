package Lab7.Ex3;

public class Duck extends Animal implements ISwim{

	private String featherColor;

	public Duck(String name, int age, String featherColor) {
		super(name, age);
		this.featherColor = featherColor;
	}

	public String getFeatherColor() {
		return featherColor;
	}

	public void setFeatherColor(String featherColor) {
		this.featherColor = featherColor;
	}

	@Override
	public void swim() {
		System.out.println(getName() + " is swimming with " + featherColor + " feathers.");
	}
}
