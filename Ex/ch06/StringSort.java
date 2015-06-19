import java.util.Arrays;
public class StringSort{
	public static String sort(String s){
		char[] sArray=s.toCharArray();
		Arrays.sort(sArray);
		return new String(sArray);
	}
	public static void main(String[] args) {
		for(int i=0;i<args.length;i++){
			System.out.println(sort(args[i]));
		}
	}
}