import java.util.Arrays;
import java.util.Scanner;
public class GetGene{
	public static boolean isGene(String s){
		return s.matches("^[ATCG]+$");
	}
	public static int getGene(String s){
		String temp;
		int begin=-1,endl=-1,cnt=0;
		int[] end={-1,-1,-1};
		while(true){
			begin=s.indexOf("ATG");
			if(begin==-1)
				break;
			temp=s.substring(begin+3);
			end[0]=temp.indexOf("TAG");
			end[1]=temp.indexOf("TAA");
			end[2]=temp.indexOf("TGA");
			Arrays.sort(end);
			endl=-1;
			if(end[0]>0&& end[0]%3==0)
				endl=end[0];
			else if(end[1]>0&& end[1]%3==0)
				endl=end[1];
			else if(end[2]>0&&end[2]%3==0)
				endl=end[2];
			if(endl>0)
				cnt++;
			if(endl==-1)
				break;
			s=temp.substring(endl+3);
		}
		return cnt;

	}
	public static void main(String[] args) {
		// if(isGene(args[0]))
		// 	System.out.println(getGene(args[0]));
		Scanner console=new Scanner(System.in);
		System.out.println("Please enter a string of Gene:");
		String s=console.next();
		if(isGene(s))
			System.out.printf("In the Genes \""+s+
				"\" there are %d genes.",getGene(s));
		else
			System.out.println("Erro Input.");
	}
}