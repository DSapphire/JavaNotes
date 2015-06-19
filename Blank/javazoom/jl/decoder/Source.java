package javazoom.jl.decoder;

import java.io.IOException;

public abstract interface Source
{
  public static final long LENGTH_UNKNOWN = -1L;
  
  public abstract int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException;
  
  public abstract boolean willReadBlock();
  
  public abstract boolean isSeekable();
  
  public abstract long length();
  
  public abstract long tell();
  
  public abstract long seek(long paramLong);
}


/* Location:              F:\Java\jl1.0.1.jar!\javazoom\jl\decoder\Source.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */