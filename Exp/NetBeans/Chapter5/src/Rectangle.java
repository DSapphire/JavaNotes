class Rectangle implements Shape2D{
  int width,height;
  public Rectangle(int w,int h)  //构造方法
  {
    width=w;
    height=h;
  }
  public double area(){
    return (width * height);
  }
}
