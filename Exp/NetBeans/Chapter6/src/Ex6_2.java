import java.io.*;
class Ex6_2
{
  public static void main ( String[] args ) throws IOException
    //main�����������׳�IO�쳣
  {
    String fileName = "C:\\Hello.txt"; //ע�⡯\����ת�������Ҫʹ�á�/����\\��
    FileWriter writer = new FileWriter( fileName );//����һ�������ļ��������������
    writer.write( "Hello!\n");   //������д�ַ�����
    writer.write( "This is my first text file,\n"  );
    writer.write( "You can see how this is done.\n" );
    writer.write("����һ������Ҳ����\n");
    writer.close();   //�ر���
  }
}
