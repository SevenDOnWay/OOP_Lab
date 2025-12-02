package Lab7.Ex4;

public class MultiFunctionalMachine implements IPrinter,IScan,IFax{

	@Override
	public void print(String context) {
		System.out.println("MultiFunctionalMachine printing: " + context);
	}

	@Override
	//TODO: add scanner for scan string context
	public void scan(String context) {
		System.out.println("MultiFunctionalMachine scanning: " + context);
	}

	@Override
	//TODO: add business logic for fax string context
	public void fax(String context) {
		System.out.println("MultiFunctionalMachine faxing: " + context);
	}
}
