package Basics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DiffaListlList {
	
	/***
	 * Array List - {0, 1, 2, 3, 4, 5, 6}
	 * Linked List - [0] > [1] > [2]
	 *                   <     < 
	 * Array List - When you have to add at the end and remove from the end and getting is fast
	 * Linked List - When you have add at the beginning and remove from the beginning
	 */


	public static void main(String[] args) {
		
		
		List<Integer> aList= new ArrayList<Integer>();
		List<Integer> lList= new LinkedList<Integer>();
		
		runDuration(aList, "Array List");
		runDuration(lList, "Linked List");
		

	}
	
	public static void runDuration(List<Integer> list, String ListType){
		System.out.println("\n Begining of the list " + ListType);
		
		for(int i=0;i<100000;i++){
			list.add(i);
		}
		
		int size= list.size();
		int elementToAdd= size+100000;
		
		long startTime= System.currentTimeMillis();
		

		for(int i=0;i<elementToAdd;i++){
			//list.add(i);
			list.add(0, i);
		}
				
		long endTime= System.currentTimeMillis();
		long duration= endTime-startTime;
		
		System.out.println("\n Time to process "+ duration + "ms");
		
		
	}

}
