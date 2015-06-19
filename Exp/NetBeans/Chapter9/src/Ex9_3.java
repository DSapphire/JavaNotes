import java.awt.*;
import javax.swing.*;
public class Ex9_3 extends JApplet{ //一个Applet程序需要继承Japplet类
   public void paint(Graphics g) //重载JApplet类中的paint方法
   {
      super.paint(g); 
      Graphics2D g2d=(Graphics2D)g; //将图形对象强制转换为Graphics2D类型
g2d.setPaint(new GradientPaint(0,0,Color.red,180,45,Color.yellow));
                                    //Graphics2D类的方法：设置渐变色
      g2d.drawString("This is a Java Applet!",25,25); //绘制字符串 
   }
}   
