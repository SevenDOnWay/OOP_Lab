package Lab5.Question4;

import javax.swing.*;
import java.awt.*;

public class Panel3 extends JPanel{
	@Override
	public void paint(Graphics g) {
		super.paint(g);

		g.setColor(Color.BLUE);

		int width = getWidth();
		int height = getHeight();

		//only work with square
		int n = 0;
		while ( n < width || n < height ) {
			g.drawLine(0, 0 + n, 0 + n, height);
			g.drawLine(0 + n, height, width, height - n);
			g.drawLine(width, height - n, width - n, 0);
			g.drawLine(width - n, 0, 0, 0 + n);
			n += 10;
		}


	}

}
