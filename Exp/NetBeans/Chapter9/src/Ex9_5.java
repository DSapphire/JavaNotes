import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Ex9_5{
    public static void main(String[] args){
        JFrame f=new JFrame("Simple Swing Application");//创建一个框架f作为顶层容器
        Container contentPane=f.getContentPane();//获得f的内容面板
        contentPane.setLayout(new GridLayout(2,1));//设置布局
        JButton button=new JButton("Click me");//创建按钮
        final JLabel label=new JLabel();//创建标签
        contentPane.add(button);//添加按钮
        contentPane.add(label);//添加标签
        button.addActionListener(//为按钮添加事件监听器，对click作出反应
          new ActionListener(){
            public void actionPerformed(ActionEvent event)
            {                    
               String information=JOptionPane.showInputDialog("请输入一串字符");
               label.setText(information);
            }
          }
        );
        f.setSize(200,100);//设置大小
        f.show();//显示
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置关闭f则结束程序
    }
}
