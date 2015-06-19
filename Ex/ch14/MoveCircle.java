import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MoveCircle extends JFrame
{
	private KeyboardPanel p=new KeyboardPanel();
	public MoveCircle()
	{
		setTitle("Move Circle");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		add(p);
		p.setFocusable(true);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args)
	{
		new MoveCircle();
	}
}
class KeyboardPanel extends JPanel
{
	private int x=0;
	private int y=0;
	private int radius=50;
	public KeyboardPanel()
	{
		addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent e)
			{
				switch(e.getKeyCode())
				{
					case KeyEvent.VK_DOWN: 	y+=10; break;
					case KeyEvent.VK_UP: 	y-=10; break;
					case KeyEvent.VK_LEFT: 	x-=10; break;
					case KeyEvent.VK_RIGHT: x+=10; break;
					default:break;
				}
				repaint();
			}
		}
		);
	}
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		//System.out.println(x+y);
		g.drawOval(getWidth()/2-radius+x,getHeight()/2-radius+y,2*radius,2*radius);
	}
}