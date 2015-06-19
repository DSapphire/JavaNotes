//Ex9_8_2.java
import java.awt.event.*; //载入MouseAdapter所在的包
import javax.swing.*;   

public class Ex9_8_2 extends MouseAdapter{ //Ex9_6_2类继承MouseAdapter适配器类
    JFrame f;
    public Ex9_8_2(){    
        f=new JFrame();
        f.setSize(300,150);
        f.show();       
        f.addMouseListener(this);
        f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
     public void mouseClicked(MouseEvent e){ //可见只要重写mouseClicked方法
         f.setTitle("点击坐标为 ("+e.getX()+", "+e.getY()+")");
     }
    public static void main(String[] args){
        new Ex9_8_2();
    }
}
