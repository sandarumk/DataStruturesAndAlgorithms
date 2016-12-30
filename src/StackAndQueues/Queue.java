package StackAndQueues;

import java.util.EmptyStackException;

/**
 * Created by dinu on 12/30/16.
 */
public class Queue {
    QueueNode first;
    QueueNode last;

    /**
     * Add to tail
     * @param data
     */
    public void enqueue(int data){
        if(first == null){
            first = new QueueNode(data);
            last = first;
        }else{
            QueueNode node = new QueueNode(data);
            node = last.next;
            last = node;
        }
    }

    /**
     * Remove from head
     * @return
     */
    public int dequeue(){
        if(first == null){
            throw new EmptyStackException();
        }
        int value = first.data;
        first = first.next;
        return value;
    }

    public int peek(){
        if(first == null){
            throw new EmptyStackException();
        }
        return first.data;
    }

    public boolean isEmpty(){
        return (first == null);
    }

}

class QueueNode{
    int data;
    QueueNode next;

    public QueueNode(int data){
        this.data = data;
    }
}