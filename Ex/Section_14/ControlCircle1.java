// Example for PPT page No.

import java.awt.*;
import javax.swing.*;

public class ControlCircle1 extends JFrame
{
	private JButton jbtEnlarge=new JButton("Enlarge");
	private JButton jbtShrink=new JButton("Shrink");
	
	private CirclePanel canvas=new CirclePanel();
	
	/** Main method */
	public static void main(String[] args)
	{
		JFrame frame=new ControlCircle1();
		
		frame.setTitle("Control Circle 1");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200,200);
		frame.setVisible(true);
	}
	
	/** Constructor */
	public ControlCircle1()
	{
		JPanel panel=new JPanel();
		panel.add(jbtEnlarge);
		panel.add(jbtShrink);
		
		setLayout(new BorderLayout());
		this.add(canvas,BorderLayout.CENTER);
		this.add(panel,BorderLayout.SOUTH);
	}

	class CirclePanel extends JPanel
	{
		private int radius=5; // Default circle radius

		protected void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.drawOval(getWidth()/2-radius,getHeight()/2-radius,2*radius,2*radius);
		}
	}
}