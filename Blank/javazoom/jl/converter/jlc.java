package javazoom.jl.converter;

import java.io.PrintStream;
import java.io.PrintWriter;
import javazoom.jl.decoder.Crc16;
import javazoom.jl.decoder.JavaLayerException;

public class jlc
{
  public static void main(String[] paramArrayOfString)
  {
    long l = System.currentTimeMillis();
    int i = paramArrayOfString.length + 1;
    String[] arrayOfString = new String[i];
    arrayOfString[0] = "jlc";
    for (int j = 0; j < paramArrayOfString.length; j++) {
      arrayOfString[(j + 1)] = paramArrayOfString[j];
    }
    jlcArgs localjlcArgs = new jlcArgs();
    if (!localjlcArgs.processArgs(arrayOfString)) {
      System.exit(1);
    }
    Converter localConverter = new Converter();
    int k = localjlcArgs.verbose_mode ? localjlcArgs.verbose_level : 0;
    Converter.PrintWriterProgressListener localPrintWriterProgressListener = new Converter.PrintWriterProgressListener(new PrintWriter(System.out, true), k);
    try
    {
      localConverter.convert(localjlcArgs.filename, localjlcArgs.output_filename, localPrintWriterProgressListener);
    }
    catch (JavaLayerException localJavaLayerException)
    {
      System.err.println("Convertion failure: " + localJavaLayerException);
    }
    System.exit(0);
  }
  
  static class jlcArgs
  {
    public int which_c = 0;
    public int output_mode;
    public boolean use_own_scalefactor = false;
    public float scalefactor = 32768.0F;
    public String output_filename;
    public String filename;
    public boolean verbose_mode = false;
    public int verbose_level = 3;
    
    public boolean processArgs(String[] paramArrayOfString)
    {
      this.filename = null;
      Crc16[] arrayOfCrc16 = new Crc16[1];
      int j = paramArrayOfString.length;
      this.verbose_mode = false;
      this.output_mode = 0;
      this.output_filename = "";
      if ((j < 2) || (paramArrayOfString[1].equals("-h"))) {
        return Usage();
      }
      for (int i = 1; i < j; i++) {
        if (paramArrayOfString[i].charAt(0) == '-')
        {
          if (paramArrayOfString[i].startsWith("-v"))
          {
            this.verbose_mode = true;
            if (paramArrayOfString[i].length() > 2) {
              try
              {
                String str = paramArrayOfString[i].substring(2);
                this.verbose_level = Integer.parseInt(str);
              }
              catch (NumberFormatException localNumberFormatException)
              {
                System.err.println("Invalid verbose level. Using default.");
              }
            }
            System.out.println("Verbose Activated (level " + this.verbose_level + ")");
          }
          else if (paramArrayOfString[i].equals("-p"))
          {
            i++;
            if (i == j)
            {
              System.out.println("Please specify an output filename after the -p option!");
              System.exit(1);
            }
            this.output_filename = paramArrayOfString[i];
          }
          else
          {
            return Usage();
          }
        }
        else
        {
          this.filename = paramArrayOfString[i];
          System.out.println("FileName = " + paramArrayOfString[i]);
          if (this.filename == null) {
            return Usage();
          }
        }
      }
      if (this.filename == null) {
        return Usage();
      }
      return true;
    }
    
    public boolean Usage()
    {
      System.out.println("JavaLayer Converter :");
      System.out.println("  -v[x]         verbose mode. ");
      System.out.println("                default = 2");
      System.out.println("  -p name    output as a PCM wave file");
      System.out.println("");
      System.out.println("  More info on http://www.javazoom.net");
      return false;
    }
  }
}


/* Location:              F:\Java\jl1.0.1.jar!\javazoom\jl\converter\jlc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */