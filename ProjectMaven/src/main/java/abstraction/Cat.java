package abstraction;

public class Cat extends Animal {
Cat(String animalName)
{
	super(animalName);
}

public void makeSound()
{
	System.out.println("MEOWS");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog("DOG");
		d.displayInfo();
		d.makeSound();
		
		Cat c=new Cat("CAT");
		c.displayInfo();
		c.makeSound();

	}

}
