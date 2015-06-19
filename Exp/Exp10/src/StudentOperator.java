

import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Duan
 */
public class StudentOperator {
    public static ResultSet rs = null;
    
    // 添加一个学生，如果成功，则返回 0，否则返回-1
    public static int addStudent(Student s, Statement stmt) throws Exception{
        // 首先查找该学号的学生是否存在，如果存在，则不能添加
        int err=0;
        String sq="select number from Student where number="+s.number;
        rs=stmt.executeQuery(sq);
        if(rs.next()){
            if(rs.getString("number").equals(s.number))
                err=-1;
        }else{
            sq="insert into Student values(\'"+
                    s.number+"\',\'"+s.name+"\',\'"+s.sex+"\')";
            stmt.executeUpdate(sq);
            
            
        }
        return err;
    }
    // 添加一个学生及其成绩
    public static int addStudent(Student s, Score score, Statement stmt) throws Exception{
        int err=0;
        err=addStudent(s,stmt);
        if(err==0)
            err=ScoreOperator.addScore(score, stmt);
        return err;
    }
    //根据学号删除一个学生
    public static int removeStudent(String number, Statement stmt) throws Exception{
        // 首先删除学生
        int err=0;
        stmt.executeUpdate("delete from Student where number="+number);
        stmt.executeUpdate("delete from Score where number="+number);
        return err;
        // 其次在 Score 表中查找是否有该学生的成绩，如果有，也删除
    }
 // 根据 s 的学号，修改该学生的信息
    public static int updateStudent(Student s, Statement stmt) throws Exception{
        int err=0;
        String sq="update Student set sname="+s.name+" sex="+s.sex+ " where number="+s.number;
        stmt.executeUpdate(sq);
        return err;
    }
//显示 Student 表中所有记录
    public static void showStudents(Statement stmt) throws Exception{
        rs=stmt.executeQuery("Select * Student");  //查询表
        System.out.println("number\tname\tsex\n");
        while(rs.next()) {
            System.out.print(rs.getString("number")+"\t");
            System.out.print(rs.getString("name")+"\t");
            System.out.print(rs.getString("sex")+"\t");
            System.out.println();
        }
        rs=null;
    }
}
