//SortTester.java
//�������򷽷�
import java.io.*;
public class SortTester{
	public static void main(String args[]){		
		Student students[]=new Student[5];		
		//���ļ�stu.ser�ж���ѧ����Ϣ��
		try
        {
           FileInputStream fi = new FileInputStream("./stu.ser");
           ObjectInputStream si = new ObjectInputStream(fi);
           for (int i=0; i<5; i++)             
             students[i] = (Student)si.readObject();             
           si.close();
        }
        catch(Exception e)
        {
           System.out.println(e);
        }		
	    StudentClass aClass = new StudentClass("���0201",5);				
		aClass.setStudents(students);		
		System.out.println(aClass);								
		// ѡ������		
		aClass.selectionSort();		
		System.out.println("ѡ�������Ľ��:\n");    	
    	System.out.println(aClass);    	    	
	}
}
