package Basics;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
       LinkedList<String> cars= new LinkedList<String>();
		
		//Adding
		cars.add("Honda");
		cars.add("BMW");
		cars.add("Audi");
		cars.add("Benz");
		
		//Size
		int size= cars.size();
		System.out.println("Size of the arraylist is " + size);
		
		//get
		System.out.println("\nIteration example to get the items");
		for (int i=0; i<size;i++){
			System.out.println("The item at index " + i + " is "  + cars.get(i));
		}
		
		System.out.println("\nFor each loop to get the items");
		for (String car:cars){
			System.out.println("The item at index " + car);
		}
		//remove
		cars.remove(size-2);
		
		for(int i=0;i<size-1; i++){
			System.out.println("\nThe item after removing at index " + i + " is "  + cars.get(i));
		}
	}

}
