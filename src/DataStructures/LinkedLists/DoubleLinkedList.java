package DataStructures.LinkedLists;

/**
 * This class represents the basic implementation of a double linked list
 * Created by dinu on 12/30/16.
 */
public class DoubleLinkedList {

    DoubleLinkedListNode head;
    DoubleLinkedListNode tail;

    public void inserttoHead(int data){
        if(head == null){
            head = new DoubleLinkedListNode(data);
            tail = head;
        }else{
            DoubleLinkedListNode current = new DoubleLinkedListNode(data);
            current.next = head;
            head = current;
        }
    }

    public void insertToTail(int data){
        if(head == null){
            head = new DoubleLinkedListNode(data);
            tail = head;
        }else{
            DoubleLinkedListNode current = new DoubleLinkedListNode(data);
            current.prev = tail;
            tail = current;
        }
    }

    public void removeFromHead(){
        if(head == null){
            throw new EmptyLinkedListException("Empty Double Linked List");
        }else{
            if(head.next != null){
                head = head.next;
            }else{
                head = null;
            }
        }
    }

    public void removeFromTail(){
        if(head == null || tail == null){
            throw new EmptyLinkedListException("Empty Double Linked List");
        }else{
            if(tail == head){
                tail = null;
                head = null;
            }else{
                tail = tail.prev;
            }

        }
    }

    public boolean contains(int data){
        if(head == null){
            throw new EmptyLinkedListException("Empty double linked list");
        }else{
            while(head.next != null){
                if(head.data == data){
                    return true;
                }
                head = head.next;
            }
            return false;
        }
    }



}

class DoubleLinkedListNode{
    int data;
    DoubleLinkedListNode prev;
    DoubleLinkedListNode next;

    public DoubleLinkedListNode(int data) {
        this.data = data;
    }
}

