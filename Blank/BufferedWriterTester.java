import java.io.*;
class BufferedWriterTester{
	public static void main(String[] args) throws IOException{
		String fileName="Hellobwt.txt";
		BufferedWriter out=new BufferedWriter(
			new FileWriter(fileName));
		out.write("Hellobwt!");
		out.newLine();
		out.write("newLine");
		out.close();
		try{
			//40
		}
	}
}