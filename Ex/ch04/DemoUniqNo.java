import java.util.Scanner;

public class DemoUniqNo{
	public static void main(String[] args) {
		int i=0,j=0,temp,cnt=0;
		boolean isUniq=true;
		int[] uniqNo=new int[10];
		Scanner console=new Scanner(System.in);
		while(i<10){
			temp=console.nextInt();
			for(j=0;j<i;j++){
				if(temp==uniqNo[j]){
					isUniq=false;
					break;
				}
			}
			if(isUniq){
				uniqNo[cnt]=temp;
				cnt++;
			}
			isUniq=true;
			i++;
		}

		for(j=0;j<cnt;j++){
			System.out.println(j+":"+uniqNo[j]);
		}
	}
}