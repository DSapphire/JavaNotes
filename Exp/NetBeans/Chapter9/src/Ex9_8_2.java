//Ex9_8_2.java
import java.awt.event.*; //����MouseAdapter���ڵİ�
import javax.swing.*;   

public class Ex9_8_2 extends MouseAdapter{ //Ex9_6_2��̳�MouseAdapter��������
    JFrame f;
    public Ex9_8_2(){    
        f=new JFrame();
        f.setSize(300,150);
        f.show();       
        f.addMouseListener(this);
        f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
     public void mouseClicked(MouseEvent e){ //�ɼ�ֻҪ��дmouseClicked����
         f.setTitle("�������Ϊ ("+e.getX()+", "+e.getY()+")");
     }
    public static void main(String[] args){
        new Ex9_8_2();
    }
}
