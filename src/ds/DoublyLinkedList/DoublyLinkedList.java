package ds.DoublyLinkedList;

public class DoublyLinkedList {
	private Node first; // the first Node field
	private Node last; // the last Node field
	
	// The Class constructor initiating both fields with null values
	public DoublyLinkedList() {
		this.first = null;
		this.last = null;
	}
	//checking whether the list is empty
	public boolean isEmpty(){
		return first == null;
	}

	/** Method to insert the first Item in the list and has no return */
	public void insertFirst(int data){  
		Node newNode = new Node(); 
		newNode.data = data; 

		if(isEmpty()) { 
			last = newNode;
		}else {
			first.previous = newNode;
		}
		newNode.next = first; // this node points to the first
		this.first = newNode;// the first Node is created depending on the logic that played out throughout this method
	}

	/**This method is used to Insert a node at the end of the list
	 * it too has no return and takes data as the argument
	 */
	public  void insertLast(int data) {
		Node newNode = new Node(); // Creating a new node
		newNode.data = data; //associating that node to the data
		
		if(isEmpty()) { //here too checking whether the list is empty first
			last = newNode;
		}else {
			last.next = newNode;//Here we are saying that whatever was the last node in the list, it's reference for next should point to the Created node
			newNode.previous = last; // here were saying that the newly created node's previous reference should point to the last field 
		}
		last = newNode; // declaring that the New node is the last node if all the logic passes
	}

	/** In order to delete anything from the list we have to assume the list is not empty*/
    public Node deleteFirst() {
    	Node temp = first;
    	if(first.next == null) {//assuming there is only one node on the list
    		last = null;
        }else { // if we have more than one item in the list 
        	first.next.previous = null;
        	}
    	first = first.next; // were assigning the reference to the first filed in the linked list statement
         return temp; 
      }
    /** again I am assuming the linked list has more than zero items in the list */
    public Node deleteLast() {
    	Node temp = last;
    	if(first.next == null) {
    		first = null;
    	}else { 
    		last.previous.next = null; 
    	}
    	last = last.previous; 
    	return temp;
    }
    
    /** Assuming there in more than one node. */
    public boolean insertAfter(int key, int data) {
    	Node current = first; 
    	while(current.data != key) {
    		current = current.next;
    		if(current == null) {
    			return false;
    		}
    	}
    	Node newNode = new Node();
    	newNode.data = data;
    	
    	if(current == last) {
    		current.next  = null;
    		last = newNode;
    	}else {
    		newNode.next = current.next; 
    	    current.next.previous = newNode; 
    	}
    	
    	newNode.previous = current;
    	current.next = newNode;
        return true;
	}
	
	/** This method is used to delete data using a key 
	 * it takes one argument key which is an Integer
	 * it traverses through the whole list from the beginning to end to locate the key
	 * once it reaches the end without a key it stops and returns null
	 */
    
    //Assuming there is more than one node. deleting a node before a certain node 
    public Node deleteKey(int key) {
    	Node current  = first; 
    	while(current.data != key) {
    		current = current.next;
    		if(current == null) { 
    			return null;
    		}
    	}
    	//Node newNode = new Node();// new instance of the node created
    	//newNode.data = data; // the instance assigned data
    	
    	if(current == first) {
    		first = current.next;
    	}else {
    		current.previous.next = current.next;
    	}
    	if(current ==last) {
    		last = current.previous;
    	}else {
    		current.next.previous = current.previous;
    	}
    	
    	return current;
    }
	/** Method for displaying results from first to the last */
   public void displayForward() {
	   System.out.println("first --> last: ");
	   Node current = first;// we start from the beginning 
	   while(current != null) {
		   current.displayNode(); 
	       current = current.next; 
	   }
	   System.out.println();
   }
   /**Method to traverse the list and display results from the last one to the first one */
   public void displayBackward() {
	   System.out.println("last --> first: ");
	   Node current = last;
	   while(current != null) {
		   current.displayNode(); 
	       current = current.previous; 
	   }
	   System.out.println();
   }
}
