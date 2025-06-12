package aggregation;

public class Cars {
	String model;
	double price;
	Engines eng;
	Cars(String model,double price,Engines eng)
	{
		this.model=model;
		this.price=price;
		this.eng=eng;
		
	}
public void display()
{
 System.out.println("MODEL :"+model);
 System.out.println("PRICE :"+price);
 System.out.println(eng.getDetails());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Engines e=new Engines("TURBO",300);
		Cars c=new Cars("charger",60000000,e);
		c.display();

	}

}
