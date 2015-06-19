package javazoom.jl.player.advanced;

import java.io.InputStream;
import javazoom.jl.decoder.Bitstream;
import javazoom.jl.decoder.BitstreamException;
import javazoom.jl.decoder.Decoder;
import javazoom.jl.decoder.Header;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.decoder.SampleBuffer;
import javazoom.jl.player.AudioDevice;
import javazoom.jl.player.FactoryRegistry;

public class AdvancedPlayer
{
  private Bitstream bitstream;
  private Decoder decoder;
  private AudioDevice audio;
  private boolean closed = false;
  private boolean complete = false;
  private int lastPosition = 0;
  private PlaybackListener listener;
  
  public AdvancedPlayer(InputStream paramInputStream)
    throws JavaLayerException
  {
    this(paramInputStream, null);
  }
  
  public AdvancedPlayer(InputStream paramInputStream, AudioDevice paramAudioDevice)
    throws JavaLayerException
  {
    this.bitstream = new Bitstream(paramInputStream);
    if (paramAudioDevice != null) {
      this.audio = paramAudioDevice;
    } else {
      this.audio = FactoryRegistry.systemRegistry().createAudioDevice();
    }
    this.audio.open(this.decoder = new Decoder());
  }
  
  public void play()
    throws JavaLayerException
  {
    play(Integer.MAX_VALUE);
  }
  
  public boolean play(int paramInt)
    throws JavaLayerException
  {
    boolean bool = true;
    if (this.listener != null) {
      this.listener.playbackStarted(createEvent(PlaybackEvent.STARTED));
    }
    while ((paramInt-- > 0) && (bool)) {
      bool = decodeFrame();
    }
    AudioDevice localAudioDevice = this.audio;
    if (localAudioDevice != null)
    {
      localAudioDevice.flush();
      synchronized (this)
      {
        this.complete = (!this.closed);
        close();
      }
      if (this.listener != null) {
        this.listener.playbackFinished(createEvent(localAudioDevice, PlaybackEvent.STOPPED));
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
  
  protected boolean skipFrame()
    throws JavaLayerException
  {
    Header localHeader = this.bitstream.readFrame();
    if (localHeader == null) {
      return false;
    }
    this.bitstream.closeFrame();
    return true;
  }
  
  public boolean play(int paramInt1, int paramInt2)
    throws JavaLayerException
  {
    boolean bool = true;
    int i = paramInt1;
    while ((i-- > 0) && (bool)) {
      bool = skipFrame();
    }
    return play(paramInt2 - paramInt1);
  }
  
  private PlaybackEvent createEvent(int paramInt)
  {
    return createEvent(this.audio, paramInt);
  }
  
  private PlaybackEvent createEvent(AudioDevice paramAudioDevice, int paramInt)
  {
    return new PlaybackEvent(this, paramInt, paramAudioDevice.getPosition());
  }
  
  public void setPlayBackListener(PlaybackListener paramPlaybackListener)
  {
    this.listener = paramPlaybackListener;
  }
  
  public PlaybackListener getPlayBackListener()
  {
    return this.listener;
  }
  
  public void stop()
  {
    this.listener.playbackFinished(createEvent(PlaybackEvent.STOPPED));
    close();
  }
}


/* Location:              F:\Java\jl1.0.1.jar!\javazoom\jl\player\advanced\AdvancedPlayer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */