import java.io.*;
class Employee {
   char name[]={'\u0000','\u0000','\u0000','\u0000',
                       '\u0000','\u0000','\u0000','\u0000'};
   int age; 
   public Employee(String name,int age) throws Exception {
      if(name.toCharArray ().length>8) 	     
        System.arraycopy(name.toCharArray(),0,this.name,0,8);
      else     
        System.arraycopy(name.toCharArray(),0,this.name, 0,name.toCharArray().length);
	   this.age=age;
   }
}
public class Ex6_18 {
	String Filename;
	public Ex6_18(String Filename) 	{
	    this.Filename=Filename;
	}	
	public void writeEmployee(Employee e,int n) throws Exception {
	  RandomAccessFile ra=new RandomAccessFile(Filename,"rw");
	  ra.seek(n*20); //将位置指示器移到指定位置上
	  for(int I=0;I<8;I++)  ra.writeChar (e.name[I]);
	  ra.writeInt(e.age);
	  ra.close();
	}
       public void readEmployee(int n) throws Exception {
	  char buf[]=new char[8];
	  RandomAccessFile ra=new RandomAccessFile(Filename,"r");
	  ra.seek(n*20);
	  for(int I=0;I<8;I++) buf[I]=ra.readChar();
	  System.out.print("name:");
	  System.out.println(buf);
          System.out.println("age:"+ra.readInt());
	   ra.close();
	}
      public static void main(String[] args) throws Exception {
    	    Ex6_18  t=new Ex6_18("d:/1.txt");	
            Employee e1=new Employee("ZhangSantt",23); 
	    Employee e2=new Employee("小不点",33); 	
            Employee e3=new Employee("王华",19);      
            t.writeEmployee(e1,0); 
	    t.writeEmployee(e3,2); 	
            System.out.println("第一个雇员信息");
	     t.readEmployee(0); 
	    System.out.println("第三个雇员信息");
	    t.readEmployee(2);   
	    t.writeEmployee (e2,1);
	    System.out.println("第二个雇员信息");
	    t.readEmployee (1); 	    
	}	
}

