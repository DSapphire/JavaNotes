import java.io.*; //ex6_6
class CopyMaker  //声明一个类
{
   String sourceName, destName;
   BufferedReader source;
   BufferedWriter dest;
   String line;
   //这个私有方法用来打开源文件和目的文件，如无异常则返回true
   private boolean openFiles()
   {
   	try
   	{
   	source = new BufferedReader(new FileReader( sourceName ));//打开源文件
   	}
   	catch ( IOException iox )
    {
    	System.out.println("Problem opening " + sourceName ); //出现异常显示出错信息
        return false;
    }
    try
    {
    	dest = new BufferedWriter(new FileWriter( destName )); //打开目的文件
    }
    catch ( IOException iox )
    {
    	System.out.println("Problem opening " + destName );
        return false;
    }
    return true;
   }
   private boolean copyFiles() //这个私有方法用来拷贝文件，如无异常返回true
   {
   	try
   	{
   	  line = source.readLine();    //从源文件读取数据
      while ( line != null )    //一直读到文件末尾
      {
            dest.write(line);   		//向目的文件写一行数据
            dest.newLine();           //在此行数据末尾换行，保持和源文件相同的格式
            line = source.readLine();  //读下一行数据，如到文件结尾，则返回line为null
      }
    }
    catch ( IOException iox )
    {
    	System.out.println("Problem reading or writing" );
        return false;
    }
    return true;
   }
   private boolean closeFiles() //此私有方法用来关闭文件，如无异常返回true
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
    //这个类中唯一的公有方法，需两个字符串参数
    {
    	   sourceName = src ;
        destName   = dst ;
      //调用三个私有方法，若都正常返回true，有问题则返回false，并显示相应出错信息
        return openFiles() && copyFiles() && closeFiles();
    }
}

public class Ex6_6   //一个文件中只能有一个公有类
{
    public static void main ( String[] args ) //main函数为程序入口
    {
    	if ( args.length == 2 )   //要求提供两个参数作为源和目标文件名
    	  new CopyMaker().copy(args[0], args[1]); 
         //新建一个CopyMaker类的对象并执行其copy方法，参数由命令行提供
    	else
          System.out.println("Please Enter File names");  
	//如果不是两个参数，则给出提示信息，程序结束
    }
}   
