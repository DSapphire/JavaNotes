// Example for PPT Page No.28

import java.awt.event.*;
import javax.swing.*;

public class TestWindowEvent extends JFrame
{
	public static void main(String[] args)
	{
		TestWindowEvent frame=new TestWindowEvent();
		
		frame.setTitle("Test Window Event");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200,80);
		frame.setVisible(true);
	}
	
	public TestWindowEvent()
	{
		addWindowListener(new WindowListener()
		{
			/** Handle for window deiconified event, invoke when a windows is changed from a minimized to a normal size */
			public void windowDeiconified(WindowEvent e)
			{
				System.out.println("Window deiconified");
			}

			/** Handle for window iconified event */
			public void windowIconified(WindowEvent e)
			{
				System.out.println("Window iconified");
			}
			
			/** Handle for windows activated event */
			public void windowActivated(WindowEvent e)
			{
				System.out.println("Window activated");
			}
			
			/** Handle for window deactivated event */
			public void windowDeactivated(WindowEvent e)
			{
				System.out.println("Window edactivated");
			}
			
			/** Handle for window opened event */
			public void windowOpened(WindowEvent e)
			{
				System.out.println("Window opened");
			}
			
			/** Handle for window closed event */
			public void windowClosed(WindowEvent e)
			{
				System.out.println("Window closed");
			}
			
			/** Handle for window closing */
			public void windowClosing(WindowEvent e)
			{
				System.out.println("Window closing");
			}

		}
	
		);
	}
}