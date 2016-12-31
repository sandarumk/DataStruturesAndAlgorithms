package Algorithms.SortingAlgorithms;

/**
 * Created by dinu on 1/1/17.
 */
public class MergeSort {

    public void mergesort(int[] array){
        mergesort(array,new int[array.length],0,array.length-1);
    }

    public void mergesort(int[] array, int[] temp, int start, int end){
        if(start >= end){
            return;
        }
        int middle = (start+end)/2;
        mergesort(array,temp,start,middle);
        mergesort(array,temp,middle+1,end);
        merge(array,temp,start,end);
    }

    private void merge(int[] array, int[] temp, int start, int end) {
        int leftEnd = (start + end) / 2;
        int rightStart = leftEnd + 1;
        int size = start - end + 1;

        int leftIndex = start;
        int rightIndex = rightStart;

        int index = start;

        while (leftIndex <= leftEnd && rightIndex <= end) {
            if (array[leftIndex] <= array[rightIndex]) {
                temp[index] = array[leftIndex];
                index++;
                leftIndex++;
            } else {
                temp[index] = array[rightIndex];
                index++;
                rightIndex++;

            }
        }
        System.arraycopy(array, leftIndex, temp, index, leftEnd - leftIndex + 1);
        System.arraycopy(array, leftIndex, temp, index, end - rightIndex + 1);
        System.arraycopy(array, start, temp, end, size);
    }


}
