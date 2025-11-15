package Lab5;

import Lab5.Question2.Panel1;
import Lab5.Question3.Panel2;
import Lab5.Question4.Panel3;
import Lab5.Question5.Panel4;
import Lab5.Question5.Panel5;
import Lab5.Question6.Panel6;
import Lab5.Question7.Panel7;
import Lab5.Question8.Panel8;
import Lab5.Question9.Panel9;

import javax.swing.*;
import java.awt.*;

public class Main{
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
		JPanel p1 = new Panel1();
		JPanel p2 = new Panel2();
		JPanel p3 = new Panel3();
		JPanel p4 = new Panel4();
		JPanel p5 = new Panel5();
		JPanel p6 = new Panel6();
		JPanel p7 = new Panel7();
//		JPanel p8 = new Panel8();
		JPanel p9 = new Panel9();

//		f.add(p1);
//		f.add(p2); // only work with square
//		f.add(p3); // only work with square
//		f.add(p4);
//		f.add(p5);
//		f.add(p6);
//		f.add(p7);
//		f.add(p8);
		f.add(p9);
	}

}
