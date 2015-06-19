import java.util.Scanner;
public class Palindrome{
	public static int Reverse(int number){
		int revNo=0,temp;
		while(number>0){
			temp=number%10;
			revNo=revNo*10+temp;
			number/=10;
		}
		//System.out.println(revNo);
		return revNo;
	}
	public static boolean isPalindrome(int number){
		if(number==Reverse(number))
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		System.out.println(isPalindrome(10000001));
		System.out.println(isPalindrome(123));
	}
}