import java.util.Scanner;
public class PassWord{
	public static boolean passWord(String pw){
		int dig=0,let=0;
		
		for(int i=0;i<pw.length();i++){
			if(Character.isDigit(pw.charAt(i))){
				dig++;
			}else if(Character.isLetter(pw.charAt(i))){
				let++;
			}else{
				return false;
			}
		}
		if(dig<2||pw.length()<8){
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println("Please input your PassWord:");
		Scanner console=new Scanner(System.in);
		String pw=console.next();
		if(passWord(pw)){
			System.out.println("Valid password!");
		}else{
			System.out.println("Invalid password!");
		}
	}
}