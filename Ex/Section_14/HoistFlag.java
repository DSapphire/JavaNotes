// Example for PPT page No.5

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.net.*;

public class HoistFlag extends JFrame
{
	public HoistFlag() 
	{
		URL imageURL = this.getClass().getResource("image/china.gif");
		Image image = new ImageIcon(imageURL).getImage();
		add(new FlagAnthemPanel(image));
	}

	public static class FlagAnthemPanel extends JPanel
	{
		private Image image;
		private Timer timer = new Timer(10, new Listener());

		int x = 50;
		int y = 150;

		public FlagAnthemPanel(Image image)
		{
			this.image = image;
			timer.start();

		}

		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);

			if (y > 0) 
			{
				y -= 1;
			}

			g.drawImage(image, x, y, 60, 40, this);
			g.drawLine(50,0,50,200);
		}
    
		class Listener implements ActionListener
		{
			public void actionPerformed(ActionEvent e) 
			{
				repaint();
			}
		}
	}

	public static void main(String[] args) 
	{
		// Create a frame
		JFrame frame = new HoistFlag();
		frame.setTitle("HoistFlag");
    
		// Display the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setVisible(true);
	}
}