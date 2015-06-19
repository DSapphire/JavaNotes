import java.util.Scanner;
public class CoutDay
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number for minutes:");
		int minute=input.nextInt();
		int days=minute/24/60;
		int minutes=minute%(24*60);
		int years=days/365;
		days%=365;
		System.out.printf("\n%d minutes equals to %d years, %d days and %d minutes.\n",minute,
			years,days,minutes);
	}
}