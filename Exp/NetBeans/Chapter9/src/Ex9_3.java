import java.awt.*;
import javax.swing.*;
public class Ex9_3 extends JApplet{ //һ��Applet������Ҫ�̳�Japplet��
   public void paint(Graphics g) //����JApplet���е�paint����
   {
      super.paint(g); 
      Graphics2D g2d=(Graphics2D)g; //��ͼ�ζ���ǿ��ת��ΪGraphics2D����
g2d.setPaint(new GradientPaint(0,0,Color.red,180,45,Color.yellow));
                                    //Graphics2D��ķ��������ý���ɫ
      g2d.drawString("This is a Java Applet!",25,25); //�����ַ��� 
   }
}   
