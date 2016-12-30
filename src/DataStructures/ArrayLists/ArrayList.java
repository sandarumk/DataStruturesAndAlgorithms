package DataStructures.ArrayLists;

/**
 * Array list is a resizable array
 * Initial size : 1000
 * We take it doubles when size is increasing
 * Created by dinu on 12/30/16.
 */
public class ArrayList {
    private int[] arrayList;
    private int size;
    private int capacity;

    public ArrayList(){
        capacity = 1000;
        size = 0;
        arrayList = new int[capacity];
    }

    public void insert(int data){
        ensureCapacity();
        arrayList[size] = data;
        size++;
    }

    public void ensureCapacity(){
        if(size == capacity){
            capacity = capacity*2;
            int[] newList = new int[capacity];
            java.lang.System.arraycopy(arrayList,0,newList,0,size);
            arrayList = newList;
        }
    }

    public int get(int index){
        if(index >=size){
            throw new IllegalStateException();
        }
        return arrayList[index];

    }

    public boolean isEmpty(){
        return size==0;

    }

    public int size(){
        return size;
    }

}
