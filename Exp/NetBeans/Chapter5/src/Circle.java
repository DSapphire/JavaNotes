class Circle implements Shape2D,Color   // ʵ��Circle��
{
   double radius;
   String color;
   public Circle(double r)             // ���췽��
   {
      radius=r;
   }
   public double area()                  // ����area�����Ĵ���ʽ
   {
      return (pi*radius*radius);
   }
   public void setColor(String str)
   {
      color=str;
      System.out.println("color="+color);
      
   }
}
