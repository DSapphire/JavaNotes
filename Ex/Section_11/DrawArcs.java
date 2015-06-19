// EXAMPLE for PPT page No.20

import java.awt.*;
import javax.swing.*;

public class DrawArcs extends JFrame
{
	public static void main(String[] args)
	{
		DrawArcs frame=new DrawArcs();
		
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250,300);
		frame.setVisible(true);
	}
	
	public DrawArcs()
	{
		setTitle("DrawArcs");
		add(new ArcsPanel());
	}
}

/* The class for drawing arcs on a panel */
class ArcsPanel extends JPanel
{
	// Draw 4 blazes of a fan
	protected void paintComponent(Graphics g)
	{
		super.paintComponents(g);
		
		int xCenter=getWidth()/2;
		int yCenter=getHeight()/2;
		int radius=(int)(Math.min(getWidth(),getHeight())*0.4);
		
		int x=xCenter-radius;
		int y=yCenter-radius;
		
		g.fillArc(x,y,2*radius,2*radius,0,30);
		g.fillArc(x,y,2*radius,2*radius,90,30);
		g.fillArc(x,y,2*radius,2*radius,180,30);
		g.fillArc(x,y,2*radius,2*radius,270,30);
	}
}