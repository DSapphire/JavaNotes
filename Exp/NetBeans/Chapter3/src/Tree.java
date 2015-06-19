import java.util.*;
class Tree
{  int height;
   void setHeight(int h) {  height=h; }
   void info()
   { prt("Tree is " + height + " feet tall"); }
   void info(String s)
   { prt(s + ": Tree is " + height + " feet tall"); }
    static void prt(String s)
   { System.out.println(s); }
}
