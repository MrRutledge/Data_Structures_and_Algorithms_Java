package ds.queue;

public class App {
	public static void main(String[] args) {
		
		Queue myQueue = new Queue(5);
		myQueue.insert(4);
		myQueue.insert(5);
		myQueue.insert(8);
//		myQueue.insert(99);
//		myQueue.insert(8);
		myQueue.view();
	}

}
