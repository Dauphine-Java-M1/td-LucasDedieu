package fr.dauphine.ja.dedieulucas.shapes.view;

import java.awt.Graphics;

import fr.dauphine.ja.dedieulucas.shapes.model.Circle;

public class CircleDrawer extends Drawer {
	private Circle circle;

	public CircleDrawer(Circle circle) {
		this.circle = circle;
	}
	
	@Override
	public void draw(Graphics g) {
		int radius = circle.getRadius();
		g.drawOval(circle.getCenter().getX()-radius/2, circle.getCenter().getY()-radius/2, radius, radius);}

}
