public class MyArray {
    public static void main(String[] args){
        int myArray[];                  //声明数组
        myArray=new int[10];            //创建数组
        System.out.println("Index\t\tValue");
        for(int i=0; i<myArray.length;i++)
            System.out.println(i+"\t\t"+myArray[i]);
        //证明数组元素默认初始化为0
        //myArray[10]=100;              //将产生数组越界异常
    }
}
