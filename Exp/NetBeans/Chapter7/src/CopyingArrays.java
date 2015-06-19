import java.util.*;
public class CopyingArrays {
  public static void main(String[] args) {
    int[] i = new int[25];
    int[] j = new int[25];
    Arrays.fill(i, 47);
    Arrays.fill(j, 99);
    show(i);
    show(j);
    System.arraycopy(i, 0, j, 0, i.length);
    show(i);
    show(j);
    int[] k = new int[10];
    Arrays.fill(k, 103);
    show(k);
    System.arraycopy(i, 0, k, 0, k.length);
    show(k);
    Arrays.fill(k, 103);
    System.arraycopy(k, 0, i, 0, k.length);
    Integer[] u = new Integer[10];
    Integer[] v = new Integer[5];
    Arrays.fill(u, new Integer(47));
    Arrays.fill(v, new Integer(99));
    System.out.println(Arrays.asList(u));
    System.out.println(Arrays.asList(v));
    System.arraycopy(v, 0,  u, u.length/2, v.length);
     System.out.println(Arrays.asList(u));
  }
  public static void show(int[] i){
      for(int k=0;k<i.length;k++){
          System.out.print(i[k]+" ");
      }
      System.out.println();
  }
}
