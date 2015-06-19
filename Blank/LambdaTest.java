import static java.lang.System.out;//

public class LambdaTest{
	public static void main(String[] args) {
		Hello1 h1=new Hello1();
		h1.r1.run();
		h1.r2.run();
		Hello2 h2=new Hello2();
		h2.r1.run();
		h2.r2.run();
	}
}
class Hello1{
	//inner class
	Runnable r1=new Runnable(){
		public void run(){
			out.println(this);
		}
	};
	Runnable r2=new Runnable(){
		public void run(){
			out.println(toString());
		}
	};
	public String toString(){
		return "1:Hello world.";
	}
}
class Hello2{
	Runnable r1=()->out.println(this);
	Runnable r2=()->out.println(toString());
	public String toString(){
		return "2:Hello world.";
	}
}