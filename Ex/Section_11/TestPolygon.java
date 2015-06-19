// EXAMPLE for PPT Page No.21

import java.awt.*;
import javax.swing.*;

public class TestPolygon extends JFrame
{
	/** Main method */
	public static void main(String[] args)
	{
		// Create a frame
		TestPolygon frame=new TestPolygon();
		
		// Set the properties for the frame
		frame.setSize(800,400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	/** Constructor for the class */
	public TestPolygon()
	{
		setTitle("Test Polygon");
		add(new PolygonPanel());
	}
}

// Draw a polygon in the panel
class PolygonPanel extends JPanel
{
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		int[] x={320,560,480,360,160};
		int[] y={ 80,160,320,180,240};
		
		g.drawPolygon(x,y,5);
	}
}