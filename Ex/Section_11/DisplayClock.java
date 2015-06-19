// Example for PPT page No.27

import java.awt.*;
import javax.swing.*;

public class DisplayClock extends JFrame
{
	/** Main method */
	public static void main(String[] args)
	{
		// Create a clock object
		DisplayClock frame=new DisplayClock();
		
		// Set the properties
		frame.setTitle("Display Clock");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,350);
		frame.setVisible(true);
	}
	
	/** Constructor */
	public DisplayClock()
	{
		// Create an analog clock for the current time
		StillClock clock=new StillClock();
		
		// Display hour,minute, and seconds in the message panel
		MessagePanel messagePanel=new MessagePanel(clock.getHour()+":"+clock.getMinute()+":"+clock.getSecond());
		messagePanel.setCentered(true);
		messagePanel.setForeground(Color.BLUE);
		messagePanel.setFont(new Font("COurie",Font.BOLD,16));
		
		// Add the clock and message panel to the frame
		add(clock);
		add(messagePanel,BorderLayout.SOUTH);
	}
}