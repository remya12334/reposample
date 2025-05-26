package interfacepgm;

public class Cat implements Animal {
	
	public void makesound()
	{
		System.out.println("meow meow");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cat c=new Cat();
c.makesound();
Dog d=new Dog();
d.makesound();

	}

}
