class Line   //line segment
{
   private Point  p1,p2;     // extreme points
   Line(Point a, Point b)      // constructor
   {  p1 = new Point(a.GetX(),a.GetY());
      // �Կ��Ǵ˴�Ϊ�β�ʹ��p1=a;
      p2 = new Point(b.GetX(),b.GetY());
      // �Կ��Ǵ˴�Ϊ�β�ʹ�� p2=b;
    }
    public double Length() {
    return Math.sqrt(Math.pow(p2.GetX()-p1.GetX(),2)
                   + Math.pow(p2.GetY()-p1.GetY(),2));
      }
}
