package javazoom.jl.decoder;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamSource
  implements Source
{
  private final InputStream in;
  
  public InputStreamSource(InputStream paramInputStream)
  {
    if (paramInputStream == null) {
      throw new NullPointerException("in");
    }
    this.in = paramInputStream;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    int i = this.in.read(paramArrayOfByte, paramInt1, paramInt2);
    return i;
  }
  
  public boolean willReadBlock()
  {
    return true;
  }
  
  public boolean isSeekable()
  {
    return false;
  }
  
  public long tell()
  {
    return -1L;
  }
  
  public long seek(long paramLong)
  {
    return -1L;
  }
  
  public long length()
  {
    return -1L;
  }
}


/* Location:              F:\Java\jl1.0.1.jar!\javazoom\jl\decoder\InputStreamSource.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */