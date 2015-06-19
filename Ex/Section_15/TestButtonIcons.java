// Example for PPT Page No.10

import javax.swing.*;
import java.awt.*;

public class TestButtonIcons extends JFrame
{
	public static void main(String[] args)
	{
		// Create a frame and set its properties
		JFrame frame=new TestButtonIcons();
		
		frame.setTitle("Button Icons");
		frame.setSize(200,100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	/** Constructor */
	public TestButtonIcons()
	{
		ImageIcon icon0=new ImageIcon("image/flagIcon2.gif");
		ImageIcon icon1=new ImageIcon("image/flagIcon5.gif");
		ImageIcon icon2=new ImageIcon("image/flagIcon6.gif");
		
		JButton jbt=new JButton("Click it",icon0);
		jbt.setPressedIcon(icon1);
		jbt.setRolloverIcon(icon2);
		
		add(jbt,BorderLayout.CENTER);
	}
}