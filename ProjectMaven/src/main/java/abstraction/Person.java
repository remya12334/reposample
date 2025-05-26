package abstraction;

public abstract class Person {

	protected String personName;
	Person(String name)
	{
		this.personName=name;
	}
	public abstract void showIncome();
	public void printDetails()
	{
		System.out.println(" name is "+personName);
	}
}
