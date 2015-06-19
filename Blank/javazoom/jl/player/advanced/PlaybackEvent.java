package javazoom.jl.player.advanced;

public class PlaybackEvent
{
  public static int STOPPED = 1;
  public static int STARTED = 2;
  private AdvancedPlayer source;
  private int frame;
  private int id;
  
  public PlaybackEvent(AdvancedPlayer paramAdvancedPlayer, int paramInt1, int paramInt2)
  {
    this.id = paramInt1;
    this.source = paramAdvancedPlayer;
    this.frame = paramInt2;
  }
  
  public int getId()
  {
    return this.id;
  }
  
  public void setId(int paramInt)
  {
    this.id = paramInt;
  }
  
  public int getFrame()
  {
    return this.frame;
  }
  
  public void setFrame(int paramInt)
  {
    this.frame = paramInt;
  }
  
  public AdvancedPlayer getSource()
  {
    return this.source;
  }
  
  public void setSource(AdvancedPlayer paramAdvancedPlayer)
  {
    this.source = paramAdvancedPlayer;
  }
}


/* Location:              F:\Java\jl1.0.1.jar!\javazoom\jl\player\advanced\PlaybackEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */