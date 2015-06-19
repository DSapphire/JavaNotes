package javazoom.jl.player;

import javazoom.jl.decoder.Decoder;
import javazoom.jl.decoder.JavaLayerException;

public abstract class AudioDeviceBase
  implements AudioDevice
{
  private boolean open = false;
  private Decoder decoder = null;
  
  public synchronized void open(Decoder paramDecoder)
    throws JavaLayerException
  {
    if (!isOpen())
    {
      this.decoder = paramDecoder;
      openImpl();
      setOpen(true);
    }
  }
  
  protected void openImpl()
    throws JavaLayerException
  {}
  
  protected void setOpen(boolean paramBoolean)
  {
    this.open = paramBoolean;
  }
  
  public synchronized boolean isOpen()
  {
    return this.open;
  }
  
  public synchronized void close()
  {
    if (isOpen())
    {
      closeImpl();
      setOpen(false);
      this.decoder = null;
    }
  }
  
  protected void closeImpl() {}
  
  public void write(short[] paramArrayOfShort, int paramInt1, int paramInt2)
    throws JavaLayerException
  {
    if (isOpen()) {
      writeImpl(paramArrayOfShort, paramInt1, paramInt2);
    }
  }
  
  protected void writeImpl(short[] paramArrayOfShort, int paramInt1, int paramInt2)
    throws JavaLayerException
  {}
  
  public void flush()
  {
    if (isOpen()) {
      flushImpl();
    }
  }
  
  protected void flushImpl() {}
  
  protected Decoder getDecoder()
  {
    return this.decoder;
  }
}


/* Location:              F:\Java\jl1.0.1.jar!\javazoom\jl\player\AudioDeviceBase.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */