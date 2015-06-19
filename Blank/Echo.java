import java.io.*;

public class Echo{
	public static void main(String[] args) throws IOException{
		BufferedReader in=new BufferedReader(
			new InputStreamReader(System.in));
		String s;
		while((s=in.readLine()).length()!=0)
			System.out.println(s);
		
	}
}