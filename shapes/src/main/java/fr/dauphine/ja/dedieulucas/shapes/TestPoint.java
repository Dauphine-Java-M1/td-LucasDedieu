package fr.dauphine.ja.dedieulucas.shapes;

import java.util.ArrayList;
import java.util.List;

public class TestPoint {
	public static void main(String[] args) {
		/* EXO 1
		Point p = new Point(2, 2);
		System.out.println(p.getX()+" "+p.getY());
		Point p2 = new Point(2, 2);
		System.out.println(p2.getCpt());
		Point p3 = new Point(2, 2);
		System.out.println(Point.getCpt());
		
		System.out.println(p);
		*/
		
		
		Point p1=new Point(1,2);
		Point p2=p1;
		Point p3=new Point(1,2);
		ArrayList<Point> list = new ArrayList<>();
		list.add(p1);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));
	}
	
	public static boolean contains(Point p, Circle[] circles ) {
		for(Circle c : circles) {
			if(!c.contains(p)) {
				return false;
			}
		}
		return true;
	}

	public static boolean contains(Point p, Ring[] rings ) {
		for(Ring r : rings) {
			if(!r.contains(p)) {
				return false;
			}
		}
		return true;
	}
}
