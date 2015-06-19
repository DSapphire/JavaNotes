import java.sql.*;
public class Ex10_3{
    public static void main(String[] args) throws Exception {
        String DBDriver="sun.jdbc.odbc.JdbcOdbcDriver";
	String connectionStr="jdbc:odbc:PIMS";
	Class.forName(DBDriver);
	Connection con=DriverManager.getConnection(connectionStr,"Test","1234");
        String sq = " UPDATE person SET salary=? WHERE name=? ";//������2������
        PreparedStatement pstmt=con. prepareStatement(sq) ;//ע����Statement��������
        pstmt.setInt(1,5000);   //Ϊ��1��������ֵ�����ݲ������͵Ĳ�ͬ���ò�ͬ����
        pstmt.setString(2,"����") ;  //Ϊ��2��������ֵ
        pstmt.executeUpdate() ;   //ִ��SQL���
	pstmt.close();    //�ر����
	con.close();   //�ر�����
    }
}
