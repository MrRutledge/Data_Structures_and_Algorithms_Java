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
	public void insertFirst(int data){  // the method takes one argument of type Int
		Node newNode = new Node(); //Creating a node first 
		newNode.data = data; //associating the created Node with the data from

		if(isEmpty()) { //we check whether the List is empty before add the item 
			last = newNode; // if isEmpty method created above returns True we just turn the new NewNode into the first one
		}else {
			first.previous = newNode;//We get the pointer that was referencing from the first one into the newNode
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
    	if(first.next == null) {// if there is only one item in the list
    		first = null;
    	}else { 
    		last.previous.next = null; //the last node's previous node is equal to null
    	}
    	last = last.previous; // which ever data point that was last.previous is the new last node
    	return temp;
    }
    
    /** Assuming there in more than one node. */
    public boolean insertAfter(int key, int data) {
    	Node current = first; // start from the beginning of the list
    	while(current.data != key) {// as long as we have not found the key were looking for
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
    		newNode.next = current.next; // making sure that were inserting the new node in between the two old
    	    current.next.previous = newNode; // the opposite of the above
    	}
    	
    	newNode.previous = current;
    	current.next = newNode;// changing what we did earlier after a bit of manipulation 
        return true;
	}
	
	/** This method is used to delete data using a key 
	 * it takes one argument key which is an Integer
	 * it traverses through the whole list from the beginning to end to locate the key
	 * once it reaches the end without a key it stops and returns null
	 */
    
    //Assuming there is more than one node. deleting a node before a certain node 
    public Node deleteKey(int key) {
    	Node current  = first; // again we start from the beginning of the list 
    	while(current.data != key) {
    		current = current.next; // just keep going through the list checking the keys
    		if(current == null) {// if you reach the end of the list without find the data 
    			return null;
    		}// from here we know the data were looking for is not in the list hence no need to traverse any more
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
		   current.displayNode(); //we call the display method from the Node class
	       current = current.next; // move sequentially towards the last item
	   }
	   System.out.println();
   }
   /**Method to traverse the list and display results from the last one to the first one */
   public void displayBackward() {
	   System.out.println("last --> first: ");
	   Node current = last;// we start from the beginning 
	   while(current != null) {
		   current.displayNode(); //we call the display method from the Node class
	       current = current.previous; // move sequentially towards the last item
	   }
	   System.out.println();
   }
}
