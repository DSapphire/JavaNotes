import java.util.Scanner;
public class ComputeNO{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int pcnt=0,ncnt=0,sum=0,temp=0;
		while(true){
			temp=input.nextInt();
			sum+=temp;
			if(temp>0){
				pcnt++;
			}else if(temp<0){
				ncnt++;
			}else{
				break;
			}
		}
		if(pcnt>0||ncnt>0){
			System.out.printf("\nYou have enter %d positive numbers and %d negative numbers",pcnt,ncnt);
			System.out.printf("\nThe sum is %d and the average is %f.",sum,(double)(1.0*sum/(pcnt+ncnt)));
		}else if(pcnt==0&&ncnt==0){
			System.out.println("\nYou have enter 0 positive number and 0 negative number");
		}
	}
}