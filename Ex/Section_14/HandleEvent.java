// Example for PPT page No.15

import javax.swing.*;
import java.awt.event.*;

public class HandleEvent extends JFrame
{
	public HandleEvent()
	{
		//Create OK Button
		JButton jbt=new JButton("Ok");

		//Add the button to the frame
		add(jbt);

		//Register listener
		OkListener listener=new OkListener();

		jbt.addActionListener(listener);
	}

	public static void main(String[] args)
	{ 
		JFrame frame=new HandleEvent();

		frame.setTitle("Handle Event");
		frame.setSize(200,150);
		frame.setLocation(200,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class OkListener implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("OK button clicked");
	}
}

class CancelListenerClass implements ActionListener
{ public void actionPerformed(ActionEvent e)
  { System.out.println("Cancel button clicked");
  }
}