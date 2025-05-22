package collections;

import java.util.ArrayList;
import java.util.List;

public class GenericEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//list methods
		List<String> fruits=new ArrayList<String>(); 
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("grapes");
		fruits.add("cherry");
		fruits.add("kiwi");
		System.out.println(fruits);
		System.out.println(fruits.get(2)); //get
		fruits.set(0, "mango");  //set
		System.out.println(fruits);
		fruits.add("berry");
		System.out.println(fruits);
		fruits.set(1, "berry");
		System.out.println(fruits);//repeated item
		System.out.println(fruits.indexOf("berry"));
		System.out.println(fruits.lastIndexOf("berry"));
		fruits.remove(5); //remove last
		System.out.println(fruits);
		System.out.println(fruits.contains("strawberry"));// ans is false
		System.out.println(fruits.isEmpty());
		
		System.out.println(fruits.size());
			
		}

	}


