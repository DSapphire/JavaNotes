import javax.swing.*;
import java.awt.*;
public class Ex9_6{
  public static void main(String[] args){
    JFrame.setDefaultLookAndFeelDecorated(true);//设置JFrame的外观风格
    JFrame frame=new JFrame("Swing Frame");//创建一个JFrame类顶级容器
    //获得顶级容器的内容面板contentPane，只有通过它才能加入其他组件。
    //它属于中间容器JRootPane的一部分。
    Container contentPane=frame.getContentPane();
    JPanel panel=new JPanel();//创建一个JPanel类的中间容器panel
    panel.setBorder(BorderFactory.createLineBorder(Color.black,5));//设置边框
    panel.setLayout(new GridLayout(2,1));//设置布局
    JLabel label=new JLabel("Label",SwingConstants.CENTER);//创建原子组件Label
    JButton button=new JButton("Button");//创建原子组件button
    //将原子组件添加到中间容器上
    panel.add(label); 
    panel.add(button);
    contentPane.add(panel);//将中间容器通过内容面板添加到顶层容器上
    frame.pack();//对组件进行排列
    frame.show();//显示
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭此GUI则关闭程序
  }
}    
