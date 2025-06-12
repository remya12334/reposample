package aggregation;

public class Department {
	String dptName;
	int fNum;
	
	Department(String dptName,int fNum)
	{
		this.dptName=dptName;
		this.fNum=fNum;
	}
public String getDetails()
{
	return  "DEPARTMENT  :"+dptName+"   "+ "FLOOR NUMBER  :"+fNum;
}
}
