public class MyArray2 {
    public static void main(String[] args){
        int myArray[][];                  //��������
        myArray=new int[5][10];            //��������
        int total=0;
        for(int i=0; i<myArray.length;i++)
            for(int j=0;j<myArray[i].length;j++)
                myArray[i][j]=i*10+j;
        //Ϊÿ������Ԫ�ظ�ֵ
        for(int i=0; i<myArray.length;i++)
            for(int j=0;j<myArray[i].length;j++)
                total+=myArray[i][j];
            System.out.println("The sum is : "+total);
    }
}
