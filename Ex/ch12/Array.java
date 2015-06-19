import java.util.Random;
import java.util.Scanner;
public class Array{
	Scanner console=new Scanner(System.in);
	public int[] getArray(){
		int[] array=new int[100];
		Random ran=new Random();
		for(int i=0;i<array.length;i++){
			array[i]=ran.nextInt(100);
		}
		return array;
	}
	public void play(){
		String c;
		int index;
		int[] array=getArray();
		while(true){
			System.out.println("Enter a number indicate the index of a number in the array:");
			index=console.nextInt();
			if(index<0||index>99){
				System.out.println("Out of Bounds.");
			}else{
				System.out.println("The value is "+array[index]+".");
			}
			System.out.println("Enter q to quit or c to continue to paly:");
			c=console.next();
			if(!c.equals("c"))
				break;
		}
	}
	public void playWithException(){
		String c;
		int index;
		int[] array=getArray();
		while(true){
			System.out.println("Enter a number indicate the index of a number in the array:");
			index=console.nextInt();
			try{
				System.out.println("The value is "+array[index]+".");
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Out of Bounds.");
			}
			System.out.println("Enter q to quit or c to continue to paly:");
			c=console.next();
			if(!c.equals("c"))
				break;
		}
	}
	public static void main(String[] args) {
		Array a=new Array();
		//a.play();
		a.playWithException();
	}
}