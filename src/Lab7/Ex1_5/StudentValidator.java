package Lab7.Ex1_5;

public class StudentValidator{

	public boolean isValid(String name, String email) {
		if ( name == null || name.isBlank() || email == null || !email.contains("@") ) {
			return false;
		}
		return true;
	}

	public boolean isValid(Student student) {
		String name = student.name;
		String email = student.email;
		if ( name == null || name.isBlank() || email == null || !email.contains("@") ) {
			return false;
		}
		return true;
	}
}
