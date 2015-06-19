package drive;

public abstract class Vehicle
{
        private String type;
        public Vehicle( ) { }
        public Vehicle(String s)
        { type = s; }
        public abstract void drivedByFemaleDriver(Driver who);
        public abstract void drivedByMaleDriver(Driver who);
}
