// Example for PPT page No.22

import java.awt.*;
import javax.swing.*;

public class DrawPolygon extends JFrame
{
	/** Main method */
	public static void main(String[] args)
	{
		// Create a frame
		DrawPolygon frame=new DrawPolygon();
		
		// Set the properties for the frame
		frame.setSize(800,600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	/** Constructor */
	public DrawPolygon()
	{
		setTitle("Draw Polygon");
		add(new PolygonsPanel());
	}
}

// Draw a polygon in the panel
class PolygonsPanel extends JPanel
{
	protected void paintComponent(Graphics g)
	{
		super.paintComponents(g);
		
		int xCenter=getWidth()/2;
		int yCenter=getHeight()/2;
		int radius=(int)(Math.min(getWidth(),getHeight())*0.4);
		
		// Create a Polygon object
		Polygon p=new Polygon();
		
		// Add points to the polygon
		final int K=8;
		
		p.addPoint(xCenter+radius,yCenter);
		
		for(int i=1;i<K;i++)
		{
			p.addPoint((int)(xCenter+radius*Math.cos(2*i*Math.PI/K)),(int)(yCenter-radius*Math.sin(2*i*Math.PI/K)));
		}
		
		// Draw the polygon
		g.drawPolygon(p);
	}
}