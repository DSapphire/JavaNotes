// Example for PPT page No.32

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnimationDemo extends JFrame
{
	public AnimationDemo()
	{
		// Create a moving message panel for display moving message
		this.setLayout(new GridLayout(2,1));
		add(new MovingMessagePanel("Message moving?",1000));
		add(new MovingMessagePanel("2410!",500));
	}
	
	/** Main method */
	public static void main(String[] args)
	{
		AnimationDemo frame=new AnimationDemo();
		
		frame.setTitle("Animation Demo");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(280,100);
		frame.setVisible(true);
	}
	
	// Inner class: Displaying a moving message
	static class MovingMessagePanel extends JPanel
	{
		private String message="Welcome to Java";
		private int x=0;
		private int y=20;
		
		public MovingMessagePanel(String message,int delay)
		{
			this.message=message;
			
			// Create a timer
			Timer timer=new Timer(delay, new TimerListener());
			timer.start();
		}
		
		/** Paint message */
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			
			if(x>getWidth())
			{
				x=-20;
			}
			x+=5;
			
			g.drawString(message,x,y);
		}
		
		class TimerListener implements ActionListener
		{
			/** Handle action event */
			public void actionPerformed(ActionEvent e)
			{
				repaint();
			}
		}
	}
}