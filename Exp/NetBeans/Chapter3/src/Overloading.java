public class Overloading
{
   public static void main(String[] args)
   {
      for(int i = 0; i < 5; i++)
      {
          Tree t = new Tree();
          t.setHeight(i);
          t.info();
          t.info("overloaded method");
       }
    }
}
