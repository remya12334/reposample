package abstraction;

public class Dog extends Animal {

	Dog(String animalName)
	{
	super(animalName);
	}
	public void makeSound()
	{
		System.out.println("BARKS");
	}
}
