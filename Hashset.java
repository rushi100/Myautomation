package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hash {

	public static void main(String[] args) {
		
		HashSet h = new HashSet();
		System.out.println(h.isEmpty());  //true
		System.out.println(h.size());
		
		System.out.println("Before Printing");
		System.out.println(" ");
		System.out.println("After Printing");
		
		h.add("Rishabh");
		h.add(1000);
		h.add('A');
		//h.add(null);   //hashSet does not Read Null value
		h.add(true);
		h.add("Agarkar");
		h.add(1000);       // in hashset Duplicate value are not allowed 
		
		System.out.println(h);
		System.out.println(h.contains('B'));  //false
		
		Iterator  i= h.iterator();
		System.out.println("---reading using itarator");
		while(i.hasNext()) {
			
			String firstVal = i.next().toString();
			System.out.println(firstVal);
		}
		

	}

}
