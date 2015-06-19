// Example for PPT page No.12

import java.awt.*;
import javax.swing.*;

public class TestPaintComponent extends JFrame
{
	public static void main(String[] args)
	{
		// Create a new frame
		TestPaintComponent frame=new TestPaintComponent();

		// Set properties of the frame
		frame.setTitle("Test Paint Component");
		frame.setSize(400,250);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	// Constructor
	public TestPaintComponent()
	{
		// Add a panel in the frame
		add(new NewPanel());
	}
}

class NewPanel extends JPanel
{
	// Setup the image
	private ImageIcon imageIcon=new ImageIcon("image/china.gif");
	private Image image=imageIcon.getImage();
	
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		// Draw a line in the panel
		g.drawLine(0,0,50,150);
		
		// Draw the flag in the rectangle arae
		g.drawImage(image,50,0,200,150,this);
	}
}