package polymorphism;

public class Cat extends Animal{
	public void makeSound()
	{
		System.out.println("cat meows");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal a;
a=new Dog();
a.makeSound();
a=new Cat();
a.makeSound();
	}

}
