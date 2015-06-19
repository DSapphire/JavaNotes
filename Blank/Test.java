import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
class A{
	A(){
		System.out.println("this is Class A.");
	}
}
class B extends A{
	// B(){
	// 	//super();
	// 	System.out.println("this is Class B.");
	// }
}
class C extends B{
	C(){
		//super();
		System.out.println("this is Class C.");
	}
}

interface iA{
	final int sum1=20;
	int getValue();
}
interface iB{
	final int sum1=30;
	void say();
}
class iTest implements iA,iB{
	public int getValue(){
		System.out.println("iA getValue()\t"+iA.sum1);
		return 2;
	}
	public void say(){
		System.out.println("iB say()\t"+iB.sum1);
	}
}
public class Test{
	public static String formatDate(){
		Date date=new Date();
		//Format formatter =new SimpleDateFormat("MMM-dd-yy");
		SimpleDateFormat formatter =new SimpleDateFormat("MMM-dd-yy");
		return formatter.format(date);
	}
	public static void main(String[] args){
		//C c=new C();
		iTest obj=new iTest();
		//System.out.println(obj.getValue());
		obj.getValue();
		obj.say();

		System.out.println(Test.formatDate());
	}
}