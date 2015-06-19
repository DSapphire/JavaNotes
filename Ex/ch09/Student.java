public class Student extends Person{
	private String grade;
	public Student(String name){
		super(name);
	}
	public void setGrade(String grade){
		this.grade=grade;
	}
	public String getGrade(){
		return this.grade;
	}
	public String toString(){
		return "Student :\n  Name:"+this.getName();
	}
}