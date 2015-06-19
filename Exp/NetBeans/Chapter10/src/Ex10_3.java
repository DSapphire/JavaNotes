import java.sql.*;
public class Ex10_3{
    public static void main(String[] args) throws Exception {
        String DBDriver="sun.jdbc.odbc.JdbcOdbcDriver";
	String connectionStr="jdbc:odbc:PIMS";
	Class.forName(DBDriver);
	Connection con=DriverManager.getConnection(connectionStr,"Test","1234");
        String sq = " UPDATE person SET salary=? WHERE name=? ";//设置了2个参数
        PreparedStatement pstmt=con. prepareStatement(sq) ;//注意与Statement对象区别
        pstmt.setInt(1,5000);   //为第1个参数赋值，根据参数类型的不同调用不同方法
        pstmt.setString(2,"张三") ;  //为第2个参数赋值
        pstmt.executeUpdate() ;   //执行SQL语句
	pstmt.close();    //关闭语句
	con.close();   //关闭连接
    }
}
