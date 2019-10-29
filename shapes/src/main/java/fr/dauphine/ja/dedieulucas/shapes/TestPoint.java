package fr.dauphine.ja.dedieulucas.shapes;

import java.util.ArrayList;
import java.util.List;

import fr.dauphine.ja.dedieulucas.shapes.model.BrokenLine;
import fr.dauphine.ja.dedieulucas.shapes.model.Circle;
import fr.dauphine.ja.dedieulucas.shapes.model.Point;
import fr.dauphine.ja.dedieulucas.shapes.model.Ring;

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
		
		BrokenLine bl = new BrokenLine(5);
		bl.add(null);
		System.out.println(bl.contain(null));
		
		Point p=new Point(1,2);
		//Circle c=new Circle(p,1);
		Circle c2=new Circle(p,2);
		c2.translate(1,1);
	//	System.out.println(c+" "+c2);
		
		Circle c=new Circle(new Point(1,2), 5);
		c.getCenter().translate(1,1);
		System.out.println(c);
		System.out.println(c.surface());
		System.out.println(c.contains(new Point(1,7)));

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
