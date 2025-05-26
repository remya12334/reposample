package abstraction;

public abstract class Animal {
	
	protected String animalName;
	Animal(String animalName)
	{
		this.animalName=animalName;
	}

	public abstract void makeSound();
	public void displayInfo()
	{
		System.out.println("ANIMAL "+this.animalName);
		
	}
}
