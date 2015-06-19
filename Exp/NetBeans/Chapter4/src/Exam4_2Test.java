public class Exam4_2Test {
  public static void main(String args[]){
    Employee li = new Employee();
    li.name = "Li Ming";
    li.employeeNumber = 123456;
    System.out.println(li.getName());
    System.out.println(li.getEmployeeNumber());

    Manager he = new Manager();
    he.name = "He Xia";
    he.employeeNumber = 543469;
    he.responsibilities = "Internet project";
    System.out.println(he.getName());
    System.out.println(he.getEmployeeNumber());
    System.out.println(he.getResponsibilities());
  }
}
