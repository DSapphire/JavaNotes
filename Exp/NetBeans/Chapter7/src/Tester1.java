//Tester1.java
import java.io.*;
public class Tester1{		
	public static void main(String args[]){
            Student students[];		
            StudentClass aClass = new StudentClass("���0201",5);		
            students=new Student[5];		
            for (int i=0; i<5; i++)
                students[i] = new Student(getAStudent(i+1));		  
            aClass.setStudents(students);		
            System.out.println(aClass);		
            //��ѧ����Ϣ���浽�ļ�stu.ser�С�		
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
            System.out.println("�����" + i + "��ѧ������Ϣ:"); 		
            System.out.println("ѧ��:"); 
            String id = Keyboard.getString(); 
            System.out.println("����:"); 
            String name = Keyboard.getString();         
            System.out.println("Ӣ��ɼ�:"); 
            int eng = Keyboard.getInteger();         
            System.out.println("��ѧ�ɼ�:"); 
            int math = Keyboard.getInteger();         
            System.out.println("������ɼ�:"); 
            int comp = Keyboard.getInteger();         
            studenti = new Student(id,name,eng,math,comp);
            return studenti;
        }
}
