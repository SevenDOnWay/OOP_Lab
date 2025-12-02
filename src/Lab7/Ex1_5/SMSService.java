package Lab7.Ex1_5;

public class SMSService implements IMessageSender{

	@Override
	public void sendMessage(String email) {
		System.out.println("Sending SMS to " + email + ": nothing beat a jeet holiday...!");
	}
}
