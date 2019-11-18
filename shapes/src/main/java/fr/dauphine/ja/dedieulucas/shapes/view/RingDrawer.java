package fr.dauphine.ja.dedieulucas.shapes.view;

import java.awt.Graphics;

import fr.dauphine.ja.dedieulucas.shapes.model.Circle;
import fr.dauphine.ja.dedieulucas.shapes.model.Ring;

public class RingDrawer extends CircleDrawer {
	private Ring ring;

	public RingDrawer(Ring ring) {
		super(ring);
		this.ring = ring;
	}

	@Override
	public void draw(Graphics g) {
		super.draw(g);
		int radius = ring.getInternalRadius();
		g.drawOval(ring.getCenter().getX()-radius/2, ring.getCenter().getY()-radius/2, radius, radius);
		
	}

}
