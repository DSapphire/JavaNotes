import java.io.*;
public class Concatenate {
    public static void main(String[] args) throws IOException {
       ListOfFiles mylist = new ListOfFiles(args);
       SequenceInputStream s = new SequenceInputStream(mylist);
        int c;
        while ((c = s.read()) != -1)   System.out.write(c);
       //一个文件结束时，会调用mylist. nextElement()打开下一文件
        s.close();
    }
}
