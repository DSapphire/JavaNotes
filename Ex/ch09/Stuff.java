public class Stuff extends Employee{
	private String stuffId;
	public Stuff(String name){
		super(name);
	}
	public void setStuffId(String stuffId){
		this.stuffId=stuffId;
	}
	public String getStuffId(){
		return this.stuffId;
	}
	public String toString(){
		return "Stuff :\n  Name:"+this.getName();
	}
}