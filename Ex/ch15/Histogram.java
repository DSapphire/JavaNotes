import javax.swing.*;
import java.awt.*;
import java.util.Random;
public class Histogram extends JPanel 
{
	private int[] count;
	public void showHistogram(int[] count) 
	{
		this.count = count;
		repaint();
	}
	protected void paintComponent(Graphics g) 
	{
		if (count == null)
		{
			return;
		}
		super.paintComponent(g);
		int width = getWidth();
		int height = getHeight();
		int interval = (width - 40) / count.length;
		int individualWidth = (int)(((width - 40) / 24) * 0.60);

		// Find the maximum count.default 10
		int maxCount =10;
		for (int i = 0; i < count.length; i++) 
		{
			if (maxCount < count[i])
			{
				maxCount = count[i];
			}
		}
		int x = 30;
		//ran for random color
		Random ran=new Random();
	
		g.drawLine(10, height - 45, width - 10, height - 45);
		for (int i = 0; i < count.length; i++) 
		{
			
			int barHeight = (int)(((double)count[i] / (double)maxCount) * (height - 55));

			//get random color
			g.setColor(new Color(ran.nextInt(255),
							ran.nextInt(255),
							ran.nextInt(255)));
			g.fillRect(x, height - 45 - barHeight, individualWidth, barHeight);

			// Display a letter up the bar
			g.setColor(new Color(1,1,1));
			g.drawString((char)(65 + i) + "", x,  height - 50 - barHeight);
			x += interval;
		}
	}
	public Dimension getPreferredSize() 
	{
		//500
		return new Dimension(500, 300);
	}
}