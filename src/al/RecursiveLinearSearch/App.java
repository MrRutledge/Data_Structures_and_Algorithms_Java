package al.RecursiveLinearSearch;

public class App {

	public static void main(String[] args) {
		System.out.println(recursiveLinearSearch(new int[] {4,48,4,28,34,76,9},0,34));
	}
	
	public static int recursiveLinearSearch(int a[], int i, int x) {
		
		if(i >a.length-1) {
			return -1;
		}else if(a[i]==x)
		 {
			return i;	
		}else {
			System.out.println("index:   "+i);
			return recursiveLinearSearch(a, i+1, x); }
	}
	
}
