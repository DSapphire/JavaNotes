// MyClass.java
public class MyClass {
  //用关键词class声明类MyClass，public表示这个类的访问权限是公有型。
   private int val1,val2 ;
     //用关键字int声明两个整型变量，private表示这个两个变量的访问权限是私有型。
   public void myFun(int x,int y)
    //定义了名为myFun的方法。x、y为参数名，参数的类型为int。
    //myFun访问权限为public，返回值类型为void，即没有返回值。
   {
            val1=x;  // x的值赋给私有变量val1
            val2=y;  // y的值赋给私有变量val2
            System.out.println("The sum is: "+(val1 + val2)); //输出求和运算结果
        }

   //每个Application必须有一个,而且也只能有一个main()方法，作为程序的入口
        public static void main(String arg[])
    //String args[] 是传递给main方法的参数，类型为字符串
        {
            MyClass MyObj=new MyClass();  //创建MyClass类的一个实例MyObj
            MyObj.myFun(1,2);  //通过MyObj调用方法MyFun
        }
}
