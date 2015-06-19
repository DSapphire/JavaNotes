//Ex9_1.java
import java.awt.Graphics;
import javax.swing.JApplet; 
public class Ex9_1 extends JApplet{ //一个Applet程序需要继承Japplet类
   public void paint(Graphics g) //重载JApplet类中的paint方法
             //这个方法的参数是Graphics类的对象，是由浏览器传递过来的
   {
      super.paint(g); //调用其超类JApplet类的paint方法
      g.drawString("This is a Java Applet!",25,25); //绘制字符串
   }
}  
