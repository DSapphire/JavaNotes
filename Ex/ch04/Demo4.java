import java.util.Scanner;
public class Demo4{
	public static boolean equal(int[] list1, int[] list2){
		if(list1.length!=list2.length){
			return false;
		}
		for(int i=0;i<list2.length;i++){
			if(list2[i]!=list1[i]){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int length;
		System.out.println("Please enter the length of the first int array:");
		length=console.nextInt();
		int[] list1=new int[length];

		for(int i=0;i<length;i++){
			System.out.printf("Please enter the %d of the first int array:",i+1);
			list1[i]=console.nextInt();
		}

		System.out.println("Please enter the length of the second int array:");
		length=console.nextInt();
		int[] list2=new int[length];

		for(int i=0;i<length;i++){
			System.out.printf("Please enter the %d of the second int array:",i+1);
			list2[i]=console.nextInt();
		}
		if(equal(list1,list2)){
			System.out.printf("The two arrays are the same!");
		}else{
			System.out.printf("The two arrays are not the same!");
		}

	}
}