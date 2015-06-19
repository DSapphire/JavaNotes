import java.util.Scanner;
public class srpGame{
	public static void main(String[] args) {
		boolean play=true;
		while(play){
			int num;
			Scanner input=new Scanner(System.in);
			do{
				System.out.println("Please enter a integer number");
				System.out.println("0 to represent scissor,1 to rock,2 to paper:");
				num=input.nextInt();
			}while(num<0||num>2);
			int temp;
			temp=(int)(Math.random()*3);
			if(temp==num){
				System.out.println("No one win,both you and computer play "+srpPrint(num));
			}else if(temp-num==1||temp-num==-2){
				System.out.println("The computer win,he play "+srpPrint(temp)+"and you play "+srpPrint(num));
			}else{
				System.out.println("You win,computer play "+srpPrint(temp)+"and you play "+srpPrint(num));
			}
			//addtional fuction to play more than once
			System.out.println("Do you want to play again? enter 0 to stop and 1 to continue:");
			int nplay=input.nextInt();
			if(nplay==0){
				play=false;
			}
		}
	}
	static String srpPrint(int num){
		switch(num){
			case 0:return "sissor";
			case 1:return "rock";
			case 2:return "paper";
			default:return "default";
		}
	}
}