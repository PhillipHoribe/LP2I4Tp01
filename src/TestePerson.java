
public class TestePerson {
	public static void main(String[] args)
	{
		
		Student student;
		Staff staff;
		
		Person p1 = new Person("Person1","Personadd");
		Student s1 = new Student("s1","s2","S",1200,1.0);
		Staff s2 = new Staff("Staff1","Staff2","Staff3",2);
		System.out.println(p1.toString());
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}
}

