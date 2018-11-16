package ds.LinearSearchAlgorithm;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//static because its an instance class  so that we dont have to create an instance of the class app everytime we run
   public static int LinearSearch(int [] a, int x) {
	       for (int i = 0; i <a.length; i++) {
	    	   if(a[i]==x) {
	    		   return i;
	    	   }
	       }
	       return -1;
}

}
