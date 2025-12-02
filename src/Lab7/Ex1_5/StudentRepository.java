package Lab7.Ex1_5;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository{

	//  Assuming a simple in-memory list to simulate database
	List<Student> students = new ArrayList<>();

	public void addStudent(Student student) {
		students.add(student);
		System.out.println("Saving " + student.name + " to database...");
	}
}
