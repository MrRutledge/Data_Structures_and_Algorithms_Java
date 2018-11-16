package al.RecursiveLinearSearch;

public class App {

	public static void main(String[] args) {
		System.out.println(recursiveLinearSearch(new int[] {4,48,4,28,34,76,9},0,34));
	}
	/** The method takes three arguments one for the array another one for the searched index and the last one for its position
	 * */
	public static int recursiveLinearSearch(int a[], int i, int x) {
		
		if(i >a.length-1) { // traversing through the array
			return -1; // if negative one is returned that means we didn't find the x in the given array
		}else if(a[i]==x)// if we find the index is equal to the searched index 
		 {
			return i;	
		}else {
			System.out.println("index:   "+i);
			return recursiveLinearSearch(a, i+1, x); }
	}
	
}
