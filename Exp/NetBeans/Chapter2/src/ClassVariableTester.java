public class ClassVariableTester {
    public static void main(String args[]) {
     Circle x = new Circle();
     System.out.println(x.PI);
     System.out.println(Circle.PI);
     Circle.PI = 3.14;
     System.out.println(x.PI);
     System.out.println(Circle.PI);
   }
}
