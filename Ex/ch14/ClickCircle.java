import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ClickCircle extends JFrame
{
	private MovablePanel p=new MovablePanel();
	public ClickCircle()
	{
		setTitle("Move Circle");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		add(p);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args)
	{
		new ClickCircle();
	}
}
class MovablePanel extends JPanel
{
	private int x;
	private int y;
	private int radius=10;
	private int cnt=0;
	private int max=20;
	private Color color=null;
	private long start=System.currentTimeMillis();
	private long end;
	private String s;
	public MovablePanel()
	{
		addMouseListener(new MouseListener()
		{
			public void mouseClicked(MouseEvent e)
			{
				end=System.currentTimeMillis();
				int nx=e.getX();
				int ny=e.getY();
				double dis=Math.sqrt((nx-x)*(nx-x)+(ny-y)*(ny-y));
				if(dis<radius)
				{
					cnt++;
					repaint();
				}
			}
			public void mousePressed(MouseEvent e)
			{

			}
			public void mouseReleased(MouseEvent e)
			{

			}
			public void mouseExited(MouseEvent e)
			{

			}
			public void mouseEntered(MouseEvent e)
			{

			}
		}
		);
	}
	private void myChange()
	{
		x=(int)((getWidth()-2*radius)*Math.random())+radius;
		y=(int)((getHeight()-2*radius)*Math.random())+radius;
		color=new Color((int)(255*Math.random()),
			(int)(255*Math.random()),
			(int)(255*Math.random()));
	}
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		if(cnt<max)
		{
			s=""+cnt+" times clicked.";
			g.setFont(new Font(Font.SERIF, Font.BOLD, 30));
			g.drawString(s,0,30);

			myChange();
			g.setColor(color);
			g.fillOval(x-radius,y-radius,2*radius,2*radius);
			
		}
		else if(cnt==max)
		{
			int min=(int)((end- start)/1000)/60;
			int second=(int)((end- start)/1000)%60;
			s=""+min+" min "+second+" second";
			g.setFont(new Font(Font.SERIF, Font.BOLD, 30));
			g.drawString(s,getWidth()/8,getHeight()/2);
		}
	}
}