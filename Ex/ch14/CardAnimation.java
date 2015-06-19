import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardAnimation extends JFrame
{
	public CardAnimation()
	{
		setTitle("Card");
		setSize(200,300);
	}
	public void loadView()
	{
		CardPanel cp=new CardPanel(2000);
		add(cp);
		cp.setPreferredSize(new Dimension(72,96));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	public static void main(String[] args)
	{
		new CardAnimation().loadView();
	}
}
class CardPanel extends JPanel
{
	static int cnt=1;
	Image image=null;
	public CardPanel(int delay)
	{
		Timer timer=new Timer(delay, new TimerListener());
		timer.start();
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		if(image!=null)
		{
			g.drawImage(image,0,0,getPreferredSize().width,getPreferredSize().height,this);
		}
	}
	
	class TimerListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			image=null;
			image=new ImageIcon("card/"+cnt+".png").getImage();
			cnt++;
			if(cnt>10)
				cnt=1;
			repaint();
		}
	}
}