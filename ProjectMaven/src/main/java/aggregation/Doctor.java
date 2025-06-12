package aggregation;

public class Doctor {
	
	String name;
	String special;
	Department d;
	Doctor(String name,String special,Department d)
	{
		this.name=name;
		this.special=special;
		this.d=d;
	}
	
	public void display()
	{
		System.out.println("NAME :"+name);
		System.out.println("SPECIALITY :"+special);
		System.out.println(d.getDetails());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department dep=new Department("ENT",5);
	
		Doctor doc=new Doctor("Remya","Ent",dep);
		
		doc.display();

	}

}
