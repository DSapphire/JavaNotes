import java.util.*;
import java.util.zip.*;
import java.lang.*;
import java.io.*;
class Unzip
{   
  byte doc[]=null;   //�洢��ѹ�����ݵĻ����ֽ�����
  String Filename=null;  //ѹ���ļ����ַ���
  String UnZipPath=null; //��ѹ��·���ַ���
  
  //ָ��ѹ���ļ����ͽ�ѹ��·���Ĺ��캯��
  public Unzip(String filename,String unZipPath)
  {
    this.Filename=filename;
    this.UnZipPath=unZipPath;
    this.setUnZipPath (this.UnZipPath);
  }
  
  public Unzip(String filename)  //ָֻ��ѹ���ļ����Ĺ��캯��
  {
    this.Filename=new String(filename);
    this.UnZipPath=null;
    this.setUnZipPath (this.UnZipPath);
  }  
 
  
  private void setUnZipPath(String unZipPath)  //ȷ��·�������С�/��
  {
    if(unZipPath.endsWith("\\"))
       this.UnZipPath=new String(unZipPath);
    else
       this.UnZipPath=new String(unZipPath+"\\");
  }
   
  public void doUnZip() //��zip�ļ��ж�ȡ���ݣ�������ѹ���ļ����浽ָ��·����
  {
  	try
	{
      ZipInputStream zipis=new ZipInputStream(new FileInputStream(Filename));
      ZipEntry fEntry=null;
      while((fEntry=zipis.getNextEntry())!=null) //ֱ��ѹ���ļ����һ�����
	  {
        if (fEntry.isDirectory())  //��·���򴴽�·��
           checkFilePath(UnZipPath+fEntry.getName());
        else   //���ļ����ѹ���ļ�
        {
            String fname=new String(UnZipPath+fEntry.getName());//ȷ����ѹ����ַ
            try
            {  //��ѹ���ļ��ж�ȡ��ѹ�����ݴ����ֽ������У���д���ѹ����ַ��
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
      zipis.close(); //�ر�������
    }
	catch(IOException ioe)
	{
	  System.out.println(ioe);
    }
  }
  
  //����·���Ƿ���ڣ��粻�����򴴽�
  private void checkFilePath(String dirName) throws IOException
  {
        File dir = new File(dirName);
        if(!dir.exists())
           dir.mkdirs(); 
  } 
}
//���࣬�����������������Unzip���ʵ��
public class Ex6_16
{
  public static void main(String [] args)
  {
    String zipFile=args[0]; //��һ������Ϊzip�ļ���
    String unZipPath=args[1]+"\\";  //�ڶ�������Ϊָ����ѹ��·��
    Unzip myZip=new Unzip(zipFile,unZipPath);  //����һ��Unzip���ʵ��
    myZip.doUnZip();  //����Unzip������캯����Ψһ���з�������ɽ�ѹ��
  }
}
