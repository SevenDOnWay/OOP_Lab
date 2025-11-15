package Lab5.Question8;

import javax.swing.*;
import java.awt.*;

public class Panel8 extends JPanel{

	int[] num = new int[5];

	public Panel8() {

		for ( int i = 0; i < num.length; i++ ) {
			String input = JOptionPane.showInputDialog(
					null, "Enter integer #" + (i + 1));
			num[i] = Integer.parseInt(input);
		}

	}

	@Override
	public void paint(java.awt.Graphics g) {
		super.paint(g);

		g.setColor(Color.GRAY);

		int width = getWidth();
		int height = getHeight();

		int centerX = width / 2;
		int centerY = height / 2;

		int space = 50;
		int heightBar = 75;

		for ( int i = 0; i < num.length; i++ ) {

			g.fillRect(0, space, num[i], heightBar);
			space += 125;
		}

	}
}
