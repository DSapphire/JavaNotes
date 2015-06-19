import java.util.Scanner;
public class CalcuM{
	public static void CalcuMi(int i) {
		int j;
		double mi=0;
		System.out.println("i\tm(i)");
		for(j=1;j<=i;j++){
			mi+=1.0*j/(j+1);
			System.out.printf("%d\t%.4f\n",j,mi);
		}
	}
	public static void main(String[] args) {
		CalcuMi(20);
	}
}