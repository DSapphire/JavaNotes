package javazoom.jl.decoder;

import java.io.PrintStream;

public class JavaLayerException
  extends Exception
{
  private Throwable exception;
  
  public JavaLayerException() {}
  
  public JavaLayerException(String paramString)
  {
    super(paramString);
  }
  
  public JavaLayerException(String paramString, Throwable paramThrowable)
  {
    super(paramString);
    this.exception = paramThrowable;
  }
  
  public Throwable getException()
  {
    return this.exception;
  }
  
  public void printStackTrace()
  {
    printStackTrace(System.err);
  }
  
  public void printStackTrace(PrintStream paramPrintStream)
  {
    if (this.exception == null) {
      super.printStackTrace(paramPrintStream);
    } else {
      this.exception.printStackTrace();
    }
  }
}


/* Location:              F:\Java\jl1.0.1.jar!\javazoom\jl\decoder\JavaLayerException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */