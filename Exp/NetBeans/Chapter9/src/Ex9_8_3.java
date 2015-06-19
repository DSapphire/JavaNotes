//Ex9_8_3.java
import java.awt.event.*; //载入MouseAdapter、WindowAdapter类所在的包
import javax.swing.*;

public class Ex9_8_3{
    JFrame f;
    public Ex9_8_3()
    {
        f=new JFrame();
        f.setSize(300,150);
        f.show();       
        f.addMouseListener(new MouseAdapter(){ //使用MouseAdapter类的匿名内部类                                             
             public void mouseClicked(MouseEvent e){
                 f.setTitle("点击坐标为 ("+e.getX()+", "+e.getY()+")");
             }
        });//为窗口添加鼠标事件监听器语句结束
        f.addWindowListener(new WindowAdapter(){//使用WindowAdapter类的匿名内部类
                                               //实现关闭窗口则退出程序
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });//为窗口添加窗口事件监听器语句结束
    }
    
    public static void main(String[] args){
        new Ex9_8_3();
    }
}
