package Lab5.Question6;

import javax.swing.*;

public class Panel6 extends JPanel{

	@Override
	public void paint(java.awt.Graphics g) {
		super.paint(g);

		g.setColor(java.awt.Color.BLUE);

		int width = getWidth();
		int height = getHeight();

		int centerX = width / 2;
		int centerY = height / 2;

		int n = 0;

		for ( int i = 0; i < 10; i++ ) {
			g.drawArc(centerX - n, centerY - n, 2 * n + 10, 2 * n + 10, 0, 360);
			n += 10;
		}

	}


}
