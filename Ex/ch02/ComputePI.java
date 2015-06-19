import java.util.Scanner;
public class ComputePI{
	public static void main(String[] args) {
		double pi=0,cnt=0,temp=1.0;
		int i,n;
		i=1;
		for(n=1;n<11;n++){
			for(;i<=10000*n;i++){
				cnt=4/(temp*(2*i-1));
				pi+=cnt;
				temp*=(-1);
			}
			//System.out.printf("%d",i);
			System.out.printf("\nwhen i=%d pi=%f.\n",10000*n,pi);
		}

	}
}