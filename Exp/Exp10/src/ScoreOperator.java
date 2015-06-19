
import java.sql.Statement;
import java.sql.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Duan
 */
public class ScoreOperator {
    public static ResultSet rs = null;
    //添加一个成绩
    public static int addScore(Score s, Statement stmt) throws Exception{
    //首先查找 s 对应学号的学生是否存在，如果不存在则返回-1
    //如果学生存在，再查找该学号是否已经录入成绩
    //如果已经录入成绩，则返回失败，否则在 Score 表中添加成绩
        int err=-1;
        rs=stmt.executeQuery("select number from Student where number="+s.number);
        if(rs.next()){
            if(rs.getString("number").equals(s.number)){
                rs=stmt.executeQuery("select number from Score where number="+s.number);
                if(rs.next()){
                    if(rs.getString("number").equals(s.number)){
                        err=-1;
                    }
                }else{
                    String sq="insert into Score values("+
                            s.number+" ,"+s.chinese+","+s.math+","+s.english+
                            ","+s.computer+","+s.politics+")";
                    stmt.executeUpdate(sq);
                    err=0;
                }
            }
        }
        return err;
    }
    //删除某学号对应的学生成绩
    public static int deleteScore(String number, Statement stmt) throws Exception{
        int err=0;
        err=stmt.executeUpdate("delete from Score where number="+number);
        err--;
        return err;
    }
    public static int updateScore(Score s, Statement stmt) throws Exception {
        int err=0;
        String sq="update Score set "+
                            s.number+" ,"+s.chinese+","+s.math+","+s.english+
                            ","+s.computer+","+s.politics+")";
        err=stmt.executeUpdate(sq);
        err--;
        return err;
    }
    //显示 Score 表中所有记录
    public static void showScores(Statement stmt) throws Exception{
        rs=stmt.executeQuery("Select * Score");  //查询表
        System.out.println("number\tchinese\tmath\tenglish\tcomputer\tpolitics\n");
        while(rs.next()) {
            System.out.print(rs.getString("number")+"\t");
            System.out.print(rs.getInt("chinese")+"\t");
            System.out.print(rs.getInt("math")+"\t");
            System.out.print(rs.getInt("english")+"\t");
            System.out.print(rs.getInt("computer")+"\t");
            System.out.print(rs.getInt("politics")+"\t");
            System.out.println();
        }
        rs=null;
    }
    
}
