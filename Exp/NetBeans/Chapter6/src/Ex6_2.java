import java.io.*;
class Ex6_2
{
  public static void main ( String[] args ) throws IOException
    //main方法中声明抛出IO异常
  {
    String fileName = "C:\\Hello.txt"; //注意’\’是转义符，需要使用’/’或’\\’
    FileWriter writer = new FileWriter( fileName );//创建一个给定文件名的输出流对象
    writer.write( "Hello!\n");   //往流里写字符数组
    writer.write( "This is my first text file,\n"  );
    writer.write( "You can see how this is done.\n" );
    writer.write("输入一行中文也可以\n");
    writer.close();   //关闭流
  }
}
