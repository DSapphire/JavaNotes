package javazoom.jl.decoder;

public final class Crc16
{
  private static short polynomial = 32773;
  private short crc = -1;
  
  public void add_bits(int paramInt1, int paramInt2)
  {
    int i = 1 << paramInt2 - 1;
    do
    {
      if ((((this.crc & 0x8000) == 0 ? 1 : 0) ^ ((paramInt1 & i) == 0 ? 1 : 0)) != 0)
      {
        this.crc = ((short)(this.crc << 1));
        this.crc = ((short)(this.crc ^ polynomial));
      }
      else
      {
        this.crc = ((short)(this.crc << 1));
      }
    } while (i >>>= 1 != 0);
  }
  
  public short checksum()
  {
    short s = this.crc;
    this.crc = -1;
    return s;
  }
}


/* Location:              F:\Java\jl1.0.1.jar!\javazoom\jl\decoder\Crc16.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */