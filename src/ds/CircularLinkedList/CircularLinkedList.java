package ds.CircularLinkedList;

public class CircularLinkedList {
	private Node first;
	private Node last;

	public CircularLinkedList(){
		
		first = null;
		last = null;	
	}
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return first == null;
	}
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			last = newNode;
		}
		newNode.next = first;
		first = newNode;
	}
   public void insertLast(int data) {
	   Node newNode = new Node();
	   newNode.data = data;
	   
	   if(isEmpty()) {
		   first = newNode;
	   } else {
		   last.next = newNode;// the last value of the node will point to the new node 
		   last = newNode; // we make the new node we created to be the last one 
	   }
 }
   public int deleteFirst() {
	   int temp = first.data;
	   
	   if(first.next == null) {
		   last = null;
	   }
   first = first.next; //first will point to the next to be come the new first
   return temp;
   }
   
   public void displayList() {
	   System.out.println("List(first---->last)");
	   Node current = first;
	   
	   while(current != null) {
		   current.displayNode();
		   current = current.next;
	   }
	   System.out.println("");
   }
   
}
