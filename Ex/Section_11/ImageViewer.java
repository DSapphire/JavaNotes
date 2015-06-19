// Example for PPT page No.29

import java.awt.*;
import javax.swing.*;

public class ImageViewer extends JPanel
{
	/** Hold value of property image */
	private java.awt.Image image;
	
	/** Hold value of property stretched */
	private boolean stretched=true;
	
	/** Hold value of property xCoordinate and yCoordinate */
	private int xCoordinate;
	private int yCoordinate;
	
	/** Construct an empty image viewer */
	public ImageViewer()
	{
	}
	
	/** Construct an image viewer for a specified image object */
	public ImageViewer(Image image)
	{
		this.image=image;
	}
	
	/** Return value of image */
	public java.awt.Image getImage()
	{
		return image;
	}

	/** Set a new image */
	public void setImage(java.awt.Image image)
	{
		this.image=image;
		repaint();
	}
	
	/** Return the property of stretched */
	public boolean isStretched()
	{
		return stretched;
	}
	
	/** Set stretched */
	public void setStretched(boolean stretched)
	{
		this.stretched=stretched;
		repaint();
	}
	
	/** Return xCoordinate */
	public int getXCoordinate()
	{
		return xCoordinate;
	}
	
	/** Set xCoordinate */
	public void setXCoordinate(int xCoordinate)
	{
		this.xCoordinate=xCoordinate;
		repaint();
	}
	
	/** Return yCoordinate */
	public int getYCoordinate()
	{
		return yCoordinate;
	}
	
	/** Set yCoordinate */
	public void setYCoordinate(int yCoordinate)
	{
		this.yCoordinate=yCoordinate;
		repaint();
	}

	// Draw the image */
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		if(image!=null)
		{
			if(isStretched())
			{
				g.drawImage(image,xCoordinate,yCoordinate,getSize().width,getSize().height,this);
			}
			else
			{
				g.drawImage(image,xCoordinate,yCoordinate,this);
			}
		}
	}
}