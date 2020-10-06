package xz222az_assign2.Exercise5;

import java.util.Iterator;

public class LinkedQueue<T> implements Queue<T> {
    private int size;
    private Node head;
    private Node tail;

    //constructor initial the size head and tail
    public LinkedQueue() {
        size = 0;
        head = null;
        tail = null;
    }

    //Private inner Node class
    private class Node{
        T value;
        Node next = null;

        public Node(T v){
            value = v;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    //add element at end of queue
    @Override
    public void enqueue(T element) {
        if (isEmpty()){ //add first element
            head = new Node(element);
            tail = head;
        }
        else{
            tail.next = new Node(element); //attach new node
            tail = tail.next; //update tail
        }
        size ++;
    }

    //return and remove first element.
    @Override
    public T dequeue() {
        if (isEmpty()){
            throw new RuntimeException("The list is empty");
        }
        T first = head.value; //get the first element
        if (size == 1){ // if there is only one element in the list and after deleting the list is empty
            head = null;
            tail = null;
        }
        else {
            head = head.next;
        }
        size--;
        return first;
    }

    //get (without removing) first element
    @Override
    public T first() {
        if (isEmpty()){
            throw new RuntimeException("The list is empty");
        }
        return head.value;
    }

    //get (without removing) last element
    @Override
    public T last() {
        if (isEmpty()){
            throw new RuntimeException("The list is empty");
        }
        return tail.value;
    }

    @Override
    public Iterator<T> iterator() {
        return new QueueIterator<T>();
    }

    /**
     * Inner iterator class
     */
    private class QueueIterator<X> implements Iterator<X>{
        private Node node = head; // First node is head

        @Override
        public boolean hasNext() {
            return node != null;
        }

        @Override
        public X next() {
            X val = (X)node.value; // Read current value
            node = node.next; // Move one step ahead
            return val ;
        }
    }

    public String toString(){
        Node node = head;
        StringBuilder s = new StringBuilder();
        while (node != null) {
            s.append(node.value + " ");
            node = node.next;
        }
        return s.toString();
    }
}
