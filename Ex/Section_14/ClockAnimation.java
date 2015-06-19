// Example for PPT page No.32

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ClockAnimation extends JFrame
{
	private StillClock clock=new StillClock();
	
	public ClockAnimation()
	{
		add(clock);
		
		// Create a timer with delay 1000ms
		Timer timer=new Timer(1000,new TimerListener());
		timer.start();
	}
	
	private class TimerListener implements ActionListener
	{
		/** Handle the action event */
		public void actionPerformed(ActionEvent e)
		{
			// Set new time and repaint the clock display current time
			clock.setCurrentTime();
			clock.repaint();
		}
	}
	
	/** Main method */
	public static void main(String[] args)
	{
		ClockAnimation frame=new ClockAnimation();
		
		frame.setTitle("Clock Animation");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200,200);
		frame.setVisible(true);
	}
}