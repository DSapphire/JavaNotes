package javazoom.jl.decoder;

public final class Header
{
  public static final int[][] frequencies = { { 22050, 24000, 16000, 1 }, { 44100, 48000, 32000, 1 }, { 11025, 12000, 8000, 1 } };
  public static final int MPEG2_LSF = 0;
  public static final int MPEG25_LSF = 2;
  public static final int MPEG1 = 1;
  public static final int STEREO = 0;
  public static final int JOINT_STEREO = 1;
  public static final int DUAL_CHANNEL = 2;
  public static final int SINGLE_CHANNEL = 3;
  public static final int FOURTYFOUR_POINT_ONE = 0;
  public static final int FOURTYEIGHT = 1;
  public static final int THIRTYTWO = 2;
  private int h_layer;
  private int h_protection_bit;
  private int h_bitrate_index;
  private int h_padding_bit;
  private int h_mode_extension;
  private int h_version;
  private int h_mode;
  private int h_sample_frequency;
  private int h_number_of_subbands;
  private int h_intensity_stereo_bound;
  private boolean h_copyright;
  private boolean h_original;
  private double[] h_vbr_time_per_frame = { -1.0D, 384.0D, 1152.0D, 1152.0D };
  private boolean h_vbr;
  private int h_vbr_frames;
  private int h_vbr_scale;
  private int h_vbr_bytes;
  private byte[] h_vbr_toc;
  private byte syncmode = Bitstream.INITIAL_SYNC;
  private Crc16 crc;
  public short checksum;
  public int framesize;
  public int nSlots;
  private int _headerstring = -1;
  public static final int[][][] bitrates = { { { 0, 32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000, 0 }, { 0, 8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 0 }, { 0, 8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 0 } }, { { 0, 32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000, 0 }, { 0, 32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000, 0 }, { 0, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 0 } }, { { 0, 32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000, 0 }, { 0, 8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 0 }, { 0, 8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 0 } } };
  public static final String[][][] bitrate_str = { { { "free format", "32 kbit/s", "48 kbit/s", "56 kbit/s", "64 kbit/s", "80 kbit/s", "96 kbit/s", "112 kbit/s", "128 kbit/s", "144 kbit/s", "160 kbit/s", "176 kbit/s", "192 kbit/s", "224 kbit/s", "256 kbit/s", "forbidden" }, { "free format", "8 kbit/s", "16 kbit/s", "24 kbit/s", "32 kbit/s", "40 kbit/s", "48 kbit/s", "56 kbit/s", "64 kbit/s", "80 kbit/s", "96 kbit/s", "112 kbit/s", "128 kbit/s", "144 kbit/s", "160 kbit/s", "forbidden" }, { "free format", "8 kbit/s", "16 kbit/s", "24 kbit/s", "32 kbit/s", "40 kbit/s", "48 kbit/s", "56 kbit/s", "64 kbit/s", "80 kbit/s", "96 kbit/s", "112 kbit/s", "128 kbit/s", "144 kbit/s", "160 kbit/s", "forbidden" } }, { { "free format", "32 kbit/s", "64 kbit/s", "96 kbit/s", "128 kbit/s", "160 kbit/s", "192 kbit/s", "224 kbit/s", "256 kbit/s", "288 kbit/s", "320 kbit/s", "352 kbit/s", "384 kbit/s", "416 kbit/s", "448 kbit/s", "forbidden" }, { "free format", "32 kbit/s", "48 kbit/s", "56 kbit/s", "64 kbit/s", "80 kbit/s", "96 kbit/s", "112 kbit/s", "128 kbit/s", "160 kbit/s", "192 kbit/s", "224 kbit/s", "256 kbit/s", "320 kbit/s", "384 kbit/s", "forbidden" }, { "free format", "32 kbit/s", "40 kbit/s", "48 kbit/s", "56 kbit/s", "64 kbit/s", "80 kbit/s", "96 kbit/s", "112 kbit/s", "128 kbit/s", "160 kbit/s", "192 kbit/s", "224 kbit/s", "256 kbit/s", "320 kbit/s", "forbidden" } }, { { "free format", "32 kbit/s", "48 kbit/s", "56 kbit/s", "64 kbit/s", "80 kbit/s", "96 kbit/s", "112 kbit/s", "128 kbit/s", "144 kbit/s", "160 kbit/s", "176 kbit/s", "192 kbit/s", "224 kbit/s", "256 kbit/s", "forbidden" }, { "free format", "8 kbit/s", "16 kbit/s", "24 kbit/s", "32 kbit/s", "40 kbit/s", "48 kbit/s", "56 kbit/s", "64 kbit/s", "80 kbit/s", "96 kbit/s", "112 kbit/s", "128 kbit/s", "144 kbit/s", "160 kbit/s", "forbidden" }, { "free format", "8 kbit/s", "16 kbit/s", "24 kbit/s", "32 kbit/s", "40 kbit/s", "48 kbit/s", "56 kbit/s", "64 kbit/s", "80 kbit/s", "96 kbit/s", "112 kbit/s", "128 kbit/s", "144 kbit/s", "160 kbit/s", "forbidden" } } };
  
  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer(200);
    localStringBuffer.append("Layer ");
    localStringBuffer.append(layer_string());
    localStringBuffer.append(" frame ");
    localStringBuffer.append(mode_string());
    localStringBuffer.append(' ');
    localStringBuffer.append(version_string());
    if (!checksums()) {
      localStringBuffer.append(" no");
    }
    localStringBuffer.append(" checksums");
    localStringBuffer.append(' ');
    localStringBuffer.append(sample_frequency_string());
    localStringBuffer.append(',');
    localStringBuffer.append(' ');
    localStringBuffer.append(bitrate_string());
    String str = localStringBuffer.toString();
    return str;
  }
  
  void read_header(Bitstream paramBitstream, Crc16[] paramArrayOfCrc16)
    throws BitstreamException
  {
    int k = 0;
    int i;
    do
    {
      i = paramBitstream.syncHeader(this.syncmode);
      this._headerstring = i;
      if (this.syncmode == Bitstream.INITIAL_SYNC)
      {
        this.h_version = (i >>> 19 & 0x1);
        if ((i >>> 20 & 0x1) == 0) {
          if (this.h_version == 0) {
            this.h_version = 2;
          } else {
            throw paramBitstream.newBitstreamException(256);
          }
        }
        if ((this.h_sample_frequency = i >>> 10 & 0x3) == 3) {
          throw paramBitstream.newBitstreamException(256);
        }
      }
      this.h_layer = (4 - (i >>> 17) & 0x3);
      this.h_protection_bit = (i >>> 16 & 0x1);
      this.h_bitrate_index = (i >>> 12 & 0xF);
      this.h_padding_bit = (i >>> 9 & 0x1);
      this.h_mode = (i >>> 6 & 0x3);
      this.h_mode_extension = (i >>> 4 & 0x3);
      if (this.h_mode == 1) {
        this.h_intensity_stereo_bound = ((this.h_mode_extension << 2) + 4);
      } else {
        this.h_intensity_stereo_bound = 0;
      }
      if ((i >>> 3 & 0x1) == 1) {
        this.h_copyright = true;
      }
      if ((i >>> 2 & 0x1) == 1) {
        this.h_original = true;
      }
      if (this.h_layer == 1)
      {
        this.h_number_of_subbands = 32;
      }
      else
      {
        int j = this.h_bitrate_index;
        if (this.h_mode != 3) {
          if (j == 4) {
            j = 1;
          } else {
            j -= 4;
          }
        }
        if ((j == 1) || (j == 2))
        {
          if (this.h_sample_frequency == 2) {
            this.h_number_of_subbands = 12;
          } else {
            this.h_number_of_subbands = 8;
          }
        }
        else if ((this.h_sample_frequency == 1) || ((j >= 3) && (j <= 5))) {
          this.h_number_of_subbands = 27;
        } else {
          this.h_number_of_subbands = 30;
        }
      }
      if (this.h_intensity_stereo_bound > this.h_number_of_subbands) {
        this.h_intensity_stereo_bound = this.h_number_of_subbands;
      }
      calculate_framesize();
      int m = paramBitstream.read_frame_data(this.framesize);
      if ((this.framesize >= 0) && (m != this.framesize)) {
        throw paramBitstream.newBitstreamException(261);
      }
      if (paramBitstream.isSyncCurrentPosition(this.syncmode))
      {
        if (this.syncmode == Bitstream.INITIAL_SYNC)
        {
          this.syncmode = Bitstream.STRICT_SYNC;
          paramBitstream.set_syncword(i & 0xFFF80CC0);
        }
        k = 1;
      }
      else
      {
        paramBitstream.unreadFrame();
      }
    } while (k == 0);
    paramBitstream.parse_frame();
    if (this.h_protection_bit == 0)
    {
      this.checksum = ((short)paramBitstream.get_bits(16));
      if (this.crc == null) {
        this.crc = new Crc16();
      }
      this.crc.add_bits(i, 16);
      paramArrayOfCrc16[0] = this.crc;
    }
    else
    {
      paramArrayOfCrc16[0] = null;
    }
    if (this.h_sample_frequency == 0) {}
  }
  
  void parseVBR(byte[] paramArrayOfByte)
    throws BitstreamException
  {
    String str1 = "Xing";
    byte[] arrayOfByte1 = new byte[4];
    int i = 0;
    if (this.h_version == 1)
    {
      if (this.h_mode == 3) {
        i = 17;
      } else {
        i = 32;
      }
    }
    else if (this.h_mode == 3) {
      i = 9;
    } else {
      i = 17;
    }
    try
    {
      System.arraycopy(paramArrayOfByte, i, arrayOfByte1, 0, 4);
      if (str1.equals(new String(arrayOfByte1)))
      {
        this.h_vbr = true;
        this.h_vbr_frames = -1;
        this.h_vbr_bytes = -1;
        this.h_vbr_scale = -1;
        this.h_vbr_toc = new byte[100];
        int j = 4;
        byte[] arrayOfByte2 = new byte[4];
        System.arraycopy(paramArrayOfByte, i + j, arrayOfByte2, 0, arrayOfByte2.length);
        j += arrayOfByte2.length;
        if ((arrayOfByte2[3] & 0x1) != 0)
        {
          System.arraycopy(paramArrayOfByte, i + j, arrayOfByte1, 0, arrayOfByte1.length);
          this.h_vbr_frames = (arrayOfByte1[0] << 24 & 0xFF000000 | arrayOfByte1[1] << 16 & 0xFF0000 | arrayOfByte1[2] << 8 & 0xFF00 | arrayOfByte1[3] & 0xFF);
          j += 4;
        }
        if ((arrayOfByte2[3] & 0x2) != 0)
        {
          System.arraycopy(paramArrayOfByte, i + j, arrayOfByte1, 0, arrayOfByte1.length);
          this.h_vbr_bytes = (arrayOfByte1[0] << 24 & 0xFF000000 | arrayOfByte1[1] << 16 & 0xFF0000 | arrayOfByte1[2] << 8 & 0xFF00 | arrayOfByte1[3] & 0xFF);
          j += 4;
        }
        if ((arrayOfByte2[3] & 0x4) != 0)
        {
          System.arraycopy(paramArrayOfByte, i + j, this.h_vbr_toc, 0, this.h_vbr_toc.length);
          j += this.h_vbr_toc.length;
        }
        if ((arrayOfByte2[3] & 0x8) != 0)
        {
          System.arraycopy(paramArrayOfByte, i + j, arrayOfByte1, 0, arrayOfByte1.length);
          this.h_vbr_scale = (arrayOfByte1[0] << 24 & 0xFF000000 | arrayOfByte1[1] << 16 & 0xFF0000 | arrayOfByte1[2] << 8 & 0xFF00 | arrayOfByte1[3] & 0xFF);
          j += 4;
        }
      }
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException1)
    {
      throw new BitstreamException("XingVBRHeader Corrupted", localArrayIndexOutOfBoundsException1);
    }
    String str2 = "VBRI";
    i = 32;
    try
    {
      System.arraycopy(paramArrayOfByte, i, arrayOfByte1, 0, 4);
      if (str2.equals(new String(arrayOfByte1)))
      {
        this.h_vbr = true;
        this.h_vbr_frames = -1;
        this.h_vbr_bytes = -1;
        this.h_vbr_scale = -1;
        this.h_vbr_toc = new byte[100];
        int k = 10;
        System.arraycopy(paramArrayOfByte, i + k, arrayOfByte1, 0, arrayOfByte1.length);
        this.h_vbr_bytes = (arrayOfByte1[0] << 24 & 0xFF000000 | arrayOfByte1[1] << 16 & 0xFF0000 | arrayOfByte1[2] << 8 & 0xFF00 | arrayOfByte1[3] & 0xFF);
        k += 4;
        System.arraycopy(paramArrayOfByte, i + k, arrayOfByte1, 0, arrayOfByte1.length);
        this.h_vbr_frames = (arrayOfByte1[0] << 24 & 0xFF000000 | arrayOfByte1[1] << 16 & 0xFF0000 | arrayOfByte1[2] << 8 & 0xFF00 | arrayOfByte1[3] & 0xFF);
        k += 4;
      }
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException2)
    {
      throw new BitstreamException("VBRIVBRHeader Corrupted", localArrayIndexOutOfBoundsException2);
    }
  }
  
  public int version()
  {
    return this.h_version;
  }
  
  public int layer()
  {
    return this.h_layer;
  }
  
  public int bitrate_index()
  {
    return this.h_bitrate_index;
  }
  
  public int sample_frequency()
  {
    return this.h_sample_frequency;
  }
  
  public int frequency()
  {
    return frequencies[this.h_version][this.h_sample_frequency];
  }
  
  public int mode()
  {
    return this.h_mode;
  }
  
  public boolean checksums()
  {
    return this.h_protection_bit == 0;
  }
  
  public boolean copyright()
  {
    return this.h_copyright;
  }
  
  public boolean original()
  {
    return this.h_original;
  }
  
  public boolean vbr()
  {
    return this.h_vbr;
  }
  
  public int vbr_scale()
  {
    return this.h_vbr_scale;
  }
  
  public byte[] vbr_toc()
  {
    return this.h_vbr_toc;
  }
  
  public boolean checksum_ok()
  {
    return this.checksum == this.crc.checksum();
  }
  
  public boolean padding()
  {
    return this.h_padding_bit != 0;
  }
  
  public int slots()
  {
    return this.nSlots;
  }
  
  public int mode_extension()
  {
    return this.h_mode_extension;
  }
  
  public int calculate_framesize()
  {
    if (this.h_layer == 1)
    {
      this.framesize = (12 * bitrates[this.h_version][0][this.h_bitrate_index] / frequencies[this.h_version][this.h_sample_frequency]);
      if (this.h_padding_bit != 0) {
        this.framesize += 1;
      }
      this.framesize <<= 2;
      this.nSlots = 0;
    }
    else
    {
      this.framesize = (144 * bitrates[this.h_version][(this.h_layer - 1)][this.h_bitrate_index] / frequencies[this.h_version][this.h_sample_frequency]);
      if ((this.h_version == 0) || (this.h_version == 2)) {
        this.framesize >>= 1;
      }
      if (this.h_padding_bit != 0) {
        this.framesize += 1;
      }
      if (this.h_layer == 3)
      {
        if (this.h_version == 1) {
          this.nSlots = (this.framesize - (this.h_mode == 3 ? 17 : 32) - (this.h_protection_bit != 0 ? 0 : 2) - 4);
        } else {
          this.nSlots = (this.framesize - (this.h_mode == 3 ? 9 : 17) - (this.h_protection_bit != 0 ? 0 : 2) - 4);
        }
      }
      else {
        this.nSlots = 0;
      }
    }
    this.framesize -= 4;
    return this.framesize;
  }
  
  public int max_number_of_frames(int paramInt)
  {
    if (this.h_vbr == true) {
      return this.h_vbr_frames;
    }
    if (this.framesize + 4 - this.h_padding_bit == 0) {
      return 0;
    }
    return paramInt / (this.framesize + 4 - this.h_padding_bit);
  }
  
  public int min_number_of_frames(int paramInt)
  {
    if (this.h_vbr == true) {
      return this.h_vbr_frames;
    }
    if (this.framesize + 5 - this.h_padding_bit == 0) {
      return 0;
    }
    return paramInt / (this.framesize + 5 - this.h_padding_bit);
  }
  
  public float ms_per_frame()
  {
    if (this.h_vbr == true)
    {
      double d = this.h_vbr_time_per_frame[layer()] / frequency();
      if ((this.h_version == 0) || (this.h_version == 2)) {
        d /= 2.0D;
      }
      return (float)(d * 1000.0D);
    }
    float[][] arrayOfFloat = { { 8.707483F, 8.0F, 12.0F }, { 26.12245F, 24.0F, 36.0F }, { 26.12245F, 24.0F, 36.0F } };
    return arrayOfFloat[(this.h_layer - 1)][this.h_sample_frequency];
  }
  
  public float total_ms(int paramInt)
  {
    return max_number_of_frames(paramInt) * ms_per_frame();
  }
  
  public int getSyncHeader()
  {
    return this._headerstring;
  }
  
  public String layer_string()
  {
    switch (this.h_layer)
    {
    case 1: 
      return "I";
    case 2: 
      return "II";
    case 3: 
      return "III";
    }
    return null;
  }
  
  public String bitrate_string()
  {
    if (this.h_vbr == true) {
      return Integer.toString(bitrate() / 1000) + " kb/s";
    }
    return bitrate_str[this.h_version][(this.h_layer - 1)][this.h_bitrate_index];
  }
  
  public int bitrate()
  {
    if (this.h_vbr == true) {
      return (int)(this.h_vbr_bytes * 8 / (ms_per_frame() * this.h_vbr_frames)) * 1000;
    }
    return bitrates[this.h_version][(this.h_layer - 1)][this.h_bitrate_index];
  }
  
  public int bitrate_instant()
  {
    return bitrates[this.h_version][(this.h_layer - 1)][this.h_bitrate_index];
  }
  
  public String sample_frequency_string()
  {
    switch (this.h_sample_frequency)
    {
    case 2: 
      if (this.h_version == 1) {
        return "32 kHz";
      }
      if (this.h_version == 0) {
        return "16 kHz";
      }
      return "8 kHz";
    case 0: 
      if (this.h_version == 1) {
        return "44.1 kHz";
      }
      if (this.h_version == 0) {
        return "22.05 kHz";
      }
      return "11.025 kHz";
    case 1: 
      if (this.h_version == 1) {
        return "48 kHz";
      }
      if (this.h_version == 0) {
        return "24 kHz";
      }
      return "12 kHz";
    }
    return null;
  }
  
  public String mode_string()
  {
    switch (this.h_mode)
    {
    case 0: 
      return "Stereo";
    case 1: 
      return "Joint stereo";
    case 2: 
      return "Dual channel";
    case 3: 
      return "Single channel";
    }
    return null;
  }
  
  public String version_string()
  {
    switch (this.h_version)
    {
    case 1: 
      return "MPEG-1";
    case 0: 
      return "MPEG-2 LSF";
    case 2: 
      return "MPEG-2.5 LSF";
    }
    return null;
  }
  
  public int number_of_subbands()
  {
    return this.h_number_of_subbands;
  }
  
  public int intensity_stereo_bound()
  {
    return this.h_intensity_stereo_bound;
  }
}


/* Location:              F:\Java\jl1.0.1.jar!\javazoom\jl\decoder\Header.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */