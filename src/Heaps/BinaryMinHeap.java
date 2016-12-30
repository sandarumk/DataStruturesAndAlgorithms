package Heaps;

/**
 * Heap implementation using an array
 * The logic is if we take a certain index, the parent if that element is (index-2)/2
 * the left child (index*2)+1
 * the right child (index*2)+2
 * Created by dinu on 12/30/16.
 */
public class BinaryMinHeap {
    int size;
    int heapLimit;
    int[] heap;

    /**
     * Constructor taking the initial heap size to 100
     */
    public BinaryMinHeap(){
        size = 0;
        heapLimit = 100;
        heap = new int[heapLimit];
    }

    //Heap helper methods
    public int getParentIndex(int index){
        return (index - 1)/2;
    }
    public int getLeftChildindex(int index){
        return (2*index) +1 ;
    }
    public int getRightChildIndex(int index){
        return (2*index) +2 ;
    }

    public int getParentValue(int index){
        return heap[getParentIndex(index)];
    }
    public int getLeftChildValue(int index){
        return heap[getLeftChildindex(index)];
    }
    public int getRightChildValue(int index){
        return heap[getRightChildIndex(index)];
    }

    public boolean hasParent(int index){
        return getParentIndex(index) >= 0;
    }

    public boolean hasLeftChild(int index){
        return getLeftChildindex(index) < size;
    }

    public boolean hasRightChild(int index){
        return getRightChildIndex(index) < size;
    }

    public void ensureCapacity(){
        if (size == heapLimit ){
            heapLimit = heapLimit*2;
            int[] newHeap = new int[heapLimit];
            java.lang.System.arraycopy(heap,0,newHeap,0,heapLimit);
            heap = newHeap;
        }
    }

    public int peek(){
        if(size == 0) throw new IllegalStateException();
        return heap[0];
    }
    public void insert(int data){
        ensureCapacity();
        heap[size] = data;
        size++;
        heapifyUp();
    }

    public int deleteMin(){
        if(size == 0) throw new IllegalStateException();
        int value = heap[0];
        heap[0] = heap[size-1];
        size--;
        heapifyDown();
        return value;
    }

    public void heapifyUp(){
        int iterator = size -1;
        while(hasParent(iterator) && getParentValue(iterator) < heap[iterator]){
                int parent = getParentIndex(iterator);
                swap(parent,iterator);
                iterator = parent;
        }

    }

    public void heapifyDown(){
        int iterator = 0;
        while(hasLeftChild(iterator)){
            if(hasRightChild(iterator) && getLeftChildValue(iterator) > getRightChildValue(iterator)){
                if(getRightChildValue(iterator) < heap[iterator] ){
                    int child = getRightChildIndex(iterator);
                    swap(iterator,child);
                    iterator = child;
                }else{
                    break;
                }

            }else{
                if(getLeftChildValue(iterator) < heap[iterator]){
                    int child = getLeftChildindex(iterator);
                    swap(child,iterator);
                    iterator = child;
                }else{
                    break;
                }

            }
        }


    }

    public void swap(int first, int second){
        int tmp = heap[first];
        heap[first] = heap[second];
        heap[second] = tmp;

    }

}


