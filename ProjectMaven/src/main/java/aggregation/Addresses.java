package aggregation;

public class Addresses {

	
Students  s;
String city;
String place;
Addresses(Students s,String city,String place)
{
	this.city=city;
	this.place=place;
	this.s=s;
}

public void displayDetails()
{
	s.displayDetails();
	System.out.println("city is "+city);
	System.out.println("place is "+place);
	
}
public static void main(String[] args) {
	Students s=new Students("remya",10);  
Addresses ad=new Addresses(s,"tvm","kerala");
ad.displayDetails();
}

}
