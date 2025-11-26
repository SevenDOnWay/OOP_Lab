package Lab6;

import java.awt.geom.Point2D;

public class MyRectangle{
	private Point2D.Double bottomLeftPoint;
	private Point2D.Double topRightPoint;

	public MyRectangle(Point2D.Double pt1, Point2D.Double pt2) {
		setBottomLeftPoint(pt1);
		setTopRightPoint(pt2);
	}

	public void setBottomLeftPoint (Point2D.Double pt) {
		bottomLeftPoint = pt;
	}

	public void setTopRightPoint (Point2D.Double pt) {
		topRightPoint = pt;
	}


	public Point2D.Double getBottomLeftPoint () {
		return bottomLeftPoint;
	}

	public Point2D.Double getTopRightPoint () {
		return topRightPoint;
	}

	@Override
	public String toString() {
		return ("bottom left: " + bottomLeftPoint + "top right: " + topRightPoint);
	}

}
