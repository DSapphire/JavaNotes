import java.io.*;
import java.util.*;
import java.util.zip.*;
public class Ex6_15
{
  //向控制台抛出异常
  public static void main(String[] args) throws IOException
{
    FileOutputStream f = new FileOutputStream("c:/test.zip");
    //指定压缩文件名，套接文件流、缓冲流、压缩流
    ZipOutputStream out=new ZipOutputStream(new BufferedOutputStream(f));
    for(int i = 0; i < args.length; i++)   //对命令行中指定的每个文件进行处理
    {
       System.out.println("Writing file " + args[i]);
       BufferedInputStream in =new BufferedInputStream(new FileInputStream(args[i]));
       out.putNextEntry(new ZipEntry(args[i])); //以文件名为参数设置ZipEntry对象
       int c;
       while((c = in.read()) != -1)  out.write(c);  //从源文件读出，往压缩文件中写入
       in.close();
    }
    out.close();  //关闭输出流

    // 解压缩文件并显示
    System.out.println("Reading file");
    FileInputStream fi =new FileInputStream("c:/test.zip");
    ZipInputStream in2 =new ZipInputStream(new BufferedInputStream(fi)); 
    ZipEntry ze;
    while((ze = in2.getNextEntry()) != null) //获得入口
    {
      System.out.println("Reading file " + ze.getName());//显示文件最初名称
      int x;
      while((x = in2.read()) != -1)  System.out.write(x); //显示
      System.out.println();
    }    
    in2.close();
  }
}
