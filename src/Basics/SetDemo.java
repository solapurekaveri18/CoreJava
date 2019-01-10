package Basics;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>(); 
		
		set.add("BMW");
		set.add("Honda");
		set.add("BMW");
		set.add("Audi");
		
		// HashSet - Does not maintain order

		System.out.println("Hashset");
		for(String item:set){
			System.out.println(item);
		}

		// LinkedHashSet - It maintains the order in which the elements are added

		Set<String> lHSet= new LinkedHashSet<String>();
		lHSet.add("BMW");
		lHSet.add("Honda");
		lHSet.add("BMW");
		lHSet.add("Audi");

		System.out.println("LinkedHashset");
		for(String item:lHSet){
			System.out.println(item);
		}
		
		// TreeSet - IT maintains the natural sorting 1, 2, 3... alphabetical
		
		Set<String> tSet= new TreeSet<String>();
		tSet.add("BMW");
		tSet.add("Honda");
		tSet.add("BMW");
		tSet.add("Audi");

		System.out.println("TreeSet");
		for(String item:tSet){
			System.out.println(item);
		}
		
	}

}
