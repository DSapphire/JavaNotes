public class Test{
	public static void main(String[] args) {
		GeometricObject[] go;
		go=new GeometricObject[5];
		go[0]=new Circle();
		go[1]=new Rectangle();
		go[2]=new Square();
		go[3]=new Square(7);
		go[4]=new Circle();
		for(int i=0;i<go.length;i++){
			if(go[i] instanceof Colorable){
				Colorable c=(Colorable)go[i];
				System.out.print("GeometricObject "+(i+1)+" :");
				c.howToColor();
			}
		}
	}
}