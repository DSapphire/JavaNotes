import java.util.*;
public class CompType implements Comparable{
        //实现Comparable接口，自定义compareTo方法
        int i;
        int j;
        public CompType(int n1, int n2) {
            i = n1;
            j = n2;
        }
        public String toString() {
            return "[i = " + i + ", j = " + j + "]";
        }
        public int compareTo(Object rv) {
            int rvi = ((CompType)rv).i;
            return (i < rvi ? -1 : (i == rvi ? 0 : 1));
        }
        public static void main(String[] args) {
              CompType[] a = { new CompType(1,2),
              new CompType(2,1),new CompType(-5,6),
              new CompType(21,4),new CompType(-6,3),
              new CompType(12,45),new CompType(43,1),
              new CompType(-76,5),new CompType(44,33),
              new CompType(22,11)};
              Arrays.sort(a);
        }
      }
