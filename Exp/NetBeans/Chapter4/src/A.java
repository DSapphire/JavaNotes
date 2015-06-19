public class A extends B
{
public int d;
public void tryVariables()
{
  System.out.println(a);             //允许
 // System.out.println(b);             //不允许
  System.out.println(getB());        //允许
  System.out.println(c);             //允许
}
}
