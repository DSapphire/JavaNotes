import java.util.Scanner;
public class Demo3{
	public static void bubleSort(double[] array1){
		double temp;
		boolean change=false;
		for(int i=0;i<array1.length;i++){
			for(int j=0;j<array1.length-i-1;j++){
				if(array1[j]>array1[j+1]){
					temp=array1[j];
					array1[j]=array1[j+1];
					array1[j+1]=temp;
					change=true;
				}
			}
			if(!change)
				break;
			change=false;
		}
		System.out.println("After sort:");
		for(int i=0;i<array1.length;i++)
			System.out.printf("%.4f\t",array1[i]);
	}
	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		double[] array1=new double[10];
		System.out.println("Enter 10 double number:");
		for(int i=0;i<array1.length;i++)
			array1[i]=console.nextDouble();
		bubleSort(array1);
	}
}