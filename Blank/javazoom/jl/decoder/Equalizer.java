package javazoom.jl.decoder;

public final class Equalizer
{
  public static final float BAND_NOT_PRESENT = Float.NEGATIVE_INFINITY;
  public static final Equalizer PASS_THRU_EQ = new Equalizer();
  private static final int BANDS = 32;
  private final float[] settings = new float[32];
  
  public Equalizer() {}
  
  public Equalizer(float[] paramArrayOfFloat)
  {
    setFrom(paramArrayOfFloat);
  }
  
  public Equalizer(EQFunction paramEQFunction)
  {
    setFrom(paramEQFunction);
  }
  
  public void setFrom(float[] paramArrayOfFloat)
  {
    reset();
    int i = paramArrayOfFloat.length > 32 ? 32 : paramArrayOfFloat.length;
    for (int j = 0; j < i; j++) {
      this.settings[j] = limit(paramArrayOfFloat[j]);
    }
  }
  
  public void setFrom(EQFunction paramEQFunction)
  {
    reset();
    int i = 32;
    for (int j = 0; j < i; j++) {
      this.settings[j] = limit(paramEQFunction.getBand(j));
    }
  }
  
  public void setFrom(Equalizer paramEqualizer)
  {
    if (paramEqualizer != this) {
      setFrom(paramEqualizer.settings);
    }
  }
  
  public void reset()
  {
    for (int i = 0; i < 32; i++) {
      this.settings[i] = 0.0F;
    }
  }
  
  public int getBandCount()
  {
    return this.settings.length;
  }
  
  public float setBand(int paramInt, float paramFloat)
  {
    float f = 0.0F;
    if ((paramInt >= 0) && (paramInt < 32))
    {
      f = this.settings[paramInt];
      this.settings[paramInt] = limit(paramFloat);
    }
    return f;
  }
  
  public float getBand(int paramInt)
  {
    float f = 0.0F;
    if ((paramInt >= 0) && (paramInt < 32)) {
      f = this.settings[paramInt];
    }
    return f;
  }
  
  private float limit(float paramFloat)
  {
    if (paramFloat == Float.NEGATIVE_INFINITY) {
      return paramFloat;
    }
    if (paramFloat > 1.0F) {
      return 1.0F;
    }
    if (paramFloat < -1.0F) {
      return -1.0F;
    }
    return paramFloat;
  }
  
  float[] getBandFactors()
  {
    float[] arrayOfFloat = new float[32];
    int i = 0;
    int j = 32;
    while (i < j)
    {
      arrayOfFloat[i] = getBandFactor(this.settings[i]);
      i++;
    }
    return arrayOfFloat;
  }
  
  float getBandFactor(float paramFloat)
  {
    if (paramFloat == Float.NEGATIVE_INFINITY) {
      return 0.0F;
    }
    float f = (float)Math.pow(2.0D, paramFloat);
    return f;
  }
  
  public static abstract class EQFunction
  {
    public float getBand(int paramInt)
    {
      return 0.0F;
    }
  }
}


/* Location:              F:\Java\jl1.0.1.jar!\javazoom\jl\decoder\Equalizer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */