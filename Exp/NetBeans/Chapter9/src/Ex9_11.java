//Ex9_10.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Ex9_11 extends JFrame 
{
  int x,y;
  public Ex9_11()
  {
	this.setTitle ("�߳���ʾ");
	Container c=this.getContentPane();
	JLabel L=new JLabel("������Ի���Ӵ",JLabel.CENTER);	
	c.add(L,BorderLayout.CENTER);		
	JButton b=new JButton("���԰��ң����ڰ�");
	b.setBorder (BorderFactory.createLineBorder (Color.red,5)); //Ϊ��ť�����߿�
	c.add(b,BorderLayout.SOUTH);
	L.addMouseListener (new MouseAdapter(){
	  public void mousePressed(MouseEvent e){  //�ڱ�ǩ�ϰ����ʱ����
	    x=e.getX();  //��ð���ĺ�����
	    y=e.getY();  //��ð����������
	    repaint();   //�ػ����
	  }
        });		
        b.addActionListener(new ActionListener(){
	  public void actionPerformed(ActionEvent e){
	    while(true){}//�����ť�������ѭ��
	  }
        });
	this.setSize (300,400);
	this.show ();        	//��ʾ
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
		
  public void update(Graphics g)
  {		
	g.drawLine(0,0,x,y);  //����
  }
		
  public static void main(String[] args)
  {
	new Ex9_11();
  }
}
