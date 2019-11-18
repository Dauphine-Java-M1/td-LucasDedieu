package fr.dauphine.ja.dedieulucas.shapes.view;

import java.awt.Graphics;

import fr.dauphine.ja.dedieulucas.shapes.model.BrokenLine;
import fr.dauphine.ja.dedieulucas.shapes.model.Circle;
import fr.dauphine.ja.dedieulucas.shapes.model.Point;

public class BrokenLineDrawer extends Drawer {

	BrokenLine bl;

	public BrokenLineDrawer(BrokenLine bl) {
		this.bl = bl;
	}
	
	@Override
	public void draw(Graphics g) {
		if(bl.nbPoints()==0) {
			return;
		}
		for(int i=0; i+1<bl.nbPoints(); i++) {
			g.drawLine(bl.getPointList().get(i).getX(), bl.getPointList().get(i).getY(), bl.getPointList().get(i+1).getX(), bl.getPointList().get(i+1).getY());
		}
		
	}


}
