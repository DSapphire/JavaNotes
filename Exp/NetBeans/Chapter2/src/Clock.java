public class  Clock
{  // ��Ա����
    int hour ;
    int minute ;
    int second ;

   // ��Ա����
   public void setTime(int newH, int newM, int newS)
   {  hour=newH ;
      minute=newM ;
      second=newS ;
   }
   public void showTime()
   { System.out.println(hour+":"+minute+":"+second);
   }
}
