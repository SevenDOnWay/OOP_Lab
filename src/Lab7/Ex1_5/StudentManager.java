package Lab7.Ex1_5;

public class StudentManager{

	// dependencies
	StudentRepository studentRepository;
	StudentValidator studentValidator;
	EmailService emailService;

	public StudentManager(StudentRepository studentRepository, StudentValidator studentValidator, EmailService emailService) {
		this.studentRepository = studentRepository;
		this.studentValidator = studentValidator;
		this.emailService = emailService;
	}

	// business logic
	public void addStudent(String name, String email) {
		Student student = new Student(name, email);
// 1. validate data


//		if (name == null || name.isBlank()
//				|| email == null || !email.contains("@")) {
//			System.out.println("Invalid data!");
//			return;
//		}

		// Using StudentValidator to validate student instead of handle logic in this class
		if(!studentValidator.isValid(student)) {
			System.out.println("Invalid student data: " + name + ", " + email);
			return;
		}

// 2. save to "database"
//		System.out.println("Saving " + name + " to database...");

		// Using StudentRepository to save student instead of handle logic in this class
		studentRepository.addStudent(student);



// 3. send welcome email
//		System.out.println("Sending welcome email to " + email);


		// Using EmailService to send email instead of handle logic in this class
		emailService.sendEmail(email);
	}

}
