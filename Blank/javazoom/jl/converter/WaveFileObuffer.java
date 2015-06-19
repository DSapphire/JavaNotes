package javazoom.jl.converter;

import javazoom.jl.decoder.Obuffer;

public class WaveFileObuffer
  extends Obuffer
{
  private short[] buffer;
  private short[] bufferp;
  private int channels;
  private WaveFile outWave;
  short[] myBuffer = new short[2];
  
  public WaveFileObuffer(int paramInt1, int paramInt2, String paramString)
  {
    if (paramString == null) {
      throw new NullPointerException("FileName");
    }
    this.buffer = new short['ऀ'];
    this.bufferp = new short[2];
    this.channels = paramInt1;
    for (int i = 0; i < paramInt1; i++) {
      this.bufferp[i] = ((short)i);
    }
    this.outWave = new WaveFile();
    i = this.outWave.OpenForWrite(paramString, paramInt2, (short)16, (short)this.channels);
  }
  
  public void append(int paramInt, short paramShort)
  {
    this.buffer[this.bufferp[paramInt]] = paramShort;
    int tmp17_16 = paramInt;
    short[] tmp17_13 = this.bufferp;
    tmp17_13[tmp17_16] = ((short)(tmp17_13[tmp17_16] + this.channels));
  }
  
  public void write_buffer(int paramInt)
  {
    int i = 0;
    int j = 0;
    j = this.outWave.WriteData(this.buffer, this.bufferp[0]);
    for (int k = 0; k < this.channels; k++) {
      this.bufferp[k] = ((short)k);
    }
  }
  
  public void close()
  {
    this.outWave.Close();
  }
  
  public void clear_buffer() {}
  
  public void set_stop_flag() {}
}


/* Location:              F:\Java\jl1.0.1.jar!\javazoom\jl\converter\WaveFileObuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */