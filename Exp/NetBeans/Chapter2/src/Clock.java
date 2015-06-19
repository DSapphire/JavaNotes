public class  Clock
{  // 成员变量
    int hour ;
    int minute ;
    int second ;

   // 成员方法
   public void setTime(int newH, int newM, int newS)
   {  hour=newH ;
      minute=newM ;
      second=newS ;
   }
   public void showTime()
   { System.out.println(hour+":"+minute+":"+second);
   }
}
