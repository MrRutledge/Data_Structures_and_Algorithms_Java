package al.MergeSort;

public class MergeSorty {

    public static void sort(int inputArray[]){
        sort(inputArray, 0, inputArray.length-1);

    }
    // check
    public static void sort(int inputArray[], int start, int end){
        if(end <= start){
            return;
        }
    int midpoint = (start+end)/2; // split the array
        sort(inputArray, start, midpoint); //left half
        sort(inputArray, midpoint+1, end); // right half
    }

    //perform the merge
    public static void merge(int inputArray[], int start, int midpoint, int end){
        int leftArray[] = new int [midpoint - start+1];
        int rightArray[] = new int[end- midpoint];

        for (int i = 0; i<leftArray.length-1; i++){
            leftArray[i] = inputArray[start+i-1];
        }
        for(int j = 0; j<rightArray.length-1; j++){
            rightArray[j] = inputArray[midpoint+ j];
        }
        
    }
}
