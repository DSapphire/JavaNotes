public class MyArray {
    public static void main(String[] args){
        int myArray[];                  //��������
        myArray=new int[10];            //��������
        System.out.println("Index\t\tValue");
        for(int i=0; i<myArray.length;i++)
            System.out.println(i+"\t\t"+myArray[i]);
        //֤������Ԫ��Ĭ�ϳ�ʼ��Ϊ0
        //myArray[10]=100;              //����������Խ���쳣
    }
}
