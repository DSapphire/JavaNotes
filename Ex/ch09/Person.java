public class Person{
	private String name;
	private String address;
	private String phoneNumber;
	private String email;
	public Person(){

	}
	public Person(String name){
		this.name=name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public String getPhoneNumber(){
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber=phoneNumber;
	}
	public String getAddress(){
		return this.address;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public String getEmail(){
		return this.email;
	}
	public String toString(){
		return "Person :\n  Name:"+this.name;
	}
}
