//Ex9_8_1.java
import java.awt.event.*; //����MouseListener�����ڵİ�
import javax.swing.*;   //����JFrame���ڵİ�

public class Ex9_8_1 implements MouseListener{ //Ex9_6_1Ҫʵ��MouseListener�ӿ�
     JFrame f;  //�ڹ��췽���ͱ�ķ����ж�Ҫʹ�ã���������Ϊ������
     public Ex9_8_1() //���췽��
     {
        f=new JFrame(); //�½�һ����
        f.setSize(300,150);
        f.show();
	    f.addMouseListener(this); //Ϊ������������¼�������
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //���ùرմ������˳�����         
    }
     public void mousePressed(MouseEvent e){} //ʵ�ֽӿڵ�mousePressed����
     public void mouseReleased(MouseEvent e){}//ʵ�ֽӿڵ�mouseReleased����
     public void mouseEntered(MouseEvent e){} //ʵ�ֽӿڵ�mouseEnterd����
     public void mouseExited(MouseEvent e){}  //ʵ�ֽӿڵ�mouseExited����
     public void mouseClicked(MouseEvent e){  //ʵ�ֽӿڵ�mouseClicked����
         f.setTitle("�������Ϊ ("+e.getX()+", "+e.getY()+")");//���ô��ڱ���
     }
    public static void main(String[] args){ //������������Ex9_6_1���һ������
        new Ex9_8_1();
    }
}
