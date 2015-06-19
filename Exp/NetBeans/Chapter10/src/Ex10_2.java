import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

//实现ActionListener接口，因此其对象就是一个事件监听器
public class Ex10_2 implements ActionListener 
{
    JFrame f = null;                //类属性
    public Ex10_2()                  //构造方法
    {
        f = new JFrame("员工信息");    //创建一个顶层容器
        Container contentPane = f.getContentPane();  //获得其内容面板
        JPanel buttonPanel = new JPanel(); //创建一中间容器JPanel
        JButton b = new JButton("员工登记");//创建一原子组件——按钮
        b.addActionListener(this);//为按钮添加事件监听器对象
        buttonPanel.add(b);//将此按钮添加到中间容器 
        b = new JButton("退出系统"); //再创建一按钮
        b.addActionListener(this); //为按钮增加事件监听器
        buttonPanel.add(b); //将按钮添加到中间容器
        
        buttonPanel.setBorder(BorderFactory.createTitledBorder( //设置中间容器边框
            BorderFactory.createLineBorder(Color.blue,2),
            "员工登记系统",TitledBorder.CENTER,TitledBorder.TOP));
        contentPane.add(buttonPanel,BorderLayout.CENTER);//将中间容器添加到内容面板
        
        JMenuBar mBar=new JMenuBar();      //创建菜单条  
        JMenu selection=new JMenu("选项"); 
        JMenuItem regist=new JMenuItem("员工登记");
        JMenuItem sum=new JMenuItem("统计");        
        selection.add(regist);
        selection.add(sum);
        JMenu sys=new JMenu("系统");
        JMenuItem exit=new JMenuItem("退出系统");
        sys.add(exit);
        mBar.add(selection);
        mBar.add(sys);
        f.setJMenuBar(mBar); //为窗体增加菜单
        regist.addActionListener(this); //为菜单添加事件监听器
        sum.addActionListener(this);
        exit.addActionListener(this);
        
        f.pack(); 
        f.setVisible(true);
        
        f.addWindowListener(new WindowAdapter() { //为窗口操作添加监听器
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent e) { //实现ActionListener接口唯一的方法
        String cmd = e.getActionCommand();   //从事件对象获得相关名称
        if (cmd.equals("员工登记")) {  //根据名称选择相应事件
            new RegistSystem(f);      //显示员工登记对话框
        } else if (cmd.equals("退出系统")) {
            System.exit(0);         
        }  else if (cmd.equals("统计")){
        try{
              Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  //加载驱动器
              Connection con=
              DriverManager.getConnection("jdbc:odbc:PIMS","Test","1234");
                                        //和数据库建立连接
              Statement stmt=con.createStatement();   //创建语句
              ResultSet rs=stmt.executeQuery("Select * From Person");
              int i=0;
              while(rs.next ()) i=i+1;
              JOptionPane.showMessageDialog(f,"共有"+i+"名员工");//显示信息对话框
              stmt.close ();
              con.close ();   //关闭到数据库的连接
            }
         catch(Exception ex){}
      }
   }
   public static void main(String[] args)  //主方法，用于创建Ex9_7类的一个对象
   {
        new Ex10_2();
   }
}

class RegistSystem implements ActionListener //用于产生JDialog，实现事件监听器接口
{
    JDialog dialog;
    JTextField tF1=new JTextField();
    JTextField tF2=new JTextField();
    JTextField tF3=new JTextField();
    JTextField tF4=new JTextField();
    JTextField tF5=new JTextField();
    JTextField tF6=new JTextField();
    RegistSystem(JFrame f){ //构造方法，从其调用方法中获得对话框的父窗口
        dialog = new JDialog(f,"员工登记",true); //产生一modal对话框
        Container dialogPane = dialog.getContentPane();//接下来注意添加各个组件
        dialogPane.setLayout(new GridLayout(7,2));        

        dialogPane.add(new JLabel("员工编号 : ",SwingConstants.CENTER)); 
        dialogPane.add(tF1);
        dialogPane.add(new JLabel("员工姓名 : ",SwingConstants.CENTER));
        dialogPane.add(tF2);
        dialogPane.add(new JLabel("部门编号 ",SwingConstants.CENTER));
        dialogPane.add(tF3);
        dialogPane.add(new JLabel("职    务 ",SwingConstants.CENTER));
        dialogPane.add(tF4);
        dialogPane.add(new JLabel("工    资",SwingConstants.CENTER));
        dialogPane.add(tF5);
        dialogPane.add(new JLabel("学历编号",SwingConstants.CENTER));
        dialogPane.add(tF6);        
        JButton b1 = new JButton("确定");
        dialogPane.add(b1);
        JButton b2 = new JButton("取消");
        dialogPane.add(b2);              
        b1.addActionListener(this);   //为两按钮增加事件监听器
        b2.addActionListener(this);
        dialog.setBounds(200,150,400,130);
        dialog.show();
    }
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.equals("确定")) {
            try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");	 //加载驱动器
            Connection con=
            DriverManager.getConnection("jdbc:odbc:PIMS","Test","1234");
            Statement stmt=con.createStatement();   //创建语句
            int ID=Integer.parseInt(tF1.getText());
            String name=tF2.getText ();
            int DepID=Integer.parseInt (tF3.getText ());
            String Occupation=tF4.getText ();
            int salary=Integer.parseInt (tF5.getText ());
            int EduID=Integer.parseInt (tF6.getText ()); 
            String SQLOrder="INSERT INTO Person VALUES("
              +ID+",'"+name+"',"+DepID+",'"+Occupation+"',"+salary+","+EduID+")";
                              //创建SQL命令字符串
            stmt.executeUpdate(SQLOrder);   //添加一条记录
            stmt.close ();
            con.close ();  //关闭连接            
          }
          catch(Exception ex){}
        }
        else if(cmd.equals("取消")){
            dialog.dispose(); //直接返回主窗口
        }
    }
}
