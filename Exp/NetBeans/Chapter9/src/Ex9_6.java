import javax.swing.*;
import java.awt.*;
public class Ex9_6{
  public static void main(String[] args){
    JFrame.setDefaultLookAndFeelDecorated(true);//����JFrame����۷��
    JFrame frame=new JFrame("Swing Frame");//����һ��JFrame�ඥ������
    //��ö����������������contentPane��ֻ��ͨ�������ܼ������������
    //�������м�����JRootPane��һ���֡�
    Container contentPane=frame.getContentPane();
    JPanel panel=new JPanel();//����һ��JPanel����м�����panel
    panel.setBorder(BorderFactory.createLineBorder(Color.black,5));//���ñ߿�
    panel.setLayout(new GridLayout(2,1));//���ò���
    JLabel label=new JLabel("Label",SwingConstants.CENTER);//����ԭ�����Label
    JButton button=new JButton("Button");//����ԭ�����button
    //��ԭ�������ӵ��м�������
    panel.add(label); 
    panel.add(button);
    contentPane.add(panel);//���м�����ͨ�����������ӵ�����������
    frame.pack();//�������������
    frame.show();//��ʾ
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�رմ�GUI��رճ���
  }
}    
