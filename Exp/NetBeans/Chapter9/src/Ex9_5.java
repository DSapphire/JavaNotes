import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Ex9_5{
    public static void main(String[] args){
        JFrame f=new JFrame("Simple Swing Application");//����һ�����f��Ϊ��������
        Container contentPane=f.getContentPane();//���f���������
        contentPane.setLayout(new GridLayout(2,1));//���ò���
        JButton button=new JButton("Click me");//������ť
        final JLabel label=new JLabel();//������ǩ
        contentPane.add(button);//��Ӱ�ť
        contentPane.add(label);//��ӱ�ǩ
        button.addActionListener(//Ϊ��ť����¼�����������click������Ӧ
          new ActionListener(){
            public void actionPerformed(ActionEvent event)
            {                    
               String information=JOptionPane.showInputDialog("������һ���ַ�");
               label.setText(information);
            }
          }
        );
        f.setSize(200,100);//���ô�С
        f.show();//��ʾ
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���ùر�f���������
    }
}
