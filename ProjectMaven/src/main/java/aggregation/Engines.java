package aggregation;

public class Engines {
	String type;
	int power;
	Engines(String type,int power)
	{
		this.type=type;
		this.power=power;
	}
public String getDetails()
{
	return "engine type  :"+type+" Power "+power+"hp";
}
}
