import java.sql.*;
public class ex10_1
{
	public static void main(String[] args) throws Exception
	{
	  String DBDriver="sun.jdbc.odbc.JdbcOdbcDriver";
	  String connectionStr="jdbc:odbc:PIMS";
	  Connection con = null;
	  Statement stmt = null;
	  ResultSet rs = null;
	  Class.forName(DBDriver);	 //����������
	  con=DriverManager.getConnection(connectionStr,"Test","1234"); //�������ݿ�
	  stmt=con.createStatement();   //����Statement����
	  rs=stmt.executeQuery("Select * From Person");  //��ѯ��
	  while(rs.next())         //��ʾ���м�¼��ID������
	  {
              System.out.print(rs.getInt("ID")+"  ");
	      System.out.println(rs.getString("Name")+"  ");
	  };
	  stmt.executeUpdate("INSERT INTO Person VALUES(9,'��ʱ',3,'accountant',2000,4)");  //���һ����¼
	  System.out.println("������ݺ����ϢΪ");
	  rs=stmt.executeQuery("Select * From Person");  //��ѯ���
	  while(rs.next())    //��ʾ
          {
              System.out.print(rs.getInt("ID")+"  ");
	      System.out.println(rs.getString("Name")+"  ");
	   };
           stmt.executeUpdate("DELETE FROM Person WHERE Name='��ʱ'");
                                        //ɾ������Ϊ����ʱ���ļ�¼
	   System.out.println("ɾ�����ݺ����ϢΪ��");
	   rs=stmt.executeQuery("Select * From Person"); //��ѯ���
	   while(rs.next())           //��ʾ
	   {
               System.out.print(rs.getInt("ID")+"  ");
	       System.out.println(rs.getString("Name")+"  ");
	    };
	    stmt.close();    //�ر����
	    con.close();   //�ر�����
	}
}
