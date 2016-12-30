/**
 * This class represents the basic implementation of a single linked list
 * Created by dinu on 12/30/16.
 */
public class LinkedList {

    SingleLinkedListNode head;

    /**
     * Insert data to the head
     * @param data
     */
    public void insert(int data){
        if(head == null){
            head = new SingleLinkedListNode(data);
        }else{
            SingleLinkedListNode node = new SingleLinkedListNode(data);
            node.next = head;
            head = node;
        }
    }

    /**
     * Insert data to the tail
     * @param data
     */
    public void insertToTail(int data){
        if(head == null){
            head = new SingleLinkedListNode(data);
        }else{
            while(head.next == null){
                head = head.next;
            }
            head.next = new SingleLinkedListNode(data);

        }
    }

    /**
     * Remove data from head
     */
    public void remove(){
        if(head == null){
            return;
        }else{
            if(head.next == null){
                head = null;
            }else{
                head = head.next;
            }
        }
    }

    /**
     * Remove data from tail
     */
    public void removeFromTail(){
        if(head == null){
            return;
        }else{
            while(head.next.next != null){
                head = head.next;
            }
            head.next = null;
        }
    }

    /**
     * Value of the head
     * @return head.data
     */
    public int peek(){
        if(head == null) {
            throw new EmptyLinkedListException("EmptyLinkedListException");
        }else{
            return head.data;
        }
    }

    /**
     * Check whether the linked list contains a certain data value
     * @param data
     * @return true if the linked list contains the data value
     */
    public boolean contains(int data){
        if(head == null){
            throw  new EmptyLinkedListException("EmptyLinkedListException");
        }else{
            while(head!= null){
                if(head.data == data){
                    return true;
                }
                head = head.next;
            }
            return false;
        }

    }

    /**
     * Check whether the linked list contains a certain node
     * @param node
     * @return true of the linked list contains the node
     */
    public boolean contains (SingleLinkedListNode node){
        if(head == null){
            throw  new EmptyLinkedListException("EmptyLinkedListException");
        }else{
            while(head!= null){
                if(head == node){
                    return true;
                }
                head = head.next;
            }
            return false;
        }
    }


}

/**
 * Class for the Linked List Node
 */
class SingleLinkedListNode{
    int data;
    SingleLinkedListNode next;

    /**
     * Constructor
     * @param data
     */
    SingleLinkedListNode(int data){
        this.data = data;
    }
}

/**
 * Custom exception to throw when the linked list is empty
 */
class EmptyLinkedListException extends RuntimeException{

    /**
     * Constructor
     * @param messsage
     */
    public EmptyLinkedListException(String messsage){
        super(messsage);
    }
}