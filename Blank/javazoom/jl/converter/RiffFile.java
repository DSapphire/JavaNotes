package javazoom.jl.converter;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RiffFile
{
  public static final int DDC_SUCCESS = 0;
  public static final int DDC_FAILURE = 1;
  public static final int DDC_OUT_OF_MEMORY = 2;
  public static final int DDC_FILE_ERROR = 3;
  public static final int DDC_INVALID_CALL = 4;
  public static final int DDC_USER_ABORT = 5;
  public static final int DDC_INVALID_FILE = 6;
  public static final int RFM_UNKNOWN = 0;
  public static final int RFM_WRITE = 1;
  public static final int RFM_READ = 2;
  private RiffChunkHeader riff_header = new RiffChunkHeader();
  protected int fmode = 0;
  protected RandomAccessFile file = null;
  
  public RiffFile()
  {
    this.riff_header.ckID = FourCC("RIFF");
    this.riff_header.ckSize = 0;
  }
  
  public int CurrentFileMode()
  {
    return this.fmode;
  }
  
  public int Open(String paramString, int paramInt)
  {
    int i = 0;
    if (this.fmode != 0) {
      i = Close();
    }
    if (i == 0) {
      switch (paramInt)
      {
      case 1: 
        try
        {
          this.file = new RandomAccessFile(paramString, "rw");
          try
          {
            byte[] arrayOfByte1 = new byte[8];
            arrayOfByte1[0] = ((byte)(this.riff_header.ckID >>> 24 & 0xFF));
            arrayOfByte1[1] = ((byte)(this.riff_header.ckID >>> 16 & 0xFF));
            arrayOfByte1[2] = ((byte)(this.riff_header.ckID >>> 8 & 0xFF));
            arrayOfByte1[3] = ((byte)(this.riff_header.ckID & 0xFF));
            int j = (byte)(this.riff_header.ckSize >>> 24 & 0xFF);
            int k = (byte)(this.riff_header.ckSize >>> 16 & 0xFF);
            int m = (byte)(this.riff_header.ckSize >>> 8 & 0xFF);
            int n = (byte)(this.riff_header.ckSize & 0xFF);
            arrayOfByte1[4] = n;
            arrayOfByte1[5] = m;
            arrayOfByte1[6] = k;
            arrayOfByte1[7] = j;
            this.file.write(arrayOfByte1, 0, 8);
            this.fmode = 1;
          }
          catch (IOException localIOException1)
          {
            this.file.close();
            this.fmode = 0;
          }
        }
        catch (IOException localIOException2)
        {
          this.fmode = 0;
          i = 3;
        }
      case 2: 
        try
        {
          this.file = new RandomAccessFile(paramString, "r");
          try
          {
            byte[] arrayOfByte2 = new byte[8];
            this.file.read(arrayOfByte2, 0, 8);
            this.fmode = 2;
            this.riff_header.ckID = (arrayOfByte2[0] << 24 & 0xFF000000 | arrayOfByte2[1] << 16 & 0xFF0000 | arrayOfByte2[2] << 8 & 0xFF00 | arrayOfByte2[3] & 0xFF);
            this.riff_header.ckSize = (arrayOfByte2[4] << 24 & 0xFF000000 | arrayOfByte2[5] << 16 & 0xFF0000 | arrayOfByte2[6] << 8 & 0xFF00 | arrayOfByte2[7] & 0xFF);
          }
          catch (IOException localIOException3)
          {
            this.file.close();
            this.fmode = 0;
          }
        }
        catch (IOException localIOException4)
        {
          this.fmode = 0;
          i = 3;
        }
      default: 
        i = 4;
      }
    }
    return i;
  }
  
  public int Write(byte[] paramArrayOfByte, int paramInt)
  {
    if (this.fmode != 1) {
      return 4;
    }
    try
    {
      this.file.write(paramArrayOfByte, 0, paramInt);
      this.fmode = 1;
    }
    catch (IOException localIOException)
    {
      return 3;
    }
    this.riff_header.ckSize += paramInt;
    return 0;
  }
  
  public int Write(short[] paramArrayOfShort, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    int i = 0;
    int j = 0;
    while (j < paramInt)
    {
      arrayOfByte[j] = ((byte)(paramArrayOfShort[i] & 0xFF));
      arrayOfByte[(j + 1)] = ((byte)(paramArrayOfShort[(i++)] >>> 8 & 0xFF));
      j += 2;
    }
    if (this.fmode != 1) {
      return 4;
    }
    try
    {
      this.file.write(arrayOfByte, 0, paramInt);
      this.fmode = 1;
    }
    catch (IOException localIOException)
    {
      return 3;
    }
    this.riff_header.ckSize += paramInt;
    return 0;
  }
  
  public int Write(RiffChunkHeader paramRiffChunkHeader, int paramInt)
  {
    byte[] arrayOfByte = new byte[8];
    arrayOfByte[0] = ((byte)(paramRiffChunkHeader.ckID >>> 24 & 0xFF));
    arrayOfByte[1] = ((byte)(paramRiffChunkHeader.ckID >>> 16 & 0xFF));
    arrayOfByte[2] = ((byte)(paramRiffChunkHeader.ckID >>> 8 & 0xFF));
    arrayOfByte[3] = ((byte)(paramRiffChunkHeader.ckID & 0xFF));
    int i = (byte)(paramRiffChunkHeader.ckSize >>> 24 & 0xFF);
    int j = (byte)(paramRiffChunkHeader.ckSize >>> 16 & 0xFF);
    int k = (byte)(paramRiffChunkHeader.ckSize >>> 8 & 0xFF);
    int m = (byte)(paramRiffChunkHeader.ckSize & 0xFF);
    arrayOfByte[4] = m;
    arrayOfByte[5] = k;
    arrayOfByte[6] = j;
    arrayOfByte[7] = i;
    if (this.fmode != 1) {
      return 4;
    }
    try
    {
      this.file.write(arrayOfByte, 0, paramInt);
      this.fmode = 1;
    }
    catch (IOException localIOException)
    {
      return 3;
    }
    this.riff_header.ckSize += paramInt;
    return 0;
  }
  
  public int Write(short paramShort, int paramInt)
  {
    int i = (short)(paramShort >>> 8 & 0xFF | paramShort << 8 & 0xFF00);
    if (this.fmode != 1) {
      return 4;
    }
    try
    {
      this.file.writeShort(i);
      this.fmode = 1;
    }
    catch (IOException localIOException)
    {
      return 3;
    }
    this.riff_header.ckSize += paramInt;
    return 0;
  }
  
  public int Write(int paramInt1, int paramInt2)
  {
    int i = (short)(paramInt1 >>> 16 & 0xFFFF);
    int j = (short)(paramInt1 & 0xFFFF);
    int k = (short)(i >>> 8 & 0xFF | i << 8 & 0xFF00);
    int m = (short)(j >>> 8 & 0xFF | j << 8 & 0xFF00);
    int n = m << 16 & 0xFFFF0000 | k & 0xFFFF;
    if (this.fmode != 1) {
      return 4;
    }
    try
    {
      this.file.writeInt(n);
      this.fmode = 1;
    }
    catch (IOException localIOException)
    {
      return 3;
    }
    this.riff_header.ckSize += paramInt2;
    return 0;
  }
  
  public int Read(byte[] paramArrayOfByte, int paramInt)
  {
    int i = 0;
    try
    {
      this.file.read(paramArrayOfByte, 0, paramInt);
    }
    catch (IOException localIOException)
    {
      i = 3;
    }
    return i;
  }
  
  public int Expect(String paramString, int paramInt)
  {
    int i = 0;
    int j = 0;
    try
    {
      while (paramInt-- != 0)
      {
        i = this.file.readByte();
        if (i != paramString.charAt(j++)) {
          return 3;
        }
      }
    }
    catch (IOException localIOException)
    {
      return 3;
    }
    return 0;
  }
  
  public int Close()
  {
    int i = 0;
    switch (this.fmode)
    {
    case 1: 
      try
      {
        this.file.seek(0L);
        try
        {
          byte[] arrayOfByte = new byte[8];
          arrayOfByte[0] = ((byte)(this.riff_header.ckID >>> 24 & 0xFF));
          arrayOfByte[1] = ((byte)(this.riff_header.ckID >>> 16 & 0xFF));
          arrayOfByte[2] = ((byte)(this.riff_header.ckID >>> 8 & 0xFF));
          arrayOfByte[3] = ((byte)(this.riff_header.ckID & 0xFF));
          arrayOfByte[7] = ((byte)(this.riff_header.ckSize >>> 24 & 0xFF));
          arrayOfByte[6] = ((byte)(this.riff_header.ckSize >>> 16 & 0xFF));
          arrayOfByte[5] = ((byte)(this.riff_header.ckSize >>> 8 & 0xFF));
          arrayOfByte[4] = ((byte)(this.riff_header.ckSize & 0xFF));
          this.file.write(arrayOfByte, 0, 8);
          this.file.close();
        }
        catch (IOException localIOException1)
        {
          i = 3;
        }
      }
      catch (IOException localIOException2)
      {
        i = 3;
      }
    case 2: 
      try
      {
        this.file.close();
      }
      catch (IOException localIOException3)
      {
        i = 3;
      }
    }
    this.file = null;
    this.fmode = 0;
    return i;
  }
  
  public long CurrentFilePosition()
  {
    long l;
    try
    {
      l = this.file.getFilePointer();
    }
    catch (IOException localIOException)
    {
      l = -1L;
    }
    return l;
  }
  
  public int Backpatch(long paramLong, RiffChunkHeader paramRiffChunkHeader, int paramInt)
  {
    if (this.file == null) {
      return 4;
    }
    try
    {
      this.file.seek(paramLong);
    }
    catch (IOException localIOException)
    {
      return 3;
    }
    return Write(paramRiffChunkHeader, paramInt);
  }
  
  public int Backpatch(long paramLong, byte[] paramArrayOfByte, int paramInt)
  {
    if (this.file == null) {
      return 4;
    }
    try
    {
      this.file.seek(paramLong);
    }
    catch (IOException localIOException)
    {
      return 3;
    }
    return Write(paramArrayOfByte, paramInt);
  }
  
  protected int Seek(long paramLong)
  {
    int i;
    try
    {
      this.file.seek(paramLong);
      i = 0;
    }
    catch (IOException localIOException)
    {
      i = 3;
    }
    return i;
  }
  
  private String DDCRET_String(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return "DDC_SUCCESS";
    case 1: 
      return "DDC_FAILURE";
    case 2: 
      return "DDC_OUT_OF_MEMORY";
    case 3: 
      return "DDC_FILE_ERROR";
    case 4: 
      return "DDC_INVALID_CALL";
    case 5: 
      return "DDC_USER_ABORT";
    case 6: 
      return "DDC_INVALID_FILE";
    }
    return "Unknown Error";
  }
  
  public static int FourCC(String paramString)
  {
    byte[] arrayOfByte = { 32, 32, 32, 32 };
    paramString.getBytes(0, 4, arrayOfByte, 0);
    int i = arrayOfByte[0] << 24 & 0xFF000000 | arrayOfByte[1] << 16 & 0xFF0000 | arrayOfByte[2] << 8 & 0xFF00 | arrayOfByte[3] & 0xFF;
    return i;
  }
  
  class RiffChunkHeader
  {
    public int ckID = 0;
    public int ckSize = 0;
    
    public RiffChunkHeader() {}
  }
}


/* Location:              F:\Java\jl1.0.1.jar!\javazoom\jl\converter\RiffFile.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */