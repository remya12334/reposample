package aggregation;

public class AddressEg {
	String city;
	String state;
AddressEg(String city,String state)
{
	this.city=city;
	this.state=state;
}
public void display()
{
	System.out.println("city"+city);
	System.out.println("state"+state);
}
}
