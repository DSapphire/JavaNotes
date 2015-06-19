public class Triangle extends GeometricObject{
	private double side1 = 1.0, side2 = 1.0, side3 = 1.0;
	public Triangle(){
	}
	public Triangle(double side1, double side2, double side3) throws IllegalTriangleException{
		if(!isValid(side1,side2,side3))
			throw new IllegalTriangleException();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double getArea(){
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
	public double getPerimeter(){
		return side1 + side2 + side3;
	}
	public String toString(){
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
	public static boolean isValid(double side1, double side2, double side3){
		if(side3+side2<=side1)
			return false;
		if(side1+side3<=side2)
			return false;
		if(side2+side1<=side3)
			return false;
		return true;
	}
	public static void main(String[] args) {
		try{
			Triangle t=new Triangle(1,3,1);
		}catch(IllegalTriangleException e){
			e.printStackTrace();
		}
		
	}
}
class IllegalTriangleException extends Exception{
	public IllegalTriangleException(){
		super("IllegalTriangleException!");
	}
}