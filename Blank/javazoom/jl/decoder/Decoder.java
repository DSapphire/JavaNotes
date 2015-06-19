package javazoom.jl.decoder;

public class Decoder
  implements DecoderErrors
{
  private static final Params DEFAULT_PARAMS = new Params();
  private Obuffer output;
  private SynthesisFilter filter1;
  private SynthesisFilter filter2;
  private LayerIIIDecoder l3decoder;
  private LayerIIDecoder l2decoder;
  private LayerIDecoder l1decoder;
  private int outputFrequency;
  private int outputChannels;
  private Equalizer equalizer = new Equalizer();
  private Params params;
  private boolean initialized;
  
  public Decoder()
  {
    this(null);
  }
  
  public Decoder(Params paramParams)
  {
    if (paramParams == null) {
      paramParams = DEFAULT_PARAMS;
    }
    this.params = paramParams;
    Equalizer localEqualizer = this.params.getInitialEqualizerSettings();
    if (localEqualizer != null) {
      this.equalizer.setFrom(localEqualizer);
    }
  }
  
  public static Params getDefaultParams()
  {
    return (Params)DEFAULT_PARAMS.clone();
  }
  
  public void setEqualizer(Equalizer paramEqualizer)
  {
    if (paramEqualizer == null) {
      paramEqualizer = Equalizer.PASS_THRU_EQ;
    }
    this.equalizer.setFrom(paramEqualizer);
    float[] arrayOfFloat = this.equalizer.getBandFactors();
    if (this.filter1 != null) {
      this.filter1.setEQ(arrayOfFloat);
    }
    if (this.filter2 != null) {
      this.filter2.setEQ(arrayOfFloat);
    }
  }
  
  public Obuffer decodeFrame(Header paramHeader, Bitstream paramBitstream)
    throws DecoderException
  {
    if (!this.initialized) {
      initialize(paramHeader);
    }
    int i = paramHeader.layer();
    this.output.clear_buffer();
    FrameDecoder localFrameDecoder = retrieveDecoder(paramHeader, paramBitstream, i);
    localFrameDecoder.decodeFrame();
    this.output.write_buffer(1);
    return this.output;
  }
  
  public void setOutputBuffer(Obuffer paramObuffer)
  {
    this.output = paramObuffer;
  }
  
  public int getOutputFrequency()
  {
    return this.outputFrequency;
  }
  
  public int getOutputChannels()
  {
    return this.outputChannels;
  }
  
  public int getOutputBlockSize()
  {
    return 2304;
  }
  
  protected DecoderException newDecoderException(int paramInt)
  {
    return new DecoderException(paramInt, null);
  }
  
  protected DecoderException newDecoderException(int paramInt, Throwable paramThrowable)
  {
    return new DecoderException(paramInt, paramThrowable);
  }
  
  protected FrameDecoder retrieveDecoder(Header paramHeader, Bitstream paramBitstream, int paramInt)
    throws DecoderException
  {
    Object localObject = null;
    switch (paramInt)
    {
    case 3: 
      if (this.l3decoder == null) {
        this.l3decoder = new LayerIIIDecoder(paramBitstream, paramHeader, this.filter1, this.filter2, this.output, 0);
      }
      localObject = this.l3decoder;
      break;
    case 2: 
      if (this.l2decoder == null)
      {
        this.l2decoder = new LayerIIDecoder();
        this.l2decoder.create(paramBitstream, paramHeader, this.filter1, this.filter2, this.output, 0);
      }
      localObject = this.l2decoder;
      break;
    case 1: 
      if (this.l1decoder == null)
      {
        this.l1decoder = new LayerIDecoder();
        this.l1decoder.create(paramBitstream, paramHeader, this.filter1, this.filter2, this.output, 0);
      }
      localObject = this.l1decoder;
    }
    if (localObject == null) {
      throw newDecoderException(513, null);
    }
    return (FrameDecoder)localObject;
  }
  
  private void initialize(Header paramHeader)
    throws DecoderException
  {
    float f = 32700.0F;
    int i = paramHeader.mode();
    int j = paramHeader.layer();
    int k = i == 3 ? 1 : 2;
    if (this.output == null) {
      this.output = new SampleBuffer(paramHeader.frequency(), k);
    }
    float[] arrayOfFloat = this.equalizer.getBandFactors();
    this.filter1 = new SynthesisFilter(0, f, arrayOfFloat);
    if (k == 2) {
      this.filter2 = new SynthesisFilter(1, f, arrayOfFloat);
    }
    this.outputChannels = k;
    this.outputFrequency = paramHeader.frequency();
    this.initialized = true;
  }
  
  public static class Params
    implements Cloneable
  {
    private OutputChannels outputChannels = OutputChannels.BOTH;
    private Equalizer equalizer = new Equalizer();
    
    public Object clone()
    {
      try
      {
        return super.clone();
      }
      catch (CloneNotSupportedException localCloneNotSupportedException)
      {
        throw new InternalError(this + ": " + localCloneNotSupportedException);
      }
    }
    
    public void setOutputChannels(OutputChannels paramOutputChannels)
    {
      if (paramOutputChannels == null) {
        throw new NullPointerException("out");
      }
      this.outputChannels = paramOutputChannels;
    }
    
    public OutputChannels getOutputChannels()
    {
      return this.outputChannels;
    }
    
    public Equalizer getInitialEqualizerSettings()
    {
      return this.equalizer;
    }
  }
}


/* Location:              F:\Java\jl1.0.1.jar!\javazoom\jl\decoder\Decoder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */