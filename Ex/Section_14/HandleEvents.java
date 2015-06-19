//Example for PPT Page No.27

import javax.swing.*;
import java.awt.event.*;

public class HandleEvents extends JFrame
{ 
	public HandleEvents()
	{ 
		//Create two Buttons
		JButton jbtOk=new JButton("Ok");
		JButton jbtCancel=new JButton("Cancel");

		//Create a panel to hold buttons
		JPanel panel=new JPanel();

		panel.add(jbtOk);
		panel.add(jbtCancel);

		//Add panel to the frame
		add(panel);

		//Register listeners
		OkListenerClass listener1=new OkListenerClass();
		CancelListenerClass listener2=new CancelListenerClass();

		jbtOk.addActionListener(listener1);
		jbtCancel.addActionListener(listener2);
	}

	public static void main(String[] args)
	{
		JFrame frame=new HandleEvents();

		frame.setTitle("Handle Event");
		frame.setSize(200,150);
		frame.setLocation(200,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class OkListenerClass implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("OK button clicked");
	}
}

class CancelListenerClass implements ActionListener
{ 
	public void actionPerformed(ActionEvent e)
	{ 
		System.out.println("Cancel button clicked");
	}
}