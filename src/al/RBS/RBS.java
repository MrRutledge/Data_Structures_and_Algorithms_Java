package al.RBS;

public class RBS {

    public static void main(String[] args){
        //myarray[] {1,2,4,5,6,7,8,78,87,98,23}
    System.out.println(rbs(new int[] {1,2,4,5,6,7,8,78,87,98,23},0, 9,87));

    }

    public static int rbs(int a[] , int p, int r, int x ) {
        int m;
        if (p > r) {
            return -1;
        } else m = (p + r) / 2;
        {
            if (a[m] == x) {
                return m;
            } else if (a[m] > x) {
                System.out.println("index:   "+x);
                return rbs(a, p, m - 1, x);
            }
            // else{
            //return }
        }
        return rbs(a, m+1, r, x);
    }
}

  	//else //if(a[m] > x) {
           // System.out.println("index:   "+x);
            //return recursiveBinarySearch(a, p, m-1, x);


