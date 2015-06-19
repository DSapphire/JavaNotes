package javazoom.jl.player;

import java.io.InputStream;
import javazoom.jl.decoder.Bitstream;
import javazoom.jl.decoder.BitstreamException;
import javazoom.jl.decoder.Decoder;
import javazoom.jl.decoder.Header;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.decoder.SampleBuffer;

public class Player
{
  private int frame = 0;
  private Bitstream bitstream;
  private Decoder decoder;
  private AudioDevice audio;
  private boolean closed = false;
  private boolean complete = false;
  private int lastPosition = 0;
  
  public Player(InputStream paramInputStream)
    throws JavaLayerException
  {
    this(paramInputStream, null);
  }
  
  public Player(InputStream paramInputStream, AudioDevice paramAudioDevice)
    throws JavaLayerException
  {
    this.bitstream = new Bitstream(paramInputStream);
    this.decoder = new Decoder();
    if (paramAudioDevice != null)
    {
      this.audio = paramAudioDevice;
    }
    else
    {
      FactoryRegistry localFactoryRegistry = FactoryRegistry.systemRegistry();
      this.audio = localFactoryRegistry.createAudioDevice();
    }
    this.audio.open(this.decoder);
  }
  
  public void play()
    throws JavaLayerException
  {
    play(Integer.MAX_VALUE);
  }
  
  public boolean play(int paramInt)
    throws JavaLayerException
  {
    for (boolean bool = true; (paramInt-- > 0) && (bool); bool = decodeFrame()) {}
    if (!bool)
    {
      AudioDevice localAudioDevice = this.audio;
      if (localAudioDevice != null)
      {
        localAudioDevice.flush();
        synchronized (this)
        {
          this.complete = (!this.closed);
          close();
        }
      }
    }
    return bool;
  }
  
  public synchronized void close()
  {
    AudioDevice localAudioDevice = this.audio;
    if (localAudioDevice != null)
    {
      this.closed = true;
      this.audio = null;
      localAudioDevice.close();
      this.lastPosition = localAudioDevice.getPosition();
      try
      {
        this.bitstream.close();
      }
      catch (BitstreamException localBitstreamException) {}
    }
  }
  
  public synchronized boolean isComplete()
  {
    return this.complete;
  }
  
  public int getPosition()
  {
    int i = this.lastPosition;
    AudioDevice localAudioDevice = this.audio;
    if (localAudioDevice != null) {
      i = localAudioDevice.getPosition();
    }
    return i;
  }
  
  protected boolean decodeFrame()
    throws JavaLayerException
  {
    try
    {
      AudioDevice localAudioDevice = this.audio;
      if (localAudioDevice == null) {
        return false;
      }
      Header localHeader = this.bitstream.readFrame();
      if (localHeader == null) {
        return false;
      }
      SampleBuffer localSampleBuffer = (SampleBuffer)this.decoder.decodeFrame(localHeader, this.bitstream);
      synchronized (this)
      {
        localAudioDevice = this.audio;
        if (localAudioDevice != null) {
          localAudioDevice.write(localSampleBuffer.getBuffer(), 0, localSampleBuffer.getBufferLength());
        }
      }
      this.bitstream.closeFrame();
    }
    catch (RuntimeException localRuntimeException)
    {
      throw new JavaLayerException("Exception decoding audio frame", localRuntimeException);
    }
    return true;
  }
}


/* Location:              F:\Java\jl1.0.1.jar!\javazoom\jl\player\Player.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */