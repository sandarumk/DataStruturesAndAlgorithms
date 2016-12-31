package Algorithms.SortingAlgorithms;

/**
 * Created by dinu on 12/31/16.
 */
public class QuickSort {

    public int[] quicksort(int[] array, int start, int end){
        if(start >= end){
            return array;
        }
        int pivot = array[(start+end)/2];
        int index = partition(array,start,end,pivot);
        array = quicksort(array,start,index-1);
        array = quicksort(array, index, end);
        return array;
    }

    private int partition(int[] array, int start, int end, int pivot) {
        while(start <= end){
            while(array[start] < pivot){
                start++;
            }
            while(array[end] > pivot){
                end --;
            }
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return start;
    }
}
