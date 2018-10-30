/**
 * 
 */
package adt;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @author Shaki
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter myCounter = new Counter("myCounter");
		myCounter.increment();
		myCounter.increment();
		myCounter.increment();
		myCounter.increment();
		myCounter.increment();
		myCounter.increment();
		
		System.out.println(myCounter.getCurrentValue());
		System.out.println(myCounter.toString());
		
		LinkedList myList = new LinkedList();
		
		Stack mylist1 = new Stack();

	}

}
