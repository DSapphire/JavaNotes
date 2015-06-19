public class MyArray2 {
    public static void main(String[] args){
        int myArray[][];                  //声明数组
        myArray=new int[5][10];            //创建数组
        int total=0;
        for(int i=0; i<myArray.length;i++)
            for(int j=0;j<myArray[i].length;j++)
                myArray[i][j]=i*10+j;
        //为每个数组元素赋值
        for(int i=0; i<myArray.length;i++)
            for(int j=0;j<myArray[i].length;j++)
                total+=myArray[i][j];
            System.out.println("The sum is : "+total);
    }
}
