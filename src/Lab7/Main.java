package Lab7;

import Lab7.Ex1_5.EmailService;
import Lab7.Ex1_5.StudentManager;
import Lab7.Ex1_5.StudentRepository;
import Lab7.Ex1_5.StudentValidator;
import Lab7.Ex2.*;

import java.util.ArrayList;

public class Main{
	public static void main (String[] args) {
//		ex1();

//		ex2();


	}

	private static void ex2() {
		AreaCalculator calculator = new AreaCalculator();

		ArrayList<IShape> shapes = new ArrayList<IShape>();
		shapes.add(new Square(5));
		shapes.add(new Circle(3));

		System.out.println(calculator.totalArea(shapes));

		shapes.add(new Triangle(5,3));
		System.out.println(calculator.totalArea(shapes));
	}

	private static void ex1() {
		StudentValidator validator = new StudentValidator();
		StudentRepository repo = new StudentRepository();
		EmailService emailService = new EmailService();

		StudentManager manager = new StudentManager(repo, validator, emailService);
		manager.addStudent("Tin", "tin@example.com");

		//Manger only focus on add student logic
		//Other logics are handled by respective classes
		//follow Single Responsibility Principle
	}
}


