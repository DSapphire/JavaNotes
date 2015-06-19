public class Demo{
	public static void main(String[] args) {
		Phone tel=new Tel();
		A.call(tel);
	}
}
interface Call{
	public final int a=6;
	public void call();
}
class Phone implements Call{
	public final int a=5;
	public void call(){
		System.out.println("Phone call");
	}
}
class Tel extends Phone{
	public void call(){
		System.out.println("Tel call");
	}
}
class A{
	public static void call(Phone call){
		call.call();
	}
}