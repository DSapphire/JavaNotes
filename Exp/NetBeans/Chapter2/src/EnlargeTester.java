public class EnlargeTester {
    public static void main(String args[])
    {
          Circle c1 = new Circle();
          c1.radius = 50;
          Circle c2 = new Circle();
          c2.radius = 10;
          System.out.println("Circle 1 ���ܳ�: " + c1.circumference());
          System.out.println("Circle 2 ���ܳ�: " + c2.circumference());
          c2.enlarge(4);
          System.out.println("Circle 2 �������ܳ�: " + c2.circumference());
    }
}
