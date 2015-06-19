import java.util.Scanner;

public class Fan{
	static final int SLOW=1;
	static final int MEDIUM=2;
	static final int FAST=3;

	private int speed=SLOW;
	private boolean on=false;
	private double radius=5.0;
	private String color="blue";

	public Fan(){

	}

	public void setSpeed(int speed){
		this.speed=speed;
	}
	public int getSpeed(){
		return this.speed;
	}
	public void setOn(boolean on){
		this.on=on;
	}
	public boolean getOn(){
		return this.on;
	}
	public void setRadius(double radius){
		this.radius=radius;
	}
	public double getRadius(){
		return this.radius;
	}
	public void setColor(String color){
		this.color=color;
	}
	public String getColor(){
		return this.color;
	}

	public String toString(){
		String s="The speed of the fan is "+this.speed+
				".\nThe color of the fan is "+this.color+
				" .\nThe radius of the fan is "+this.radius+".";
		if(!this.on){
			s="The fan is off. \n"+s;
		}
		return s;
	}

	public static void main(String[] args) {
		Fan fan1=new Fan();
		Fan fan2=new Fan();
		fan1.setSpeed(Fan.FAST);
		fan1.setRadius(10.0);
		fan1.setColor("yellow");
		fan1.setOn(true);
		fan2.setSpeed(Fan.MEDIUM);
		fan2.setRadius(5.0);
		fan2.setColor("blue");
		fan2.setOn(false);

		System.out.println("\nFan1:\n"+fan1);
		System.out.println("\n\nFan2:\n"+fan2);
	}
}