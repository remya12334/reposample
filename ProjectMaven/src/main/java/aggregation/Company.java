package aggregation;

public class Company {
	String companyName;
	String location;
	Company(String companyName,String location)
	{
		this.companyName=companyName;
		this.location=location;
	}
	public void showCompanyDetails()
	{
		System.out.println("COMPANY NAME :"+companyName);
		System.out.println("LOCATION :"+location);
	}

}
