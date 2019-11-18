package fr.dauphine.ja.dedieulucas.shapes.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;

import fr.dauphine.ja.dedieulucas.shapes.model.BrokenLine;
import fr.dauphine.ja.dedieulucas.shapes.model.Circle;
import fr.dauphine.ja.dedieulucas.shapes.model.Point;
import fr.dauphine.ja.dedieulucas.shapes.model.Ring;
import fr.dauphine.ja.dedieulucas.shapes.model.Shape;
import fr.dauphine.ja.dedieulucas.shapes.model.World;

public class MyDisplay extends JPanel implements Observer{
	private static World world = new World();

	public static void main(String[] args) {
		JFrame frame = new JFrame("Java Avancée - Graphic Display");
		frame.setSize(new Dimension(1920,1080));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Point p1 = new Point(100,100);
		Point p2 = new Point(1000,500);
		Point p3 = new Point(1444,900);
		Point p4 = new Point(1900,1000);		
		BrokenLine bl = new BrokenLine();
		bl.add(p1);
		bl.add(p2);
		bl.add(p3);
		bl.add(p3);
		bl.add(p4);
		world.addShape(bl);
		
		
		Circle circle = new Circle(p1,100);
		world.addShape(circle);
		
		
		Ring ring = new Ring(p2, 500, 450);
		world.addShape(ring);
	
		
		
		MyDisplay d = new MyDisplay();
		frame.add(d);
		
		

	}
	
	@Override
	protected void paintComponent(Graphics g) {
		for(Shape shape : world.getShapeList()) {
			shape.draw(g);
		}
		
	}
	

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

}
