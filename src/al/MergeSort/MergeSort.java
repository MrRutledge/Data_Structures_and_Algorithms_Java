package al.MergeSort;

public class MergeSort {

    public static void main(String[] args){
        int inputArray = {9,7,8,3,,4,1,2,5,0,12,23};
        MergeSorty sorter = new MergeSorty();

        sorter.sort(inputArray);

        for(int i = 0; i<inputArray.length; i++){
            System.out.println(inputArray[i]);
        }

    }
}
