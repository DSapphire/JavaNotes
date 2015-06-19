// Example for PPT page No.26

import java.awt.*;
import javax.swing.*;

public class TestMessagePanel extends JFrame
{
	/** Main method */
	public static void main(String[] args)
	{
		// Create a frame
		TestMessagePanel frame=new TestMessagePanel();

		// Set properties for the frame	
		frame.setSize(800,400);
		frame.setTitle("Test Message Panel");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	/** Constructor */
	public TestMessagePanel()
	{
		MessagePanel messagePanel1=new MessagePanel("Welcome to Java");
		MessagePanel messagePanel2=new MessagePanel("Java is fun");
		MessagePanel messagePanel3=new MessagePanel("Java is cool");
		MessagePanel messagePanel4=new MessagePanel("I love Java");

		messagePanel1.setFont(new Font("SansSerif",Font.ITALIC,40));
		messagePanel2.setFont(new Font("Courie",Font.BOLD,40));
		messagePanel3.setFont(new Font("Time New Roman",Font.ITALIC,40));
		messagePanel4.setFont(new Font("Californian FB",Font.PLAIN,40));

		messagePanel1.setBackground(Color.RED);
		messagePanel2.setBackground(Color.CYAN);
		messagePanel3.setBackground(Color.GREEN);
		messagePanel4.setBackground(Color.WHITE);
		
		setLayout(new GridLayout(2,2));
		
		add(messagePanel1);
		add(messagePanel2);
		add(messagePanel3);
		add(messagePanel4);
	}
}