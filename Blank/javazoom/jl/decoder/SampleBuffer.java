package javazoom.jl.decoder;

public class SampleBuffer
  extends Obuffer
{
  private short[] buffer = new short['ऀ'];
  private int[] bufferp = new int[2];
  private int channels;
  private int frequency;
  
  public SampleBuffer(int paramInt1, int paramInt2)
  {
    this.channels = paramInt2;
    this.frequency = paramInt1;
    for (int i = 0; i < paramInt2; i++) {
      this.bufferp[i] = ((short)i);
    }
  }
  
  public int getChannelCount()
  {
    return this.channels;
  }
  
  public int getSampleFrequency()
  {
    return this.frequency;
  }
  
  public short[] getBuffer()
  {
    return this.buffer;
  }
  
  public int getBufferLength()
  {
    return this.bufferp[0];
  }
  
  public void append(int paramInt, short paramShort)
  {
    this.buffer[this.bufferp[paramInt]] = paramShort;
    this.bufferp[paramInt] += this.channels;
  }
  
  public void appendSamples(int paramInt, float[] paramArrayOfFloat)
  {
    int i = this.bufferp[paramInt];
    int k = 0;
    while (k < 32)
    {
      float f = paramArrayOfFloat[(k++)];
      f = f < -32767.0F ? -32767.0F : f > 32767.0F ? 32767.0F : f;
      int j = (short)(int)f;
      this.buffer[i] = j;
      i += this.channels;
    }
    this.bufferp[paramInt] = i;
  }
  
  public void write_buffer(int paramInt) {}
  
  public void close() {}
  
  public void clear_buffer()
  {
    for (int i = 0; i < this.channels; i++) {
      this.bufferp[i] = ((short)i);
    }
  }
  
  public void set_stop_flag() {}
}


/* Location:              F:\Java\jl1.0.1.jar!\javazoom\jl\decoder\SampleBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */