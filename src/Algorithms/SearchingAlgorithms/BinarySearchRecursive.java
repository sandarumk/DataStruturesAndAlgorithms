package Algorithms.SearchingAlgorithms;

/**
 * Created by dinu on 1/1/17.
 */
public class BinarySearchRecursive {

    public int binarysearch(int[] array, int key){
        return binarysearch(array,key,0,array.length-1);
    }

    public int binarysearch(int[] array, int key, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if(array[mid]==key){
            return mid;
        }else if(array[mid] > key){
            return binarysearch(array,key,start,mid);
        }else{
            return binarysearch(array,key,mid+1,end);
        }
    }
}
