

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Ex9_12 extends JFrame 
{
  int x,y;
  public Ex9_12()
  {
	this.setTitle ("线程演示");
	Container c=this.getContentPane();
	JLabel L=new JLabel("点击可以画线哟",JLabel.CENTER);	
	c.add(L,BorderLayout.CENTER);		
	JButton b=new JButton("试试按我");
	b.setBorder (BorderFactory.createLineBorder (Color.red,5)); //为按钮创建边框
	c.add(b,BorderLayout.SOUTH);
	L.addMouseListener (new MouseAdapter(){
	  public void mousePressed(MouseEvent e){  //在标签上按鼠标时触发
	    x=e.getX();  //获得按点的横坐标
	    y=e.getY();  //获得按点的纵坐标
	    repaint();   //重绘组件
	  }
    });		
    b.addActionListener(new ActionListener(){
	  public void actionPerformed(ActionEvent e){
	    new newThread().start();
	  }
    });
	this.setSize (300,400);
	this.show ();        	//显示
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
		
  public void update(Graphics g)
  {		
	g.drawLine(0,0,x,y);  //画线
  }
		
  public static void main(String[] args)
  {
	new Ex9_12();
  }
}

class newThread extends Thread
{
	public void run()
	{
	  while(true);
	}
}        
   