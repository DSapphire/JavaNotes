// Example for PPT page No.15,17,19,23

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonDemo extends JFrame
{
	// Create a panel for displaying message
	protected MessagePanel messagePanel=new MessagePanel("Welcome to Java");
	
	// Declare buttons to move the message
	private JButton jbtLeft=new JButton("Left");
	private JButton jbtRight=new JButton("Right");
	
	public static void main(String[] args)
	{
		ButtonDemo frame=new ButtonDemo();
		
		frame.setTitle("Button Demo");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,200);
		frame.setVisible(true);
	}
	
	/** Constructor */
	public ButtonDemo()
	{
		// Set the background color
		messagePanel.setBackground(Color.WHITE);
		
		// Create Panel jpButtons to hold two buttons
		JPanel jpButtons=new JPanel();
		jpButtons.add(jbtLeft);
		jpButtons.add(jbtRight);
		
		// Set keyboard mnemonics
		jbtLeft.setMnemonic('L');
		jbtRight.setMnemonic('R');
		
		// Set tool tip text on the buttons
		jbtLeft.setToolTipText("Move message to left");
		jbtRight.setToolTipText("Move message to right");
		
		// Place panels in the frame
		setLayout(new BorderLayout());
		add(messagePanel,BorderLayout.CENTER);
		add(jpButtons,BorderLayout.SOUTH);
		
		// Register listeners with the buttons
		jbtLeft.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				messagePanel.moveLeft();
			}
		}
		);
		
		jbtRight.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				messagePanel.moveRight();
			}
		}
		);
		
	}
}