import java.io.*;

public class Redirecting{
	public static void main(String[] args) throws IOException{
		System.out.println("SSS");//
		BufferedInputStream in =new BufferedInputStream(
			new FileInputStream("Redirecting.java"));
		PrintStream out =new PrintStream(new
			BufferedOutputStream(new FileOutputStream("test.out")));
		System.setIn(in);
		System.setOut(out);
		System.setErr(out);
		BufferedReader br=new BufferedReader(
			new InputStreamReader(System.in));
		String s;
		System.out.println("SSS");//
		while((s=br.readLine())!=null)
			System.out.println(s);
		
		System.out.println("SSS");//
		out.close();
	}
}