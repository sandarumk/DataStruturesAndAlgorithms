package Algorithms.SortingAlgorithms;

/**
 * Created by dinu on 12/31/16.
 */
public class BubbleSort {

    public void bubbleSort(int[] array){
        boolean isSorted = false;
        int lastUnsorted = array.length -1;
        while(!isSorted){
            isSorted = true;
            for (int i = 0; i < lastUnsorted; i++) {
                if(array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = array[i];
                    isSorted = false;
                }
            }
            lastUnsorted--;
        }
    }
}
