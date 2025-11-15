package Lab5.Question5;

import javax.swing.*;
import java.awt.*;

public class Panel5 extends JPanel{

	@Override
	public void paint(Graphics g) {
		super.paint(g);

		g.setColor(Color.BLUE);

		int width = getWidth();
		int height = getHeight();

		int centerX = width / 2;
		int centerY = height / 2;

		int n = 50;

		g.drawLine(centerX, centerY, centerX + n, centerY + n);



		drawSquare(g, centerX, centerY, n, 0, width, height);
		drawSpiral(g, centerX, centerY, n, 0, 25, width, height);

	}

	public void drawSquare(Graphics g, int lastpx, int lastpy, int size, int step, int width, int height) {
		if ( size > width || size > height ) return;
		int value = size * (step % 2 == 0 ? 1 : -1);

		g.drawLine(lastpx, lastpy, lastpx, lastpy + value);
		g.drawLine(lastpx, lastpy + value, lastpx - value, lastpy + value);
		drawSquare(g, lastpx - value, lastpy + value, size + 50, step + 1, width, height);
	}

	public void drawSpiral(Graphics g, int centerX, int centerY, int radius, int angle, int step, int width, int height) {
		if ( radius > width || radius > height ) return;

		// Draw half-circle (alternating direction)
		g.drawArc(centerX - radius, centerY - radius,
				radius * 2, radius * 2,
				angle, 180);

		// Compute next arc center — move along the curve
		double rad = Math.toRadians(angle + 180);
		int nextX = centerX + (int) (Math.cos(rad) * step);
		int nextY = centerY + (int) (Math.sin(rad) * step);

		// Alternate direction by flipping sign of angle
		drawSpiral(g, nextX, nextY, radius + step, angle + 180, step, width,height);
	}
}


