// Example for PPT page No.14, 15, 16, 17

import java.awt.*;
import javax.swing.*;

public class Try extends JFrame
{
	public static void main(String[] args)
	{
		// Create a new frame
		Try frame=new Try();

		// Set properties of the frame
		frame.setTitle("Test Paint Component");
		frame.setSize(400,250);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	// Constructor
	public Try()
	{
		// Add a panel in the frame
		add(new NewPanel());
	}
}

class NewPanel extends JPanel
{
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		// Draw a string
		g.drawOval(50,50,200,100);
		g.drawRect(50,50,200,100);
	}
}