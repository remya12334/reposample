package inheritance;

public class Teacher extends Person {
	String subject;
	Teacher(String name,int age,String subject)
	{
		super(name,age);
		this.subject=subject;
		
	}
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("SUBJECT :"+subject);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person p=new Person("mithra",5);
p.displayInfo();
Student s=new Student("mythily",13,'A');
s.displayInfo();
Teacher t=new Teacher("remya",30,"MATHEMATICS");
t.displayInfo();

	}

}
