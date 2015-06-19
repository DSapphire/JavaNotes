// Example for PPT Page No.11, 12, 13,14

import java.awt.*;
import javax.swing.*;

public class TestButtonTextPosition
{
	public static void main(String[] args)
	{
		// Create an image icon from image file
		ImageIcon icon=new ImageIcon("image/grapes.gif");
		
		// Create a label with text, icon
		JLabel jlbl=new JLabel("Grapes",icon,SwingConstants.CENTER);
		
		// Set alignment for label's text and icon
		jlbl.setHorizontalAlignment(SwingConstants.CENTER);
		jlbl.setVerticalAlignment(SwingConstants.CENTER);

		// Set test position for icon
		jlbl.setHorizontalTextPosition(SwingConstants.RIGHT);
		jlbl.setVerticalTextPosition(SwingConstants.CENTER);

		// Set gap between text and icon
		jlbl.setIconTextGap(5);
		
		// Create a frame and set its properties
		JFrame frame=new JFrame("Text and Icon Label");

		frame.add(jlbl,BorderLayout.CENTER);
		
		frame.setSize(300,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}