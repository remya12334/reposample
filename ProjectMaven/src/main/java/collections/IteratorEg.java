package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> fruits=new HashSet<String>();
fruits.add("apple");
fruits.add("orange");
fruits.add("mango");
System.out.println(fruits);
 Iterator<String>i=fruits.iterator();
 while(i.hasNext())
 {
	 System.out.println(i.next());
 }
 i.remove();
 System.out.println(fruits);

	}

}
