import java.math.*;
public class RegularPolygon{
	public static final double PI=3.1415926;
	private int n;
	private double side;
	private double x;
	private double y;
	public RegularPolygon(){
		this.n=3;
		this.side=1.0;
		this.x=0.0;
		this.y=0.0;
	}
	public RegularPolygon(int n,double side){
		this.n=n;
		this.side=side;
		this.x=0.0;
		this.y=0.0;
	}
	public RegularPolygon(int n,double side,double x,double y){
		this.n=n;
		this.side=side;
		this.x=x;
		this.y=y;
	}

	public void setN(int n){
		this.n=n;
	}
	public int getN(){
		return this.n;
	}
	public void setSide(double side){
		this.side=side;
	}
	public double getSide(){
		return this.side;
	}
	public void setX(double x){
		this.x=x;
	}
	public double getX(){
		return this.x;
	}
	public void setY(double y){
		this.y=y;
	}
	public double getY(){
		return this.y;
	}

	public double getPerimeter(){
		return this.n*this.side;
	}
	public double getArea(){
		return (this.n*this.side*this.side)/(4*Math.tan(PI/this.n));
	}
	public String toString(){

		return String.format("%s %.2f %s %.2f ."
			,"\nThe Perimeter of the RegularPolygonis",getPerimeter(),
			".\nThe Area of the RegularPolygon is ",getArea());

	}
	public static void main(String[] args) {
		RegularPolygon r1=new RegularPolygon();
		RegularPolygon r2=new RegularPolygon(6,4.0);
		RegularPolygon r3=new RegularPolygon(10,4.0,5.6,7.8);
		System.out.println("\nr1:"+r1);
		System.out.println("\nr2:"+r2);
		System.out.println("\nr3:"+r3);
	}
}