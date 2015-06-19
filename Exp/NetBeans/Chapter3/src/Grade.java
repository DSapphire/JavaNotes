public class Grade {
    public static char gradeLevel(double g)
    {
        int n = (int)Math.floor(g/10);
        switch (n)
        {
        case 10:
        case 9 : return('A');
        case 8 : return('B');
        case 7 : return('C');
        case 6 : return('D');
        default: return('E');
        }
    }
    public static void main(String[] args)
    {
        System.out.println("gradeLevel(100)="+gradeLevel(100));
        System.out.println("gradeLevel(95.5)="+gradeLevel(95.5));
        System.out.println("gradeLevel(88)="+gradeLevel(88));
        System.out.println("gradeLevel(72)="+gradeLevel(72));
        System.out.println("gradeLevel(68.5)="+gradeLevel(68.5));
        System.out.println("gradeLevel(60)="+gradeLevel(60));
        System.out.println("gradeLevel(59.5)="+gradeLevel(59.5));
        System.out.println("gradeLevel(35)="+gradeLevel(35));
    }
}
