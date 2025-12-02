package Lab7.Ex1_5;

public class EmailService implements IMessageSender{

	public void sendEmail(String email) {
		System.out.println("Sending email to " + email + "congrats ...!");
	}

	//Ex5
	@Override
	public void sendMessage(String email) {
		System.out.println("Sending EMAIL to " + email + ": abc");
	}



}
