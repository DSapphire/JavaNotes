import java.util.Scanner;
public class DayOfWeek{
	int year,month,day,week;
	String weekday;
	public DayOfWeek(int year,int month,int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}
	void setDayOfWeek(int year,int month,int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}
	boolean isLeap(){
		if((year%400==0)||(year%4==0&&year%100!=0)){
			return true;
		}else{
			return false;
		}
	}
	boolean judgeMonth(){
		if(month<0||month>12){
			return false;
		}else{
			return true;
		}
	}
	int returnMaxDays(){
		boolean isleap=isLeap();
		if(month==2&&isleap){
			return 29;
		}else if(month==2){
			return 28;
		}else if(month==4||month==6||month==9||month==11){
			return 30;
		}else{
			return 31;
		}
	}
	boolean judgeDay(){
		int maxdays=returnMaxDays();
		if(day>maxdays){
			return false;
		}else{
			return true;
		}
	}
	void setWeek(int week){
		this.week=week;
	}
	void setWeekday(){
		switch(week){
			case 1: weekday=new String("Sunday");break;
			case 2: weekday=new String("Monday");break;
			case 3: weekday=new String("Tuesday");break;
			case 4: weekday=new String("Wednesday");break;
			case 5: weekday=new String("Thursday");break;
			case 6: weekday=new String("Friday");break;
			case 0: weekday=new String("Saturday");break;
		}
	}
	String getWeekday(){
		return weekday;
	}

	public String toString(){
		return "The date "+year+"/"+month+"/"+day;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the year:");
		int years=input.nextInt();
		System.out.println("Please enter the month:");
		int months=input.nextInt();
		System.out.println("Please enter the date:");
		int days=input.nextInt();
		DayOfWeek dayofweek=new DayOfWeek(years,months,days);
		while(dayofweek.judgeMonth()==false){
			System.out.println("Month should be an integer between 1 and 12,Please reenter a number:");
			months=input.nextInt();
			dayofweek.setDayOfWeek(years,months,days);
		}
		while(dayofweek.judgeDay()==false){
			System.out.println("The date exceeds the proper number,Please reenter a number:");
			days=input.nextInt();
			dayofweek.setDayOfWeek(years,months,days);
		}
		if(months<3){
			months+=12;
			years++;
		}
		int week=(days+(int)((26*months+26)/10)+years%100+(int)((years%100)/4)+(int)(years/100)*5+(int)((years/100)/4))%7;
		dayofweek.setWeek(week);
		dayofweek.setWeekday();
		System.out.println(dayofweek+" is "+dayofweek.getWeekday());
	}
}