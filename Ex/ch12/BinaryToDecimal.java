import java.util.Random;
import java.util.Scanner;
public class BinaryToDecimal{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a binary number string: ");
		String s = input.nextLine();
		try{
			System.out.println("The decimal value is " + binaryToDecimal(s));
		}catch(BinaryFOrmatException e){
			e.printStackTrace();
		}
		
	}
	public static int binaryToDecimal(String binaryString) throws BinaryFOrmatException{
		for(int i = 1; i < binaryString.length(); i++){
			if(binaryString.charAt(i)!='0'&&binaryString.charAt(i)!='1')
				throw new BinaryFOrmatException();
		}
		int value = binaryString.charAt(0) - '0';
		for (int i = 1; i < binaryString.length(); i++){
			value = value * 2 + binaryString.charAt(i) - '0';
		}
		return value;
	}
}
class BinaryFOrmatException extends Exception{
	public BinaryFOrmatException(){
		super("BinaryFOrmatException!");
	}
}