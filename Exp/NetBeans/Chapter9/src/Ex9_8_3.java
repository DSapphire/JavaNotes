//Ex9_8_3.java
import java.awt.event.*; //����MouseAdapter��WindowAdapter�����ڵİ�
import javax.swing.*;

public class Ex9_8_3{
    JFrame f;
    public Ex9_8_3()
    {
        f=new JFrame();
        f.setSize(300,150);
        f.show();       
        f.addMouseListener(new MouseAdapter(){ //ʹ��MouseAdapter��������ڲ���                                             
             public void mouseClicked(MouseEvent e){
                 f.setTitle("�������Ϊ ("+e.getX()+", "+e.getY()+")");
             }
        });//Ϊ�����������¼�������������
        f.addWindowListener(new WindowAdapter(){//ʹ��WindowAdapter��������ڲ���
                                               //ʵ�ֹرմ������˳�����
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });//Ϊ������Ӵ����¼�������������
    }
    
    public static void main(String[] args){
        new Ex9_8_3();
    }
}
