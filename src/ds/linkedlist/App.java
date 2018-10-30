package ds.linkedlist;

//import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node nodeA = new Node();
		nodeA.data = 4;
		Node nodeB = new Node();
		nodeB.data = 6;
		Node nodeC = new Node();
		nodeC.data = 9;
		Node nodeD = new Node();
		nodeD.data = 7;
		
		nodeA.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = nodeD;
		System.out.println(listLength(nodeA));//4
		System.out.println(listLength(nodeB));//6
		System.out.println(listLength(nodeB));
	}
	 public static int listLength(Node aNode){
		 int length = 0;
		 Node currentNode = aNode;
		 
		 while(currentNode != null){
			 length++;
			 currentNode = currentNode.next;
		 }
		 return length;
		 //ArrayList list = new ArrayList();
	 }

}
