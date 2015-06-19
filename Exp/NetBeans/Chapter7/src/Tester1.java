//Tester1.java
import java.io.*;
public class Tester1{		
	public static void main(String args[]){
            Student students[];		
            StudentClass aClass = new StudentClass("软件0201",5);		
            students=new Student[5];		
            for (int i=0; i<5; i++)
                students[i] = new Student(getAStudent(i+1));		  
            aClass.setStudents(students);		
            System.out.println(aClass);		
            //将学生信息保存到文件stu.ser中。		
            try {			
                FileOutputStream fo = new FileOutputStream("stu.ser");
                ObjectOutputStream so = new ObjectOutputStream(fo);
                for (int i=0; i<5; i++)
                    so.writeObject(students[i]);
                so.close();
            }
            catch(Exception e)
            {
                System.out.println(e) ;
            }
	}
	public static Student getAStudent(int i){		
            Student studenti;			    		
            System.out.println("输入第" + i + "个学生的信息:"); 		
            System.out.println("学号:"); 
            String id = Keyboard.getString(); 
            System.out.println("姓名:"); 
            String name = Keyboard.getString();         
            System.out.println("英语成绩:"); 
            int eng = Keyboard.getInteger();         
            System.out.println("数学成绩:"); 
            int math = Keyboard.getInteger();         
            System.out.println("计算机成绩:"); 
            int comp = Keyboard.getInteger();         
            studenti = new Student(id,name,eng,math,comp);
            return studenti;
        }
}
