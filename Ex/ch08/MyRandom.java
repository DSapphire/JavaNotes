import java.util.Random;
public class MyRandom{
	private Random random;
	private long seed;
	private int[] randomNo;
	public MyRandom(){
		this.seed=1000L;
		this.random=new Random(seed);
		randomNo=new int[50];
	}
	public int[] getRandomNo(){
		for(int i=0;i<randomNo.length;i++){
			this.randomNo[i]=random.nextInt(100);
		}
		return this.randomNo;
	}
	public void printRandomNo(){
		for(int i=0;i<randomNo.length;i++){
			System.out.print(this.randomNo[i]+"\t");
			if((i+1)%8==0)
				System.out.println();
		}
	}
	public static void main(String[] args) {
		MyRandom mr=new MyRandom();
		mr.getRandomNo();
		mr.printRandomNo();
	}
}