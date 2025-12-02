package Lab7.Ex4;

public class OldPrinter implements IPrinter{

	@Override
	public void print(String context) {
		System.out.println("Old Printer printing: " + context);
	}
}
