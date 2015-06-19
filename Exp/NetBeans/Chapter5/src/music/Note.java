/*
 * Note.java
 *
 * Created on 2005年8月14日, 下午2:20
 */

package music;

/**
 *
 * @author  Bluewater
 */
class Note {
  private int value;
  private Note(int val) { value = val; }
  public static final Note
    MIDDLE_C = new Note(0), 
    C_SHARP  = new Note(1),
    B_FLAT   = new Note(2);
} 

