import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Ex9_4 extends JApplet{
 public void init() //重写JApplet的init方法，浏览器加载此Applet程序时会自动执行
 {
   Container contentPane=getContentPane();//获得浏览器提供的顶层容器的内容面板
   contentPane.setLayout(new GridLayout(2,1));//设置内容面板的板式
   JButton button=new JButton("Click me");//创建一个按钮
   final JLabel label=new JLabel();//创建一个标签
   contentPane.add(button);//把按钮加到内容面板上
   contentPane.add(label);//把标签加到内容面板上
   button.addActionListener(//为按钮创建事件监听器，使其能够对click事件作出反应
      new ActionListener(){
        public void actionPerformed(ActionEvent event)
        {
          String information=JOptionPane.showInputDialog("请输入一串字符");
          label.setText(information);
         }
      }
    );//创建监听器语句结束
  }//init方法结束  
}
