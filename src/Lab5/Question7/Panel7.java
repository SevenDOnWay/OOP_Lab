package Lab5.Question7;

import javax.swing.*;
import java.awt.*;

public class Panel7 extends JPanel{
	@Override
	public void paint(Graphics g) {
		super.paint(g);

		int width = getWidth();
		int height = getHeight();

		int centerX = width / 2;
		int centerY = height / 2;

		int n = 100;

		for ( int i = 0; i < 10; i++ ) {

			g.setColor(randomColor());

			g.fillOval(centerX - n, centerY - n, 2 * n + 10, 2 * n + 10);

			n -= 10;
		}



	}

	public Color randomColor() {
		int r = (int)(Math.random() * 256);
		int gr = (int)(Math.random() * 256);
		int b = (int)(Math.random() * 256);
		return new Color(r, gr, b);
	}
}
