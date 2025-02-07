//Lab 2 MergeSort 
//Name: Sepideh Heidari Ahwazi 
//Description: Merge Sort recursively divides the array into two halves. 
//it keeps splitting until the subarrays have one element. Then it merges the 
//sorted subarrays back together to form a fully sorted array. then reapeats procces.

public class MergeSort {
    //method 
    public static void mergesort(int[] array){
        //base case for array size 
        if( array.length < 2){
            return;
        }
        //finding the middle of the array 
        int mid = array.length / 2;

        //making the two subarrays
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        //copying the elemnets to the left and right subarrays
        for(int i = 0; i < mid; i++){
            left[i] = array[i];
        }
        for(int i = mid; i < array.length; i++){
            right[i - mid] = array[i];
        }
        //recursivily sort the subarrays
        mergesort(left);
        mergesort(right);
        //merge the subarrays to the origial array 
        merge(array, left, right);
    }
    //method to merge 
    private static void merge(int[] array, int[] left, int[] right){
        //idx left array 
        int i = 0;
        //idx right array 
        int j = 0;
        //idx org array
        int s = 0;

        //merge  two arrays while both have elemets within 
        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                array[s++] = left[i++];
            }
            else{
                array[s++] = right[j++];
            }
        }
        //copying elements 
        while(i < left.length){
            array[s++] = left[i++];
        }
        while(j < right.length){
            array[s++] = right[j++];
        }
    }

    //TETSING IF CODE WORKS
    /*
    public static void main(String[] args) {
        int[] array = {9, 7, 5, 11, 12, 2, 14, 3, 10, 6};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Call mergeSort to sort the array
        mergesort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }*/
}
