// Example for PPT page No.26
import java.awt.*;
import javax.swing.*;

public class MessagePanel extends JPanel
{
	/** The message to be displayed */
	private String message="Hello World!";
	
	/** The x coordinate where the message is displayed */
	private int xCoordinate=10;
	
	/** The y coordinate where the message is displayed */
	private int yCoordinate=50;
	
	/** Indicate whether the message is displayed in the center */
	private boolean centered;
	
	/** The interval for moving the message horizontally and vertically */
	private int interval=10;
	
	/** Construct with default properties */
	public MessagePanel()
	{
	}
	
	/** Construct a message panel with a specified message */
	public MessagePanel(String message)
	{
		this.message=message;
	}
	
	/** Return message */
	public String getMessage()
	{
		return message;
	}
	
	/** Set a new message */
	public void setMessage(String message)
	{
		this.message=message;
		repaint();
	}
	
	/** Return xCoordinate */
	public int getXCoordinate()
	{
		return xCoordinate;
	}
	
	/** Set a new xCoordinate */
	public void setXCoordinate(int x)
	{
		this.xCoordinate=x;
		repaint();
	}
	
	/** Return yCoordinate */
	public int getYCoordinate()
	{
		return yCoordinate;
	}
	
	/** Set a new yCoordinate */
	public void setYCoordinate(int y)
	{
		this.yCoordinate=y;
		repaint();
	}
	
	/** Return centered */
	public boolean isCentered()
	{
		return centered;
	}
	
	/** Set a new centered */
	public void setCentered(boolean centered)
	{
		this.centered=centered;
		repaint();
	}
	
	/** Return interval */
	public int getInterval()
	{
		return interval;
	}
	
	/** Set a new interval */
	public void setInterval(int interval)
	{
		this.interval=interval;
	}
	
	/** Paint the message */
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		if(centered)
		{
			// Get font metrics for the current font
			FontMetrics fm=g.getFontMetrics();
			
			// Find the center location to display
			int stringWidth=fm.stringWidth(message);
			int stringAscent=fm.getAscent();
			
			// Get the position of the leftmost character in the baseline
			xCoordinate=getWidth()/2-stringWidth/2;
			yCoordinate=getHeight()/2+stringAscent/2;
		}

		g.drawString(message,xCoordinate,yCoordinate);
	}
	
	/** Move the message left */
	public void moveLeft()
	{
		xCoordinate-=interval;
		repaint();
	}
	
	/** Move the message right */
	public void moveRight()
	{
		xCoordinate+=interval;
		repaint();
	}
	
	/** Move the message up */
	public void moveUp()
	{
		yCoordinate-=interval;
		repaint();
	}
	
	/** move the message down */
	public void moveDown()
	{
		yCoordinate+=interval;
		repaint();
	}
	
	/** Override get method for preferredSize */
	public Dimension getPreferredSize()
	{
		return new Dimension(200,60);
	}
}