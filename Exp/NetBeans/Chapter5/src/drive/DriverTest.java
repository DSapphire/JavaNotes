package drive;

public class DriverTest
{
        static public void main(String [ ] args)
        {
          Driver a = new FemaleDriver( );
          Driver b = new MaleDriver( );
          Vehicle x = new Car( );
          Vehicle y = new Bus( );
          a.drives(x);
          b.drives(y);
        }
}
