public class Faculty extends Employee{
	private String officeTime;
	private String rank;
	public Faculty(String name){
		super(name);
	}
	public void setOfficeTime(String officeTime){
		this.officeTime=officeTime;
	}
	public String getOfficeTime(){
		return this.officeTime;
	}
	public void setRank(String rank){
		this.rank=rank;
	}
	public String getRank(){
		return this.rank;
	}
	public String toString(){
		return "Faculty :\n  Name:"+this.getName();
	}
}