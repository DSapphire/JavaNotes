package javazoom.jl.player;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javazoom.jl.decoder.Decoder;
import javazoom.jl.decoder.JavaLayerException;

public class JavaSoundAudioDevice
  extends AudioDeviceBase
{
  private SourceDataLine source = null;
  private AudioFormat fmt = null;
  private byte[] byteBuf = new byte['က'];
  
  protected void setAudioFormat(AudioFormat paramAudioFormat)
  {
    this.fmt = paramAudioFormat;
  }
  
  protected AudioFormat getAudioFormat()
  {
    if (this.fmt == null)
    {
      Decoder localDecoder = getDecoder();
      this.fmt = new AudioFormat(localDecoder.getOutputFrequency(), 16, localDecoder.getOutputChannels(), true, false);
    }
    return this.fmt;
  }
  
  protected DataLine.Info getSourceLineInfo()
  {
    AudioFormat localAudioFormat = getAudioFormat();
    DataLine.Info localInfo = new DataLine.Info(SourceDataLine.class, localAudioFormat);
    return localInfo;
  }
  
  public void open(AudioFormat paramAudioFormat)
    throws JavaLayerException
  {
    if (!isOpen())
    {
      setAudioFormat(paramAudioFormat);
      openImpl();
      setOpen(true);
    }
  }
  
  protected void openImpl()
    throws JavaLayerException
  {}
  
  protected void createSource()
    throws JavaLayerException
  {
    Object localObject = null;
    try
    {
      Line localLine = AudioSystem.getLine(getSourceLineInfo());
      if ((localLine instanceof SourceDataLine))
      {
        this.source = ((SourceDataLine)localLine);
        this.source.open(this.fmt);
        this.source.start();
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      localObject = localRuntimeException;
    }
    catch (LinkageError localLinkageError)
    {
      localObject = localLinkageError;
    }
    catch (LineUnavailableException localLineUnavailableException)
    {
      localObject = localLineUnavailableException;
    }
    if (this.source == null) {
      throw new JavaLayerException("cannot obtain source audio line", (Throwable)localObject);
    }
  }
  
  public int millisecondsToBytes(AudioFormat paramAudioFormat, int paramInt)
  {
    return (int)(paramInt * (paramAudioFormat.getSampleRate() * paramAudioFormat.getChannels() * paramAudioFormat.getSampleSizeInBits()) / 8000.0D);
  }
  
  protected void closeImpl()
  {
    if (this.source != null) {
      this.source.close();
    }
  }
  
  protected void writeImpl(short[] paramArrayOfShort, int paramInt1, int paramInt2)
    throws JavaLayerException
  {
    if (this.source == null) {
      createSource();
    }
    byte[] arrayOfByte = toByteArray(paramArrayOfShort, paramInt1, paramInt2);
    this.source.write(arrayOfByte, 0, paramInt2 * 2);
  }
  
  protected byte[] getByteArray(int paramInt)
  {
    if (this.byteBuf.length < paramInt) {
      this.byteBuf = new byte[paramInt + 1024];
    }
    return this.byteBuf;
  }
  
  protected byte[] toByteArray(short[] paramArrayOfShort, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = getByteArray(paramInt2 * 2);
    int i = 0;
    while (paramInt2-- > 0)
    {
      int j = paramArrayOfShort[(paramInt1++)];
      arrayOfByte[(i++)] = ((byte)j);
      arrayOfByte[(i++)] = ((byte)(j >>> 8));
    }
    return arrayOfByte;
  }
  
  protected void flushImpl()
  {
    if (this.source != null) {
      this.source.drain();
    }
  }
  
  public int getPosition()
  {
    int i = 0;
    if (this.source != null) {
      i = (int)(this.source.getMicrosecondPosition() / 1000L);
    }
    return i;
  }
  
  public void test()
    throws JavaLayerException
  {
    try
    {
      open(new AudioFormat(22050.0F, 16, 1, true, false));
      short[] arrayOfShort = new short['࢝'];
      write(arrayOfShort, 0, arrayOfShort.length);
      flush();
      close();
    }
    catch (RuntimeException localRuntimeException)
    {
      throw new JavaLayerException("Device test failed: " + localRuntimeException);
    }
  }
}


/* Location:              F:\Java\jl1.0.1.jar!\javazoom\jl\player\JavaSoundAudioDevice.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */