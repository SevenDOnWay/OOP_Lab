package Lab4.Question1B;

public class Cat extends Animal{

	public Cat(String name) {
		super(name);
	}

	@Override
	public void greets() {
		System.out.println("Meow!");
	}
}
