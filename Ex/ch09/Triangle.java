public class Triangle extends GeometricObject{
	private double side1,side2,side3;

	public Triangle(){
		super();
		side3=1.0;
		side2=1.0;
		side1=1.0;
	}
	public Triangle(double side1,double side2,double side3){
		this();
		if(Triangle.isValid(side1,side2,side3)){
			this.side3=side3;
			this.side2=side2;
			this.side1=side1;
		}else{
			System.out.println("The three sides is not Validated.");
		}
			
	}
	public void setSide1(double side1){
		this.side1=side1;
	}
	public double getSide1(){
		return this.side1;
	}
	public void setSide2(double side2){
		this.side2=side2;
	}
	public double getSide2(){
		return this.side2;
	}
	public void setSide3(double side3){
		this.side3=side3;
	}
	public double getSide3(){
		return this.side3;
	}
	public double getArea(){
		double myArea=0;
		double p=(side1+side2+side3)/2;
		myArea=Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
		return myArea;
	}
	public double getPerimeter(){
		return side3+side1+side2;
	}
	public static boolean isValid(double side1, double side2, double side3){
		if(side1+side2<=side3){
			return false;
		}
		if(side3+side2<=side1){
			return false;
		}
		if(side1+side3<=side2){
			return false;
		}
		return true;
	}
	public String toString(){
		return "Triangle: side1= "+side1+ " side2= "+side2+ "side3= "+side3;
	}
	public static void main(String[] args) {
		Triangle tr=new Triangle(1,1.5,1);
		tr.setColor("yellow");
		tr.setFilled(true);
		System.out.println("The area of the triangle:"+String.format("%.4f.",tr.getArea()));
		System.out.println("The perimeter of the triangle:"+String.format("%.4f.",tr.getPerimeter()));
		System.out.println("The color of the triangle:"+tr.getColor());
		System.out.println("triangle ifFilled:"+tr.ifFilled());
		System.out.println(tr);
	}
}