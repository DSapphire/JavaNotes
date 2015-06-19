/*
 * BindingTester.java
 *
 * Created on 2005��8��14��, ����2:08
 */

package binding;

/**
 *
 * @author  Bluewater
 */
public class BindingTester{ 
  public static void main(String[] args) { 
    Shape[] s = new Shape[9]; 
    int n;
    for(int i = 0; i < s.length; i++) 
      { n = (int)(Math.random() * 3);
        switch(n) 
          {  
            case 0: s[i] =  new Circle(); break;
            case 1: s[i] =  new Square(); break;
            case 2: s[i] =  new Triangle();
          } 
      }      
   for(int i = 0; i < s.length; i++) s[i].draw(); 
  }
}

