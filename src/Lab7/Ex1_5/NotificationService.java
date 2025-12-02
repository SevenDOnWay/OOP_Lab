package Lab7.Ex1_5;

public class NotificationService {
//	private final EmailService emailService = new EmailService();
//
//	public void sendWelcome(String email) {
//		emailService.sendEmail(email);
//	}

	private final IMessageSender sender;

	public NotificationService(IMessageSender sender) {
		this.sender = sender;
	}

	public void sendWelcome(String to) {
		sender.sendMessage(to);
	}

}
