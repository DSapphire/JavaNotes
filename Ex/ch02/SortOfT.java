import java.util.Scanner;
public class SortOfT{
	public static void main(String[] args) {
		System.out.println("Please enter three integer numbers:");
		Scanner input=new Scanner(System.in);
		int num1=input.nextInt();
		int num2=input.nextInt();
		int num3=input.nextInt();
		int temp;
		if(num1>num2){
			temp=num1;
			num1=num2;
			num2=temp;
		}
		if(num1>num3){
			temp=num1;
			num1=num3;
			num3=temp;
		}
		if(num2>num3){
			temp=num2;
			num2=num3;
			num3=temp;
		}
		System.out.printf("\nAfter sort,the three numbers is %d\t%d\t%d",num1,num2,num3);
	}
}