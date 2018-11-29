package ds.Array;

public class array {
	//Array declaration
    static int  array[] = {16,6,6,6,7,7,3,4,5,5};
    
    //Another way to declare arrays
     static int[] array2 = new int[5];
    
    public static void main(String[] args) {
    	
    	for(int i =0; i < array.length; i++)
    	System.out.println(array[i]);
    	
    	for(int k =0; k < array2.length; k++) {
    		array2[k] = (int)(Math.random()*20+11);
    	
        	System.out.println(array2[k]);
        	}
    }
   
}
