package javazoom.jl.decoder;

public abstract interface BitstreamErrors
  extends JavaLayerErrors
{
  public static final int UNKNOWN_ERROR = 256;
  public static final int UNKNOWN_SAMPLE_RATE = 257;
  public static final int STREAM_ERROR = 258;
  public static final int UNEXPECTED_EOF = 259;
  public static final int STREAM_EOF = 260;
  public static final int INVALIDFRAME = 261;
  public static final int BITSTREAM_LAST = 511;
}


/* Location:              F:\Java\jl1.0.1.jar!\javazoom\jl\decoder\BitstreamErrors.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */