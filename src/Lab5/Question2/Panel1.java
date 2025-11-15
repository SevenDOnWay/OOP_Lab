package Lab5.Question2;

import javax.swing.*;
import java.awt.*;

public class Panel1 extends JPanel{
	@Override
	public void paint(Graphics g) {
		super.paint(g);

		g.setColor(Color.BLUE);

		int width = getWidth();
		int height = getHeight();

		g.drawLine(0, 0, width, height);
		g.drawLine(width / 2, 0, width / 2, height);
		g.drawLine(0, height / 2, width, height / 2);
		g.drawLine(0, height, width, 0);
	}

	@Override
	public void setBounds(int x, int y, int width, int height) {
		// Force the width and height to be equal to the smaller dimension
		int size = Math.min(width, height);
		super.setBounds(x, y, size, size);
	}
}
