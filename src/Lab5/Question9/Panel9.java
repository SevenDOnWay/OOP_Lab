package Lab5.Question9;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath;

public class Panel9 extends JPanel{
	int[] pointX = new int[5];
	int[] pointY = new int[5];


	@Override
	public void paint(java.awt.Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;

		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		int width = getWidth();
		int height = getHeight();

		int centerX = width / 2;
		int centerY = height / 2;

		g.setColor(Color.RED);
		g.fillOval(centerX - 150, centerY - 150, 300, 300);

		g.setColor(Color.WHITE);
		g.fillOval(centerX - 100, centerY - 100, 200, 200);

		g.setColor(Color.RED);
		g.fillOval(centerX - 50, centerY - 50, 100, 100);

		g.setColor(Color.blue);
		g.fillOval(centerX - 25, centerY - 25, 50, 50);

		GeneralPath path = new GeneralPath();

		// Calculate the points of the star
		for(int i = 0 ; i < 5 ; i++) {
			double angle = i * 2 * Math.PI / 5 - Math.PI / 2;
			pointX[i] = centerX + (int)(Math.cos(angle) * 25);
			pointY[i] = centerY + (int)(Math.sin(angle) * 25);
		}

		path.moveTo(pointX[0],pointY[0]);
		path.lineTo(pointX[2],pointY[2]);
		path.lineTo(pointX[4],pointY[4]);
		path.lineTo(pointX[1],pointY[1]);
		path.lineTo(pointX[3],pointY[3]);

		path.closePath();

		g2.setColor(Color.YELLOW);
		g2.fill(path);


	}
}
