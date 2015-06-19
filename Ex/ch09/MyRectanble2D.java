
public class MyRectanble2D{
	private double x,y;
	private double width,height;
	public MyRectanble2D(){
		this.x=0;
		this.y=0;
		this.width=1.0;
		this.height=1.0;
	}
	public MyRectanble2D(double x,double y,double width,
			double height){
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
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
	public void setWidth(double width){
		this.width=width;
	}
	public double getWidth(){
		return this.width;
	}
	public void setHeight(double height){
		this.height=height;
	}
	public double getHeight(){
		return this.height;
	}
	public double getArea(){
		return this.height*this.width;
	}
	public double getPerimeter(){
		return 2*(this.height+this.width);
	}
	public boolean contains(double x,double y){
		if(x<this.x-this.width/2||x>this.x+this.width/2)
			return false;
		if(y<this.y-this.height/2||x>this.y+this.height/2)
			return false;
		return true;
	}
	public boolean contains(MyRectanble2D r){
		if(r.getHeight()>this.height||r.getWidth()>this.width)
			return false;
		if(r.getX()>this.x+this.width/2-r.getWidth()/2)
			return false;
		if(r.getY()>this.y+this.height/2-r.getHeight()/2)
			return false;
		if(r.getX()<this.x-this.width/2+r.getWidth()/2)
			return false;
		if(r.getY()<this.y-this.height/2+r.getHeight()/2)
			return false;
		return true;
	}
	public boolean overlaps(MyRectanble2D r){
		if(r.getX()>this.x+this.width/2+r.getWidth()/2)
			return false;
		if(r.getY()>this.y+this.height/2+r.getHeight()/2)
			return false;
		if(r.getX()<this.x-this.width/2-r.getWidth()/2)
			return false;
		if(r.getY()<this.y-this.height/2-r.getHeight()/2)
			return false;
		return true;
	}
	public static void main(String[] args) {
		MyRectanble2D r1=new MyRectanble2D(2,2,5.5,4.9);
		System.out.println("The area of r1 :"+String.format("%.4f.",r1.getArea()));
		System.out.println("The perimeter of r1 :"+String.format("%.4f.",r1.getPerimeter()));
		System.out.println("R1 contains(3,3) :"+r1.contains(3,3));
		System.out.println("R1 contains(MyRectanble2D(4,5,10.5,3.2)) :"+r1.contains(new MyRectanble2D(4,5,10.5,3.2)));
		System.out.println("R1 overlaps(MyRectanble2D(3,5,2.3,5.4)) :"+r1.overlaps(new MyRectanble2D(3,5,2.3,5.4)));
	}
}