package encapsulation;

public class EncapsulationMain {

	private int age;
	private String name;
	
	public void set(int age,String name)
	{
		this.age=age;
		this.name=name;
		
		
		}
	public void get()
	{
		System.out.println("age "+age);
		System.out.println("name "+name);
	}
	
	
}

