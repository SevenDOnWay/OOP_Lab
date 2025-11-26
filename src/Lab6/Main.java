package Lab6;

import java.awt.geom.Point2D;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ex1(sc);

		ex2(sc);

	}

	private static void ex2(Scanner sc) {
		Point2D.Double[] pts = new Point2D.Double[2];
		MyRectangle[] recs = new MyRectangle[2];

		for ( int j = 0; j < 2; j++ ) {
			for ( int i = 0; i < 2; i++ ) {
				int x = sc.nextInt();
				int y = sc.nextInt();

				pts[i] = new Point2D.Double(x, y);
			}

			recs[j] = new MyRectangle(pts[0], pts[1]);
		}

		checkOverLap(recs[0], recs[1]);
	}

	private static void ex1(Scanner sc) {
		System.out.println("Enter the coordinates of two cuboids (x1 y1 z1 x2 y2 z2 for each):");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int z1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int z2 = sc.nextInt();
		Cuboid cube1 = new Cuboid(x1, y1, z1, x2, y2, z2);

		System.out.println("Enter the coordinates of the second cuboid (x1 y1 z1 x2 y2 z2):");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		z1 = sc.nextInt();
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		z2 = sc.nextInt();
		Cuboid cube2 = new Cuboid(x1, y1, z1, x2, y2, z2);

		System.out.println("Cuboid 1: " + cube1);
		System.out.println("Cuboid 2: " + cube2);

		System.out.println(volumeCommonSpace(cube1, cube2));
	}

	public static int volumeCommonSpace(Cuboid cube1, Cuboid cube2) {
		int[] cube1Vertices1 = cube1.getVertice1();
		int[] cube1Vertices2 = cube1.getVertice2();
		int[] cube2Vertices1 = cube2.getVertice1();
		int[] cube2Vertices2 = cube2.getVertice2();

		int length = overlapLength(cube1Vertices1[0], cube1Vertices2[0], cube2Vertices1[0], cube2Vertices2[0]);
		int height = overlapLength(cube1Vertices1[1], cube1Vertices2[1], cube2Vertices1[1], cube2Vertices2[1]);
		int depth = overlapLength(cube1Vertices1[2], cube1Vertices2[2], cube2Vertices1[2], cube2Vertices2[2]);

		return length * height * depth;


	}

	public static void checkOverLap(MyRectangle rec1, MyRectangle rec2) {

		Point2D.Double rec1BottomLeftPoint = rec1.getBottomLeftPoint();
		double x1 = rec1BottomLeftPoint.getX();
		double y1 = rec1BottomLeftPoint.getY();
		double x2 = rec1.getTopRightPoint().getX();
		double y2 = rec1.getTopRightPoint().getY();

		double x3 = rec2.getBottomLeftPoint().getX();
		double y3 = rec2.getBottomLeftPoint().getY();
		double x4 = rec2.getTopRightPoint().getX();
		double y4 = rec2.getTopRightPoint().getY();



		double length = overLapLength(x1, x2, x3, x4);
		double height = overLapLength(y1, y2, y3, y4);

		if(length > 0 && height > 0) {
			System.out.println("Rectangles overlap.");
			System.out.println("Overlap area: " + (length * height));
		}
		else if (length == 0 || height == 0) {
			System.out.println("Rectangles touch at the edge.");
		}
		else {
			System.out.println("Rectangles do not overlap.");
		}
	}



	public static int overlapLength(int a1, int a2, int b1, int b2) {
		if ( a1 > a2 ) {
			a1 += a2;
			a2 = a1 - a2;
			a1 = a1 - a2;
		}
		if ( b1 > b2 ) {
			b1 += b2;
			b2 = b1 - b2;
			b1 = b1 - b2;
		}

		if ( a1 < b1 ) {
			return Math.min(Math.abs(b2 - b1), Math.abs(a2 - b1));
		} else return Math.min(Math.abs(a2 - a1), Math.abs(b2 - a1));
	}

	public static double overLapLength(double a1, double a2, double b1, double b2){
		if ( a1 > a2 ) {
			a1 += a2;
			a2 = a1 - a2;
			a1 = a1 - a2;
		}
		if ( b1 > b2 ) {
			b1 += b2;
			b2 = b1 - b2;
			b1 = b1 - b2;
		}

		if ( a1 < b1 ) {
			return Math.min(Math.abs(b2 - b1), Math.abs(a2 - b1));
		} else return Math.min(Math.abs(a2 - a1), Math.abs(b2 - a1));
	}


}
