// Example for PPT page No.

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ControlCircle2 extends JFrame
{
	private JButton jbtEnlarge=new JButton("Enlarge");
	private JButton jbtShrink=new JButton("Shrink");
	
	private CirclePanel canvas=new CirclePanel();
	
	/** Main method */
	public static void main(String[] args)
	{
		JFrame frame=new ControlCircle2();
		
		frame.setTitle("Control Circle 2");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200,200);
		frame.setVisible(true);
	}
	
	public ControlCircle2()
	{
		JPanel panel=new JPanel();
		panel.add(jbtEnlarge);
		panel.add(jbtShrink);
		
		this.add(canvas,BorderLayout.CENTER);
		this.add(panel,BorderLayout.SOUTH);
		
		// Register listeners
		jbtEnlarge.addActionListener(new Listener());
		jbtShrink.addActionListener(new Listener());
	}
	
	class Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.out.println(new java.util.Date(e.getWhen()));
			if(e.getSource()==jbtEnlarge)
			{
				canvas.enlarge();
			}
			else if(e.getSource()==jbtShrink)
			{
				canvas.shrink();
			}
		}
	}
	
	class CirclePanel extends JPanel
	{
		private int radius=5;
		
		/** Enlarge the circle */
		public void enlarge()
		{
			radius++;
			if(radius>getWidth()/2)
			{
				radius=getWidth()/2;
			}
			repaint();
		}
		
		public void shrink()
		{
			radius--;
			if (radius==0)
			{
				radius=1;
			}
			repaint();
		}
		
		/** Repaint the circle */
		protected void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.drawOval(getWidth()/2-radius,getHeight()/2-radius,2*radius,2*radius);
		}
	}
}