package javazoom.jl.decoder;

public abstract interface Control
{
  public abstract void start();
  
  public abstract void stop();
  
  public abstract boolean isPlaying();
  
  public abstract void pause();
  
  public abstract boolean isRandomAccess();
  
  public abstract double getPosition();
  
  public abstract void setPosition(double paramDouble);
}


/* Location:              F:\Java\jl1.0.1.jar!\javazoom\jl\decoder\Control.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */