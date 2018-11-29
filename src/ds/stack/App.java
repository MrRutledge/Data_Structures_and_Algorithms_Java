package ds.Stack;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack theStack = new Stack(20); 
//		theStack.push(23);
//		theStack.push(33);
//		theStack.push(13);
//		theStack.push(25);
//		theStack.push(25);
//		theStack.push(25);
		
		while(!theStack.isEmpty()){
			long value= theStack.pop();
			System.out.println(value);
		}

	
		System.out.println(reverseString("HELLO TILL"));
		
	}

	public static String reverseString(String str){
		int stackSize = str.length(); // get the max size
		Stack theStack = new Stack(stackSize); // we make the stack
		for(int  j = 0; j< str.length(); j++){
			char ch = str.charAt(j); // getting a char from the input String
			theStack.push(ch);
			
		}
	
	String result = "";
	while(!theStack.isEmpty()){
		long ch = theStack.pop();
		result = result+ ch;// appending the output
	}
return result;
}
	}
