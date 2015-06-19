import java.util.StringTokenizer;
public class Token
{
    public static void main(String [ ] args)	{
           String s = "3.6 * 2.5 + (-1.5) - 6";

           // Every delimiter is also recognized as a token
            StringTokenizer st = new StringTokenizer(s, "+-*/)(",true);

           // print tokens
           while (st.hasMoreTokens())
          System.out.println(st.nextToken());
        }
}
