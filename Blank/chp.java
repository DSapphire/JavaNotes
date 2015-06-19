class Student{
	private String studentID;
	private String name;
	public Student(String studentID,String name){
		this.studentID=studentID;
		this.name=name;
	}
	public String toString(){//println may use the string
		return "ID:"+studentID+"\nname:"+name;
	}
}
class Teacher{
	private String staffID;
	private String name;
	private double salary;
	public Teacher(String staffID,String name,double salary){
		this.staffID=staffID;
		this.name=name;
		this.salary=salary;
	}
	public String toString(){
		return "ID:"+staffID+"\t name:"+name+"\t salary:"+salary;
	}
}
class General<T>{
	//<T extends ClassA>
	private T var;
	public T getVar(){
		return var;
	}
	public void setVar(T var){
		this.var=var;
	}
	public void printInfo(){
		System.out.println(var);
	}
}

public class chp{
	public static void main(String[] args) {
		Student aStd=new Student("0001","AAAA");
		General<Student>std=new General<Student>();
		std.setVar(aStd);
		std.printInfo();
		printInfo(std);//??

		Teacher aTch=new Teacher("0012","BBBB",4500);
		General<Teacher>tch=new General<Teacher>();
		tch.setVar(aTch);
		tch.printInfo();

		General<Double>aDouble=new General<Double>();
		aDouble.setVar(100d);
		System.out.println("now calc:"+aDouble.getVar()*100);

	}
	public static void printInfo(General<?>temp){//???
		//<? super/extends String>
		System.out.println(temp.getVar());
	}
}