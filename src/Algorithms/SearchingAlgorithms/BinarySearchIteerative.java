package Algorithms.SearchingAlgorithms;

/**
 * Created by dinu on 1/1/17.
 */
public class BinarySearchIteerative {

    public int binarysearchiterative(int[] array, int key){
        int start = 0;
        int end = array.length-1;
        while(start <= end){
            int index = start + (end-start)/2;
            if(array[index]==key){
                return index;
            }else if (key > array[index]){
                start = index+1;
            }else{
                end = index-1;
            }
        }
        return -1;

    }
}
