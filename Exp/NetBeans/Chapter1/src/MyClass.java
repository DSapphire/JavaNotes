// MyClass.java
public class MyClass {
  //�ùؼ���class������MyClass��public��ʾ�����ķ���Ȩ���ǹ����͡�
   private int val1,val2 ;
     //�ùؼ���int�����������ͱ�����private��ʾ������������ķ���Ȩ����˽���͡�
   public void myFun(int x,int y)
    //��������ΪmyFun�ķ�����x��yΪ������������������Ϊint��
    //myFun����Ȩ��Ϊpublic������ֵ����Ϊvoid����û�з���ֵ��
   {
            val1=x;  // x��ֵ����˽�б���val1
            val2=y;  // y��ֵ����˽�б���val2
            System.out.println("The sum is: "+(val1 + val2)); //������������
        }

   //ÿ��Application������һ��,����Ҳֻ����һ��main()��������Ϊ��������
        public static void main(String arg[])
    //String args[] �Ǵ��ݸ�main�����Ĳ���������Ϊ�ַ���
        {
            MyClass MyObj=new MyClass();  //����MyClass���һ��ʵ��MyObj
            MyObj.myFun(1,2);  //ͨ��MyObj���÷���MyFun
        }
}
