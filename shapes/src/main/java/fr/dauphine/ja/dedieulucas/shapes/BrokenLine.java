package fr.dauphine.ja.dedieulucas.shapes;

public class BrokenLine {
	private int currentIndex=0;
	private Point[] points;
	
	public BrokenLine(int n) {
		this.points = new Point[n];
	}
	
	public void add(Point p) {
		try {
			points[currentIndex]= p;
			currentIndex++;
		}
		catch(Exception e) {
			System.out.println("tableau plein :(");
		}
	}
	
	public int pointCapacity() {
		return points.length;
	}
	
	public int nbPoints() {
		return currentIndex + 1;
	}
	
	public boolean contain(Point myPoint) {
		for(Point p : points) {
			if(myPoint.equals(p)){
				return true;
			}
		}
		return false;
	}
	
	
}
