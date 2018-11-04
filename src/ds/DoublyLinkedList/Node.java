package ds.DoublyLinkedList;

public class Node {
	public int data; //data field
	public Node next; // next field
	public Node previous; // previous field 
	
	/** Method for displaying the list.  */
	public void displayNode(){
		System.out.println("{ "+data+" }");
	}

}
