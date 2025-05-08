package inheritance;

public class Cat extends Animal{         //child class

	void sound2()
	{
	System.out.println("meow meow");	
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat obj=new Cat();
		obj.sound1();
		obj.sound2();

	}

}
