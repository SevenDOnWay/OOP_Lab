package Lab5.Question3;

import javax.swing.*;
import java.awt.*;

public class Panel2 extends JPanel{
	@Override
	public void paint(Graphics g) {
//		super.paint(g);

		g.setColor(Color.RED);

		int width = getWidth();
		int height = getHeight();

		//only work with square
		int x = 0;
		while ( x < height || x < width ) {
			g.drawLine(0, 0, 0 + x, width - x);
			g.drawLine(0, height, 0 + x, 0 + x);
			g.drawLine(width, 0, 0 + x, 0 + x);
			g.drawLine(width, height, 0 + x, height - x);
			x += 10;
		}
	}

}
