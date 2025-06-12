package inheritance;

public class Birds extends Animals{

	int speed;
	Birds(String name,int age,int speed)
	{
		super(name,age);
		this.speed=speed;
		
	}
	
	public void displaydetails()
	{ 
		System.out.println("Speed  :"+speed);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Birds b=new Birds("parrot",2,20);
b.displaydetails();
b.display();
	}

}
