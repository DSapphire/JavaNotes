package javazoom.jl.player.advanced;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import javazoom.jl.decoder.JavaLayerException;

public class jlap
{
  public static void main(String[] paramArrayOfString)
  {
    jlap localjlap = new jlap();
    if (paramArrayOfString.length != 1)
    {
      localjlap.showUsage();
      System.exit(0);
    }
    else
    {
      try
      {
        localjlap.play(paramArrayOfString[0]);
      }
      catch (Exception localException)
      {
        System.err.println(localException.getMessage());
        System.exit(0);
      }
    }
  }
  
  public void play(String paramString)
    throws JavaLayerException, IOException
  {
    InfoListener localInfoListener = new InfoListener();
    playMp3(new File(paramString), localInfoListener);
  }
  
  public void showUsage()
  {
    System.out.println("Usage: jla <filename>");
    System.out.println("");
    System.out.println(" e.g. : java javazoom.jl.player.advanced.jlap localfile.mp3");
  }
  
  public static AdvancedPlayer playMp3(File paramFile, PlaybackListener paramPlaybackListener)
    throws IOException, JavaLayerException
  {
    return playMp3(paramFile, 0, Integer.MAX_VALUE, paramPlaybackListener);
  }
  
  public static AdvancedPlayer playMp3(File paramFile, int paramInt1, int paramInt2, PlaybackListener paramPlaybackListener)
    throws IOException, JavaLayerException
  {
    return playMp3(new BufferedInputStream(new FileInputStream(paramFile)), paramInt1, paramInt2, paramPlaybackListener);
  }
  
  public static AdvancedPlayer playMp3(InputStream paramInputStream, final int paramInt1, final int paramInt2, PlaybackListener paramPlaybackListener)
    throws JavaLayerException
  {
    AdvancedPlayer localAdvancedPlayer = new AdvancedPlayer(paramInputStream);
    localAdvancedPlayer.setPlayBackListener(paramPlaybackListener);
    new Thread()
    {
      public void run()
      {
        try
        {
          this.val$player.play(paramInt1, paramInt2);
        }
        catch (Exception localException)
        {
          throw new RuntimeException(localException.getMessage());
        }
      }
    }.start();
    return localAdvancedPlayer;
  }
  
  public class InfoListener
    extends PlaybackListener
  {
    public InfoListener() {}
    
    public void playbackStarted(PlaybackEvent paramPlaybackEvent)
    {
      System.out.println("Play started from frame " + paramPlaybackEvent.getFrame());
    }
    
    public void playbackFinished(PlaybackEvent paramPlaybackEvent)
    {
      System.out.println("Play completed at frame " + paramPlaybackEvent.getFrame());
      System.exit(0);
    }
  }
}


/* Location:              F:\Java\jl1.0.1.jar!\javazoom\jl\player\advanced\jlap.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */