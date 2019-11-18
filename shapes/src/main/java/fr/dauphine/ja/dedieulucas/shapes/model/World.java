package fr.dauphine.ja.dedieulucas.shapes.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class World extends Observable{
	private List<Shape> shapeList = new ArrayList<Shape>();
	
	
	
	public List<Shape> getShapeList(){
		return shapeList;
	}
	
	public void addShape(Shape shape) {
		shapeList.add(shape);
	}
	
	
	
}
