package javazoom.jl.converter;

public class WaveFile
  extends RiffFile
{
  public static final int MAX_WAVE_CHANNELS = 2;
  private WaveFormat_Chunk wave_format = new WaveFormat_Chunk();
  private RiffFile.RiffChunkHeader pcm_data = new RiffFile.RiffChunkHeader(this);
  private long pcm_data_offset = 0L;
  private int num_samples = 0;
  
  public WaveFile()
  {
    this.pcm_data.ckID = FourCC("data");
    this.pcm_data.ckSize = 0;
    this.num_samples = 0;
  }
  
  public int OpenForWrite(String paramString, int paramInt, short paramShort1, short paramShort2)
  {
    if ((paramString == null) || ((paramShort1 != 8) && (paramShort1 != 16)) || (paramShort2 < 1) || (paramShort2 > 2)) {
      return 4;
    }
    this.wave_format.data.Config(paramInt, paramShort1, paramShort2);
    int i = Open(paramString, 1);
    if (i == 0)
    {
      byte[] arrayOfByte = { 87, 65, 86, 69 };
      i = Write(arrayOfByte, 4);
      if (i == 0)
      {
        i = Write(this.wave_format.header, 8);
        i = Write(this.wave_format.data.wFormatTag, 2);
        i = Write(this.wave_format.data.nChannels, 2);
        i = Write(this.wave_format.data.nSamplesPerSec, 4);
        i = Write(this.wave_format.data.nAvgBytesPerSec, 4);
        i = Write(this.wave_format.data.nBlockAlign, 2);
        i = Write(this.wave_format.data.nBitsPerSample, 2);
        if (i == 0)
        {
          this.pcm_data_offset = CurrentFilePosition();
          i = Write(this.pcm_data, 8);
        }
      }
    }
    return i;
  }
  
  public int WriteData(short[] paramArrayOfShort, int paramInt)
  {
    int i = paramInt * 2;
    this.pcm_data.ckSize += i;
    return super.Write(paramArrayOfShort, i);
  }
  
  public int Close()
  {
    int i = 0;
    if (this.fmode == 1) {
      i = Backpatch(this.pcm_data_offset, this.pcm_data, 8);
    }
    if (i == 0) {
      i = super.Close();
    }
    return i;
  }
  
  public int SamplingRate()
  {
    return this.wave_format.data.nSamplesPerSec;
  }
  
  public short BitsPerSample()
  {
    return this.wave_format.data.nBitsPerSample;
  }
  
  public short NumChannels()
  {
    return this.wave_format.data.nChannels;
  }
  
  public int NumSamples()
  {
    return this.num_samples;
  }
  
  public int OpenForWrite(String paramString, WaveFile paramWaveFile)
  {
    return OpenForWrite(paramString, paramWaveFile.SamplingRate(), paramWaveFile.BitsPerSample(), paramWaveFile.NumChannels());
  }
  
  public long CurrentFilePosition()
  {
    return super.CurrentFilePosition();
  }
  
  public class WaveFileSample
  {
    public short[] chan = new short[2];
    
    public WaveFileSample() {}
  }
  
  class WaveFormat_Chunk
  {
    public RiffFile.RiffChunkHeader header = new RiffFile.RiffChunkHeader(WaveFile.this);
    public WaveFile.WaveFormat_ChunkData data = new WaveFile.WaveFormat_ChunkData(WaveFile.this);
    
    public WaveFormat_Chunk()
    {
      this.header.ckID = RiffFile.FourCC("fmt ");
      this.header.ckSize = 16;
    }
    
    public int VerifyValidity()
    {
      int i = (this.header.ckID == RiffFile.FourCC("fmt ")) && ((this.data.nChannels == 1) || (this.data.nChannels == 2)) && (this.data.nAvgBytesPerSec == this.data.nChannels * this.data.nSamplesPerSec * this.data.nBitsPerSample / 8) && (this.data.nBlockAlign == this.data.nChannels * this.data.nBitsPerSample / 8) ? 1 : 0;
      if (i == 1) {
        return 1;
      }
      return 0;
    }
  }
  
  class WaveFormat_ChunkData
  {
    public short wFormatTag = 0;
    public short nChannels = 0;
    public int nSamplesPerSec = 0;
    public int nAvgBytesPerSec = 0;
    public short nBlockAlign = 0;
    public short nBitsPerSample = 0;
    
    public WaveFormat_ChunkData()
    {
      Config(44100, (short)16, (short)1);
    }
    
    public void Config(int paramInt, short paramShort1, short paramShort2)
    {
      this.nSamplesPerSec = paramInt;
      this.nChannels = paramShort2;
      this.nBitsPerSample = paramShort1;
      this.nAvgBytesPerSec = (this.nChannels * this.nSamplesPerSec * this.nBitsPerSample / 8);
      this.nBlockAlign = ((short)(this.nChannels * this.nBitsPerSample / 8));
    }
  }
}


/* Location:              F:\Java\jl1.0.1.jar!\javazoom\jl\converter\WaveFile.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */