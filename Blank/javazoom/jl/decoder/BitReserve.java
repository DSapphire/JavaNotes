package javazoom.jl.decoder;

final class BitReserve
{
  private static final int BUFSIZE = 32768;
  private static final int BUFSIZE_MASK = 32767;
  private int offset = 0;
  private int totbit = 0;
  private int buf_byte_idx = 0;
  private final int[] buf = new int[32768];
  private int buf_bit_idx;
  
  public int hsstell()
  {
    return this.totbit;
  }
  
  public int hgetbits(int paramInt)
  {
    this.totbit += paramInt;
    int i = 0;
    int j = this.buf_byte_idx;
    if (j + paramInt < 32768) {
      while (paramInt-- > 0)
      {
        i <<= 1;
        i |= (this.buf[(j++)] != 0 ? 1 : 0);
      }
    }
    while (paramInt-- > 0)
    {
      i <<= 1;
      i |= (this.buf[j] != 0 ? 1 : 0);
      j = j + 1 & 0x7FFF;
    }
    this.buf_byte_idx = j;
    return i;
  }
  
  public int hget1bit()
  {
    this.totbit += 1;
    int i = this.buf[this.buf_byte_idx];
    this.buf_byte_idx = (this.buf_byte_idx + 1 & 0x7FFF);
    return i;
  }
  
  public void hputbuf(int paramInt)
  {
    int i = this.offset;
    this.buf[(i++)] = (paramInt & 0x80);
    this.buf[(i++)] = (paramInt & 0x40);
    this.buf[(i++)] = (paramInt & 0x20);
    this.buf[(i++)] = (paramInt & 0x10);
    this.buf[(i++)] = (paramInt & 0x8);
    this.buf[(i++)] = (paramInt & 0x4);
    this.buf[(i++)] = (paramInt & 0x2);
    this.buf[(i++)] = (paramInt & 0x1);
    if (i == 32768) {
      this.offset = 0;
    } else {
      this.offset = i;
    }
  }
  
  public void rewindNbits(int paramInt)
  {
    this.totbit -= paramInt;
    this.buf_byte_idx -= paramInt;
    if (this.buf_byte_idx < 0) {
      this.buf_byte_idx += 32768;
    }
  }
  
  public void rewindNbytes(int paramInt)
  {
    int i = paramInt << 3;
    this.totbit -= i;
    this.buf_byte_idx -= i;
    if (this.buf_byte_idx < 0) {
      this.buf_byte_idx += 32768;
    }
  }
}


/* Location:              F:\Java\jl1.0.1.jar!\javazoom\jl\decoder\BitReserve.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */