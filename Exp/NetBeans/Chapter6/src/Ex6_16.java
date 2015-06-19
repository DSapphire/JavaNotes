import java.util.*;
import java.util.zip.*;
import java.lang.*;
import java.io.*;
class Unzip
{   
  byte doc[]=null;   //存储解压缩数据的缓冲字节数组
  String Filename=null;  //压缩文件名字符串
  String UnZipPath=null; //解压缩路径字符串
  
  //指定压缩文件名和解压缩路径的构造函数
  public Unzip(String filename,String unZipPath)
  {
    this.Filename=filename;
    this.UnZipPath=unZipPath;
    this.setUnZipPath (this.UnZipPath);
  }
  
  public Unzip(String filename)  //只指定压缩文件名的构造函数
  {
    this.Filename=new String(filename);
    this.UnZipPath=null;
    this.setUnZipPath (this.UnZipPath);
  }  
 
  
  private void setUnZipPath(String unZipPath)  //确保路径名后有“/”
  {
    if(unZipPath.endsWith("\\"))
       this.UnZipPath=new String(unZipPath);
    else
       this.UnZipPath=new String(unZipPath+"\\");
  }
   
  public void doUnZip() //从zip文件中读取数据，并将解压缩文件保存到指定路径下
  {
  	try
	{
      ZipInputStream zipis=new ZipInputStream(new FileInputStream(Filename));
      ZipEntry fEntry=null;
      while((fEntry=zipis.getNextEntry())!=null) //直到压缩文件最后一个入口
	  {
        if (fEntry.isDirectory())  //是路径则创建路径
           checkFilePath(UnZipPath+fEntry.getName());
        else   //是文件则解压缩文件
        {
            String fname=new String(UnZipPath+fEntry.getName());//确定解压缩地址
            try
            {  //从压缩文件中读取解压缩数据存入字节数组中，并写入解压缩地址中
               FileOutputStream out = new FileOutputStream(fname);
               doc=new byte[512];
               int n;
               while ((n = zipis.read(doc,0,512)) != -1)  out.write(doc, 0, n);
               out.close();
               out=null;
               doc=null; 
             }
             catch (Exception ex) {   }
        }
      }
      zipis.close(); //关闭输入流
    }
	catch(IOException ioe)
	{
	  System.out.println(ioe);
    }
  }
  
  //检验路径是否存在，如不存在则创建
  private void checkFilePath(String dirName) throws IOException
  {
        File dir = new File(dirName);
        if(!dir.exists())
           dir.mkdirs(); 
  } 
}
//主类，用于输入参数，生成Unzip类的实例
public class Ex6_16
{
  public static void main(String [] args)
  {
    String zipFile=args[0]; //第一个参数为zip文件名
    String unZipPath=args[1]+"\\";  //第二个参数为指定解压缩路径
    Unzip myZip=new Unzip(zipFile,unZipPath);  //创建一个Unzip类的实例
    myZip.doUnZip();  //调用Unzip类除构造函数外唯一公有方法，完成解压缩
  }
}
