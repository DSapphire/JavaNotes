import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Ex9_4 extends JApplet{
 public void init() //��дJApplet��init��������������ش�Applet����ʱ���Զ�ִ��
 {
   Container contentPane=getContentPane();//���������ṩ�Ķ����������������
   contentPane.setLayout(new GridLayout(2,1));//�����������İ�ʽ
   JButton button=new JButton("Click me");//����һ����ť
   final JLabel label=new JLabel();//����һ����ǩ
   contentPane.add(button);//�Ѱ�ť�ӵ����������
   contentPane.add(label);//�ѱ�ǩ�ӵ����������
   button.addActionListener(//Ϊ��ť�����¼���������ʹ���ܹ���click�¼�������Ӧ
      new ActionListener(){
        public void actionPerformed(ActionEvent event)
        {
          String information=JOptionPane.showInputDialog("������һ���ַ�");
          label.setText(information);
         }
      }
    );//����������������
  }//init��������  
}
