import java.io.*;
import java.util.*;
import java.util.zip.*;
public class Ex6_15
{
  //�����̨�׳��쳣
  public static void main(String[] args) throws IOException
{
    FileOutputStream f = new FileOutputStream("c:/test.zip");
    //ָ��ѹ���ļ������׽��ļ�������������ѹ����
    ZipOutputStream out=new ZipOutputStream(new BufferedOutputStream(f));
    for(int i = 0; i < args.length; i++)   //����������ָ����ÿ���ļ����д���
    {
       System.out.println("Writing file " + args[i]);
       BufferedInputStream in =new BufferedInputStream(new FileInputStream(args[i]));
       out.putNextEntry(new ZipEntry(args[i])); //���ļ���Ϊ��������ZipEntry����
       int c;
       while((c = in.read()) != -1)  out.write(c);  //��Դ�ļ���������ѹ���ļ���д��
       in.close();
    }
    out.close();  //�ر������

    // ��ѹ���ļ�����ʾ
    System.out.println("Reading file");
    FileInputStream fi =new FileInputStream("c:/test.zip");
    ZipInputStream in2 =new ZipInputStream(new BufferedInputStream(fi)); 
    ZipEntry ze;
    while((ze = in2.getNextEntry()) != null) //������
    {
      System.out.println("Reading file " + ze.getName());//��ʾ�ļ��������
      int x;
      while((x = in2.read()) != -1)  System.out.write(x); //��ʾ
      System.out.println();
    }    
    in2.close();
  }
}
