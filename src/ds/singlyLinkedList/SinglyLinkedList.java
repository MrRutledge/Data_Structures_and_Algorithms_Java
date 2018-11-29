package ds.SinglyLinkedList;

public class SinglyLinkedList {
	private Node first;
	
	public SinglyLinkedList(){
		
	}
	/**Checks whether the list is empty or not**/
    public boolean isEmpty(){
    	return (first == null);
    	
    }
    /** used to insert at the beginning of the class*/
    public void insertFirst(int data){
    	Node newNode = new Node();
    	newNode.data = data;
    	newNode.next = first;
    	first = newNode;
    }
    /** To delete the first node in the list */
    public Node deleteFirst(){
    	Node temp = first;
    	first= first.next;
    	return temp;
    }
    
    /**
     To display the data in the linked list**/
    public void displayList(){
    	System.out.println("List (first--> last) ");
    	Node current = first;
    	while(current != null){
    		current.displayNode();
    		current = current.next;
    	}
    	System.out.println("");
    }
    /*
     * Appending a node at the end of the Lists**/
    public void insertLast(int data){
    	Node current = first;
    	while(current.next != null){
    		current = current.next; // we'll loop till we get to null
    	}
    	Node newNode = new Node();
    	newNode.data = data;
    	current.next = newNode;
    }
}
