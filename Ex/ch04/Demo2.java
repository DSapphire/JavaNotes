import java.util.Scanner;
public class Demo2{
	public static int average(int[] array){
		int sum=0;
		for(int i=0;i<array.length;i++){
			sum+=array[i];
		}
		return sum/array.length;
	}
	public static double average(double[] array){
		double sum=0.0;
		for(int i=0;i<array.length;i++){
			sum+=array[i];
		}
		return sum/array.length;
	}
	public static void main(String[] args) {
		int i;
		Scanner console=new Scanner(System.in);
		int[] intArray=new int[10];
		System.out.println("Enter 10 int:");
		for(i=0;i<10;i++){
			intArray[i]=console.nextInt();
		}
		int intAve=average(intArray);
		System.out.println(""+intAve);

		double[] douArray=new double[10];
		System.out.println("Enter 10 double:");
		for(i=0;i<10;i++){
			douArray[i]=console.nextDouble();
		}
		double douAve=average(douArray);
		System.out.println(""+douAve);
	}
}