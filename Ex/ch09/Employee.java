public class Employee extends Person{
	private String office;
	private double salary;
	private MyDate employDate;
	public Employee(String name){
		super(name);
	}
	public void setOffice(String office){
		this.office=office;
	}
	public String getOffice(){
		return this.office;
	}
	public void setSalary(double salary){
		this.salary=salary;
	}
	public double getSalary(){
		return this.salary;
	}
	public void setEmployDate(MyDate employDate){
		this.employDate=employDate;
	}
	public MyDate getEmployDate(){
		return this.employDate;
	}
	public String toString(){
		return "Employee :\n  Name:"+this.getName();
	}
}