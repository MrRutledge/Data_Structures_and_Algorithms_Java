package ds.CircularLinkedList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    CircularLinkedList myList = new CircularLinkedList();
     myList.insertFirst(56);
     myList.insertFirst(23);
     myList.insertFirst(15);
     myList.insertFirst(16);
     myList.insertLast(12);
     myList.insertFirst(53);
     myList.insertFirst(61);
     myList.insertLast(13);
     
     myList.displayList();
	}

}
