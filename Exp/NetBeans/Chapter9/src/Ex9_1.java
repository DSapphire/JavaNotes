//Ex9_1.java
import java.awt.Graphics;
import javax.swing.JApplet; 
public class Ex9_1 extends JApplet{ //һ��Applet������Ҫ�̳�Japplet��
   public void paint(Graphics g) //����JApplet���е�paint����
             //��������Ĳ�����Graphics��Ķ���������������ݹ�����
   {
      super.paint(g); //�����䳬��JApplet���paint����
      g.drawString("This is a Java Applet!",25,25); //�����ַ���
   }
}  
