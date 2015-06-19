// Example for PPT page No.25

import java.awt.*;
import javax.swing.*;

public class TestCenterMessage extends JFrame
{
	/** Main method */
	public static void main(String[] args)
	{
		// Create a frame
		TestCenterMessage frame=new TestCenterMessage();
		
		// Set up properties for the frame
		frame.setSize(600,400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	/** Constructor for TestCenterMessage class */
	public TestCenterMessage()
	{
		CenterMessage messagePanel=new CenterMessage();
		add(messagePanel);
		
		messagePanel.setBackground(Color.WHITE);
		messagePanel.setFont(new Font("Californian FB",Font.BOLD,60));
	}
}

// Draw a message in the panel
class CenterMessage extends JPanel
{
	/** Paint the message */
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		// Get font metrics for the current font
		FontMetrics fm=g.getFontMetrics();
		
		// Find the center location to display
		int stringWidth=fm.stringWidth("Welcome to Java");
		int stringAscent=fm.getAscent();
		
		// Get the position of the leftmost character in the baseline
		int xCoordinate=getWidth()/2-stringWidth/2;
		int yCoordinate=getHeight()/2+stringAscent/2;
		
		g.drawString("Welcome to Java",xCoordinate,yCoordinate);
	}
}