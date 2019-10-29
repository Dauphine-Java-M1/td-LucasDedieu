package fr.dauphine.ja.dedieulucas.shapes.view;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyDisplay extends JPanel {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Java Avancée - Graphic Display");
		frame.setSize(new Dimension(1280,720));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyDisplay d = new MyDisplay();
		frame.add(d);


	}
	
	@Override
	protected void paintComponent(Graphics g) {
		g.drawLine(10, 10, 10, 10);
	}

}
