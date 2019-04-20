package al.SSort;

public class Selsort {

    public static void main(String[] args){
        int[] myArray = Selection(new int[] {1,7,4,5,2,13,3});

        for(int i=0; i<myArray.length; i++) {
            System.out.println(myArray[i]);
        }

    }
    private  static int[] Selection(int a[]){
        //int a[];
//        for(int i = 0; i<a.length; i++) {
//            int midpoint = i;
//            for (int j =i+1; j<a.length; j++) {
//                if(a[j]< a[midpoint]) { midpoint= j;
//                }
//            }
//            int temp = a[i];
//            a[i] = a[midpoint];
//            a[midpoint] = temp;
//        }
//        return a;

        for(int i = 1; i<a.length; i++){
            int element = a[i];

            int j = i-1;
            while(j >= 0 && a[j]> element){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = element;

        }
        return a;



    }
}
