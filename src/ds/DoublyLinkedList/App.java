package ds.DoublyLinkedList;

public class App {

	public static void main(String[] args) {
		//Creating a a list with a name of myList 
    DoublyLinkedList myList = new DoublyLinkedList();
     myList.insertFirst(56);
     myList.insertFirst(23);
     myList.insertFirst(5);
     myList.insertFirst(11);
     myList.insertFirst(76);
      myList.insertLast(58);
      myList.insertLast(67);
      myList.insertLast(7);
      myList.insertLast(12);
      myList.insertAfter(23, 13);
      myList.insertAfter(7, 1);
      myList.displayForward();
   //   myList.displayBackward();
//      myList.deleteKey(7);
//      myList.displayForward();
//      myList.displayBackward();
//      myList.isEmpty();
//      myList.deleteFirst();
//      myList.displayForward();
//      myList.displayBackward();
//      myList.deleteLast();
//      myList.displayForward();
//      myList.displayBackward();
//      myList.insertAfter(3, 59);
//      myList.displayForward();
//      myList.displayBackward();
      
	}
	}