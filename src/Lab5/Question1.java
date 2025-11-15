package Lab5;

import javax.swing.*;

public class Question1{
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "Hello " + name + ", welcome to Java programming!");
	}
}
