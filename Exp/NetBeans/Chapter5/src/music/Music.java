/*
 * Music.java
 *
 * Created on 2005��8��14��, ����2:23
 */

package music;

/**
 *
 * @author  Bluewater
 */
public class Music {
  public static void tune(Instrument i) {
    // ...
    i.play(Note.MIDDLE_C);
  }
  public static void main(String[] args) {
    Wind flute = new Wind();
    tune(flute); 
  }
} 

