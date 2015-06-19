public class Test{
	public static void main(String[] args) {
		Person p=new Person("Person 1");
		Student st=new Student("Student 1");
		Employee em=new Employee("Employee 1");
		Faculty f=new Faculty("Faculty 1");
		Stuff stuff=new Stuff("Stuff 1");

		System.out.println("\n"+p+"\n");
		System.out.println("\n"+st+"\n");
		System.out.println("\n"+em+"\n");
		System.out.println("\n"+f+"\n");
		System.out.println("\n"+stuff+"\n");
	}
}