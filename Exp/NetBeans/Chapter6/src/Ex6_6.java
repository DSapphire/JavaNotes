import java.io.*; //ex6_6
class CopyMaker  //����һ����
{
   String sourceName, destName;
   BufferedReader source;
   BufferedWriter dest;
   String line;
   //���˽�з���������Դ�ļ���Ŀ���ļ��������쳣�򷵻�true
   private boolean openFiles()
   {
   	try
   	{
   	source = new BufferedReader(new FileReader( sourceName ));//��Դ�ļ�
   	}
   	catch ( IOException iox )
    {
    	System.out.println("Problem opening " + sourceName ); //�����쳣��ʾ������Ϣ
        return false;
    }
    try
    {
    	dest = new BufferedWriter(new FileWriter( destName )); //��Ŀ���ļ�
    }
    catch ( IOException iox )
    {
    	System.out.println("Problem opening " + destName );
        return false;
    }
    return true;
   }
   private boolean copyFiles() //���˽�з������������ļ��������쳣����true
   {
   	try
   	{
   	  line = source.readLine();    //��Դ�ļ���ȡ����
      while ( line != null )    //һֱ�����ļ�ĩβ
      {
            dest.write(line);   		//��Ŀ���ļ�дһ������
            dest.newLine();           //�ڴ�������ĩβ���У����ֺ�Դ�ļ���ͬ�ĸ�ʽ
            line = source.readLine();  //����һ�����ݣ��絽�ļ���β���򷵻�lineΪnull
      }
    }
    catch ( IOException iox )
    {
    	System.out.println("Problem reading or writing" );
        return false;
    }
    return true;
   }
   private boolean closeFiles() //��˽�з��������ر��ļ��������쳣����true
   {
   	boolean retVal=true;
    try
    {
    	source.close();
    }
    catch ( IOException iox )
    {
    	System.out.println("Problem closing " + sourceName );
        retVal = false;
    }
    try
    {
    	dest.close();
    }
    catch ( IOException iox )
    {
    	System.out.println("Problem closing " + destName );
        retVal = false;
    }
    return retVal;  
    }
    public boolean copy(String src, String dst )
    //�������Ψһ�Ĺ��з������������ַ�������
    {
    	   sourceName = src ;
        destName   = dst ;
      //��������˽�з�����������������true���������򷵻�false������ʾ��Ӧ������Ϣ
        return openFiles() && copyFiles() && closeFiles();
    }
}

public class Ex6_6   //һ���ļ���ֻ����һ��������
{
    public static void main ( String[] args ) //main����Ϊ�������
    {
    	if ( args.length == 2 )   //Ҫ���ṩ����������ΪԴ��Ŀ���ļ���
    	  new CopyMaker().copy(args[0], args[1]); 
         //�½�һ��CopyMaker��Ķ���ִ����copy�������������������ṩ
    	else
          System.out.println("Please Enter File names");  
	//������������������������ʾ��Ϣ���������
    }
}   
