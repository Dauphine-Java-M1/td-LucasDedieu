package fr.dauphine.ja.dedieulucas.shapes.model;

public class Ring extends Circle{
	
	private int internalRadius;
	
	public Ring(Point center, int radius, int internalRadius) {
		super(center, radius);
		if(internalRadius >= radius) {
			throw new IllegalArgumentException();
		}
		this.internalRadius = internalRadius;
	}
	
	public boolean equals(Ring ring) {
		if(!(this.getCenter().equals(ring.getCenter()))) {
			return false;
		}
		if(!(this.getCenter().equals(ring.getCenter()))) {
			return false;
		}
		if(!(this.getRadius() == ring.getRadius())) {
			return false;
		}
		if(!(this.internalRadius == ring.getInternalRadius())) {
			return false;
		}
		return true;
	}

	public int getInternalRadius() {
		return internalRadius;
	}
	
	public String toString() {
		return super.toString()+"; Rayon Interne : "+internalRadius;
	}
	
	public boolean contains(Point p) {
		Circle internalCircle = new Circle(getCenter(), internalRadius);
		if(super.contains(p)&& !internalCircle.contains(p)) {
			return true;
		}
		return false;
	}


}
