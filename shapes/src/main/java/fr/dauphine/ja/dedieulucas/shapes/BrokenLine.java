package fr.dauphine.ja.dedieulucas.shapes;

import java.util.LinkedList;
import java.util.List;

public class BrokenLine {
	private int currentIndex=0;
	//private Point[] points;
	private List<Point> pointList;
	
	public BrokenLine(int n) {
		//this.points = new Point[n];
		this.pointList = new LinkedList<>();
	}
	
	public void add(Point p) {
		/*
		try {
			points[currentIndex]= p;
			currentIndex++;
		}
		catch(Exception e) {
			System.out.println("tableau plein :(");
		}*/
		pointList.add(p);
	}
	/*
	public int pointCapacity() {
		return points.length;
	}*/
	
	public int nbPoints() {
		//return currentIndex + 1;
		return pointList.size();
	}
	
	public boolean contain(Point myPoint) {
		/*
		for(Point p : points) {
			if(myPoint.equals(p)){
				return true;
			}
		}
		return false;
		*/
		return pointList.contains(myPoint);
	}
	
	
}
