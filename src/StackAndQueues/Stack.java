package StackAndQueues;

import java.util.EmptyStackException;

/**
 * Created by dinu on 12/30/16.
 */
public class Stack {
    private StackNode head;

    public void push(int data){
        if(head == null){
            head = new StackNode(data);
        }else{
            StackNode node = new StackNode(data);
            node.next = head;
            head = node;
        }

    }

    public int pop(){
        if(head == null){
            throw new EmptyStackException();
        }else{
            int value = head.data;
            head = head.next;
            return value;
        }

    }

    public int peek(){
        if(head == null){
            throw new EmptyStackException();
        }else{
            return head.data;
        }

    }

    public boolean isEmpty(){
        return (head == null);
    }

}

class StackNode{
    int data;
    StackNode next;

    public StackNode(int data){
        this.data = data;
    }
}
