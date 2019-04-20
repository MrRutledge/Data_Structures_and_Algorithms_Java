package al.SelectionSort;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myArray = selectionSort(new int[] {9,4,5,67,43,56,23,45,100,30});
		
		for(int i=0; i<myArray.length; i++) {
			System.out.println(myArray[i]);
		}

	}
	public static int[] selectionSort(int a[]) {
		
		for(int i = 0; i<a.length; i++) {
			int min = i;
			for (int j =i+1; j<a.length; j++) {
				if(a[j]< a[min]) { min = j;
			}		    
		} 
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
	}
		return a;

	}
}
