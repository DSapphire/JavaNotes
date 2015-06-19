import java.io.*;
class Ex6_5 {
    public static void main(String[] args) {
        String fileName = "C:/Hello.txt", line;
        try
        {
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            line = in.readLine(); //读取一行内容
            while (line != null) {
                System.out.println(line);
                line = in.readLine();
            }
            in.close();
        } catch (IOException iox) {
            System.out.println("Problem reading " + fileName);
        }
    }
}

