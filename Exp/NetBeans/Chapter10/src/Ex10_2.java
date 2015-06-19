import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

//ʵ��ActionListener�ӿڣ������������һ���¼�������
public class Ex10_2 implements ActionListener 
{
    JFrame f = null;                //������
    public Ex10_2()                  //���췽��
    {
        f = new JFrame("Ա����Ϣ");    //����һ����������
        Container contentPane = f.getContentPane();  //������������
        JPanel buttonPanel = new JPanel(); //����һ�м�����JPanel
        JButton b = new JButton("Ա���Ǽ�");//����һԭ�����������ť
        b.addActionListener(this);//Ϊ��ť����¼�����������
        buttonPanel.add(b);//���˰�ť��ӵ��м����� 
        b = new JButton("�˳�ϵͳ"); //�ٴ���һ��ť
        b.addActionListener(this); //Ϊ��ť�����¼�������
        buttonPanel.add(b); //����ť��ӵ��м�����
        
        buttonPanel.setBorder(BorderFactory.createTitledBorder( //�����м������߿�
            BorderFactory.createLineBorder(Color.blue,2),
            "Ա���Ǽ�ϵͳ",TitledBorder.CENTER,TitledBorder.TOP));
        contentPane.add(buttonPanel,BorderLayout.CENTER);//���м�������ӵ��������
        
        JMenuBar mBar=new JMenuBar();      //�����˵���  
        JMenu selection=new JMenu("ѡ��"); 
        JMenuItem regist=new JMenuItem("Ա���Ǽ�");
        JMenuItem sum=new JMenuItem("ͳ��");        
        selection.add(regist);
        selection.add(sum);
        JMenu sys=new JMenu("ϵͳ");
        JMenuItem exit=new JMenuItem("�˳�ϵͳ");
        sys.add(exit);
        mBar.add(selection);
        mBar.add(sys);
        f.setJMenuBar(mBar); //Ϊ�������Ӳ˵�
        regist.addActionListener(this); //Ϊ�˵�����¼�������
        sum.addActionListener(this);
        exit.addActionListener(this);
        
        f.pack(); 
        f.setVisible(true);
        
        f.addWindowListener(new WindowAdapter() { //Ϊ���ڲ�����Ӽ�����
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent e) { //ʵ��ActionListener�ӿ�Ψһ�ķ���
        String cmd = e.getActionCommand();   //���¼��������������
        if (cmd.equals("Ա���Ǽ�")) {  //��������ѡ����Ӧ�¼�
            new RegistSystem(f);      //��ʾԱ���ǼǶԻ���
        } else if (cmd.equals("�˳�ϵͳ")) {
            System.exit(0);         
        }  else if (cmd.equals("ͳ��")){
        try{
              Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  //����������
              Connection con=
              DriverManager.getConnection("jdbc:odbc:PIMS","Test","1234");
                                        //�����ݿ⽨������
              Statement stmt=con.createStatement();   //�������
              ResultSet rs=stmt.executeQuery("Select * From Person");
              int i=0;
              while(rs.next ()) i=i+1;
              JOptionPane.showMessageDialog(f,"����"+i+"��Ա��");//��ʾ��Ϣ�Ի���
              stmt.close ();
              con.close ();   //�رյ����ݿ������
            }
         catch(Exception ex){}
      }
   }
   public static void main(String[] args)  //�����������ڴ���Ex9_7���һ������
   {
        new Ex10_2();
   }
}

class RegistSystem implements ActionListener //���ڲ���JDialog��ʵ���¼��������ӿ�
{
    JDialog dialog;
    JTextField tF1=new JTextField();
    JTextField tF2=new JTextField();
    JTextField tF3=new JTextField();
    JTextField tF4=new JTextField();
    JTextField tF5=new JTextField();
    JTextField tF6=new JTextField();
    RegistSystem(JFrame f){ //���췽����������÷����л�öԻ���ĸ�����
        dialog = new JDialog(f,"Ա���Ǽ�",true); //����һmodal�Ի���
        Container dialogPane = dialog.getContentPane();//������ע����Ӹ������
        dialogPane.setLayout(new GridLayout(7,2));        

        dialogPane.add(new JLabel("Ա����� : ",SwingConstants.CENTER)); 
        dialogPane.add(tF1);
        dialogPane.add(new JLabel("Ա������ : ",SwingConstants.CENTER));
        dialogPane.add(tF2);
        dialogPane.add(new JLabel("���ű�� ",SwingConstants.CENTER));
        dialogPane.add(tF3);
        dialogPane.add(new JLabel("ְ    �� ",SwingConstants.CENTER));
        dialogPane.add(tF4);
        dialogPane.add(new JLabel("��    ��",SwingConstants.CENTER));
        dialogPane.add(tF5);
        dialogPane.add(new JLabel("ѧ�����",SwingConstants.CENTER));
        dialogPane.add(tF6);        
        JButton b1 = new JButton("ȷ��");
        dialogPane.add(b1);
        JButton b2 = new JButton("ȡ��");
        dialogPane.add(b2);              
        b1.addActionListener(this);   //Ϊ����ť�����¼�������
        b2.addActionListener(this);
        dialog.setBounds(200,150,400,130);
        dialog.show();
    }
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.equals("ȷ��")) {
            try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");	 //����������
            Connection con=
            DriverManager.getConnection("jdbc:odbc:PIMS","Test","1234");
            Statement stmt=con.createStatement();   //�������
            int ID=Integer.parseInt(tF1.getText());
            String name=tF2.getText ();
            int DepID=Integer.parseInt (tF3.getText ());
            String Occupation=tF4.getText ();
            int salary=Integer.parseInt (tF5.getText ());
            int EduID=Integer.parseInt (tF6.getText ()); 
            String SQLOrder="INSERT INTO Person VALUES("
              +ID+",'"+name+"',"+DepID+",'"+Occupation+"',"+salary+","+EduID+")";
                              //����SQL�����ַ���
            stmt.executeUpdate(SQLOrder);   //���һ����¼
            stmt.close ();
            con.close ();  //�ر�����            
          }
          catch(Exception ex){}
        }
        else if(cmd.equals("ȡ��")){
            dialog.dispose(); //ֱ�ӷ���������
        }
    }
}
