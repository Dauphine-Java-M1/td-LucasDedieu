package fr.dauphine.ja.dedieulucas.shapes;

public class Circle {
	private Point center;
	private int radius;
	
	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "Centre : "+center+"; Rayon : "+radius;
		
	}
	
	public void translate(int dx, int dy) {
		center.translate(dx, dy);
	}
	
	public Point getCenter() {
		return new Point(center.getX(), center.getY());
	}
	
	public int getRadius() {
		return radius;
	}
	
	public double surface() {
		return Math.PI*radius*radius;
	}
	
	public boolean contains(Point p) {
		if(Math.sqrt(Math.pow(p.getX()-center.getX(), 2)+Math.pow(center.getY()-p.getY(), 2))<radius) {
			return true;	
		}
		return false;
	}
	
	public boolean equals(Circle c) {
		if(!center.equals(c.getCenter())) {
			return false;
		}
		if(!(radius==c.getRadius())) {
			return false;
		}
		return true;
	}

}
