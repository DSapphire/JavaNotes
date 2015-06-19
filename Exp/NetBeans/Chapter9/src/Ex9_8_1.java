//Ex9_8_1.java
import java.awt.event.*; //载入MouseListener类所在的包
import javax.swing.*;   //载入JFrame所在的包

public class Ex9_8_1 implements MouseListener{ //Ex9_6_1要实现MouseListener接口
     JFrame f;  //在构造方法和别的方法中都要使用，所以声明为类属性
     public Ex9_8_1() //构造方法
     {
        f=new JFrame(); //新建一窗口
        f.setSize(300,150);
        f.show();
	    f.addMouseListener(this); //为窗口增加鼠标事件监听器
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //设置关闭窗口则退出程序         
    }
     public void mousePressed(MouseEvent e){} //实现接口的mousePressed方法
     public void mouseReleased(MouseEvent e){}//实现接口的mouseReleased方法
     public void mouseEntered(MouseEvent e){} //实现接口的mouseEnterd方法
     public void mouseExited(MouseEvent e){}  //实现接口的mouseExited方法
     public void mouseClicked(MouseEvent e){  //实现接口的mouseClicked方法
         f.setTitle("点击坐标为 ("+e.getX()+", "+e.getY()+")");//设置窗口标题
     }
    public static void main(String[] args){ //主方法，创建Ex9_6_1类的一个对象
        new Ex9_8_1();
    }
}
