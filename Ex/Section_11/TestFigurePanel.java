// Example for PPT page No.18

import java.awt.*;
import javax.swing.*;

public class TestFigurePanel extends JFrame
{
	public static void main(String[] args)
	{
		// Create a frame
		TestFigurePanel frame=new TestFigurePanel();
		
		// Set up the properties for the frame
		frame.setTitle("Test Figure Panel");
		frame.setSize(400,200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	// Constructor for the class
	public TestFigurePanel()
	{
		// Set up the Layout
		setLayout(new GridLayout(2,3,5,5));
		
		// Add the component to the frame
		add(new FigurePanel(FigurePanel.LINE));
		add(new FigurePanel(FigurePanel.RECTANGLE));
		add(new FigurePanel(FigurePanel.ROUND_RECTANGLE));
		add(new FigurePanel(FigurePanel.OVAL));
		add(new FigurePanel(FigurePanel.RECTANGLE,true));
		add(new FigurePanel(FigurePanel.ROUND_RECTANGLE,true));
	}
}