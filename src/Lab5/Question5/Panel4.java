package Lab5.Question5;

import javax.swing.*;
import java.awt.*;

public class Panel4 extends JPanel{

	@Override
	public void paint(Graphics g) {
		super.paint(g);

		g.setColor(Color.BLUE);

		int width = getWidth();
		int height = getHeight();

		int centerX = width / 2;
		int centerY = height / 2;

		int n = 10;

		drawSquare(g, centerX, centerY, n, 0, width, height);

	}

	public void drawSquare(Graphics g, int lastpx, int lastpy, int size, int step, int width, int height) {
		if ( size > width || size > height ) return;
		int value = size * (step % 2 == 0 ? 1 : -1);

		g.drawLine(lastpx, lastpy, lastpx, lastpy + value);
		g.drawLine(lastpx, lastpy + value, lastpx - value, lastpy + value);
		drawSquare(g, lastpx - value, lastpy + value, size + 10, step + 1, width, height);
	}

}
