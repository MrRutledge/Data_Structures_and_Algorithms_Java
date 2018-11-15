package al.BinarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println(Binary_Search(new int[] {1,2,3,4,5}, 3));
		System.out.println(recursiveBinarySearch(new int[] {1,2,3,4,5,6,7,8,9}, 1,9,8));
	}
	public static int Binary_Search(int a[], int x) {
		int p = 0;
		int r = a.length -1;
		
		while (p <= r) {
			 int q = (p+r)/2;
			 if( x < a[q]) r =q-1;
			 else if(x > a[q]) p = q+1;
			 else return q;
		}
		return -1;
	}
	
	public static int recursiveBinarySearch(int a[], int p, int r, int x) {
	     int m;
	     //p = 0;
	     //r = a.length - 1;
	     if(p > r) { return -1;}
	       else { m = (p+r)/2;
	    	if(a[m] == x) return m;
	    	 else if(a[m] > x) {
	    	  System.out.println("index:   "+x);
	    		return recursiveBinarySearch(a, p, m-1, x);
	        }else{
	    	   return recursiveBinarySearch(a, m+1, r, x);
	         }
	    }
}}
