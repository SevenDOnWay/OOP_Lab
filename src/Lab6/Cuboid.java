package Lab6;

public class Cuboid{
	int[] vertice1 = new int[3];
	int[] vertice2 = new int[3];

	public Cuboid() {
		vertice1[0] = 0;
		vertice1[1] = 0;
		vertice1[2] = 0;

		vertice2[0] = 1;
		vertice2[1] = 1;
		vertice2[2] = 1;
	}

	public Cuboid(int x1, int y1, int z1, int x2, int y2, int z2) {
		vertice1[0] = x1;
		vertice1[1] = y1;
		vertice1[2] = z1;

		vertice2[0] = x2;
		vertice2[1] = y2;
		vertice2[2] = z2;
	}


	public int[] getVertice1() {
		return vertice1;
	}

	public int[] getVertice2() {
		return vertice2;
	}

	@Override
	public String toString() {
		return "Cuboid [vertice1=(" + vertice1[0] + ", " + vertice1[1] + ", " + vertice1[2] + "), vertice2=(" + vertice2[0] + ", " + vertice2[1] + ", " + vertice2[2] + ")]";
	}

	public int getWidth() {
		return Math.abs(vertice2[0] - vertice1[0]);
	}

	public int getHeight() {
		return Math.abs(vertice2[1] - vertice1[1]);
	}

	public int getDepth() {
		return Math.abs(vertice2[2] - vertice1[2]);
	}
}
