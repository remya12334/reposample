package aggregation;

public class Student1 {
	String name;
	Pen pen;
	Student1(String name,Pen pen)
	{
		this.name=name;
		this.pen=pen;
		
	}
public void showStudentDetails()
{
	System.out.println("STUDENT NAME "+name);
	pen.showPenDetails();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen p=new Pen("parker");
     Student1 s=new Student1("remya",p);
       s.showStudentDetails();
	}

}
