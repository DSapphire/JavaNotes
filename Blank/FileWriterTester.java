import java.io.*;
class FileWriterTester{
	public static void main(String[] args) throws IOException{
		String fileName="Hello.txt";
		FileWriter writer=new FileWriter(fileName);
		writer.write("Hello!\n");
		writer.write("this is a text file.");
		writer.write("中文????");
		writer.close();
		
	}
	catch(IOException iox){
		System.out.println("Problem Writing"+fileName);
	}
}