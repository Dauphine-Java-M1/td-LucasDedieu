package fr.dauphine.ja.dedieulucas.shapes;

public class Point {
	static private int cpt = 0;
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
		cpt++;
	}
	
	public Point(Point p) {
		this.x = p.getX();
		this.y = p.getY();
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public static int getCpt() {
		return cpt;
	}
	
	@Override
	public String toString() {
		return "("+x+", "+y+")" ;
	}
	
	public boolean isSameAs(Point p) {
		if(p.getX() == x && p.getY() == y) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean equals(Object obj) {
		Point p = (Point) obj;
		return isSameAs(p);
	}
}
