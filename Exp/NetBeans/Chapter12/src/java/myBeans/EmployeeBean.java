package myBeans;
public class EmployeeBean
{
	private int id=0,salary=0;
	private String name="none",occupation="none";
	private boolean male=true;
	public int getId()
	{
		   return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
        public boolean isMale()
	{
		return male;
	}
	public void setMale(boolean male)
	{
		this.male=male;
	}
	public int getSalary()
	{
		return salary;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public String getOccupation()
	{
		return occupation;
	}
	public void setOccupation(String occupation)
	{
		this.occupation=occupation;
	}
}
