// Example for PPT page No.30

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MoveMessageDemo extends JFrame
{
	public MoveMessageDemo()
	{
		// Create a movable message panel instance for moving a message
		MovableMessagePanel p=new MovableMessagePanel("Welcome to Java");
		
		// Put the message panel in the frame
		setLayout(new BorderLayout());
		add(p);
	}
	
	/** Main method */
	public static void main(String[] args)
	{
		MoveMessageDemo frame=new MoveMessageDemo();
		
		frame.setTitle("Move Message Demo");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,400);
		frame.setVisible(true);
	}
	
	// Inner class: MovableMessagePanel draws a message
	static class MovableMessagePanel extends JPanel
	{
		private String message="Welcome to Java";
		private int x=20;
		private int y=20;
		
		/** Constructor */
		public MovableMessagePanel(String s)
		{
			message=s;
			
			addMouseMotionListener(new MouseMotionListener()
			{
				/** Handle mouse-dragged event */
				public void mouseDragged(MouseEvent e)
				{
					// Get the new location and repaint the screen
					x=e.getX();
					y=e.getY();
					repaint();
				}
				
				/** Handle mouse-moved event */
				public void mouseMoved(MouseEvent e)
				{
				}
			}
			);
		}
		
		/** Paint the component */
		protected void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.drawString(message,x,y);
		}
	}
}