import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo1 extends JFrame{
	public Demo1(){

	}
	public void drawDemo(){
		setSize(400,400);
		JPanel mainPanel=new JPanel(new GridLayout(2,2,10,10));
		setContentPane(mainPanel);
		mainPanel.add(new MyPanel());
		mainPanel.add(new MyPanel());
		mainPanel.add(new MyPanel());
		mainPanel.add(new MyPanel());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		Demo1 demo=new Demo1();
		demo.drawDemo();
	}
}
class MyPanel extends JPanel{
	@Override
	protected void paintComponent(Graphics g){
		g.drawArc(0, 0, getWidth(), getHeight(), 0, 360);
		g.setColor(Color.RED);
		for(int i=0;i<4;i++){
			g.fillArc( getWidth()/20, getHeight()/20, getWidth()*9/10, getHeight()*9/10, i*90, 45);
		}
	}
}
