//Lab 2 QuickSort
//Name: Sepideh Heidari Ahwazi 
//Description: Quick Sort selects a pivot element from the array and partitions the array into two subarrays 
//one smaller than the pivot and one greater than the pivot. The algorithm repeats 
//this process until the whole array is sorted.

public class QuickSort{
    //method 
    public static void quicksort(int array[], int low, int high){
        //base case if array has more than 1 elemnt 
        if(low < high){
            //get pivot and partition array 
            int part = partition(array,low,high);
            //recursively sort both subarrays 
            quicksort(array, low, part - 1);
            quicksort(array, part + 1, high);
        }

    }
    //method for partition around the pivot
    private static int partition( int[] array, int low, int high){
        //choosing last element in the array as the pivot
        int pivot = array[high];
        //index of the smaller element 
        int l = low - 1;
        //go through the array to change postions
        for(int i = low; i < high; i++){
            //checks where element should go accoring to the pivot 
            if(array[i] <= pivot){
                
                l++;
                //swaping 
                int temp = array[l];
                array[l] = array[i];
                array[i] = temp;
            }
        }
        //placing the pivoit in the right place 
        int temp = array[l+1];
        array[l+1] = array[high];
        array[high] = temp;

        //returning the pivot position
        return l + 1;

    }

    //TEXTING IF IT WORKS
    /*public static void main(String[] args) {
        int[] arrays = {9, 7, 5, 11, 12, 2, 14, 3, 10, 6};

        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }
        System.out.println();

        // Call the quickSort method
        quicksort(arrays, 0, arrays.length - 1);

        
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }
    }*/


}