package xz222az_assign1.VG;

import java.util.Iterator;

public class ArrayQueue implements IntQueue {
    private int size; //current size
    private int first;
    private int last;
    int[] values;
    public ArrayQueue() {
        size = 0;
        first = -1;
        last = -1;
        values = new int[3];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull(){
        return size == values.length;
    }

    public void resize(){
        System.out.println("e");
        //resize and restore the array first become 0
        int[] tmp = new int[2*values.length];
        System.arraycopy(values,0,tmp,0,values.length);
        values = tmp;
        first = 0;
        last = values.length / 2 - 1;
    }

    @Override
    public void enqueue(int element) {
        //if it is empty just add an element in it
        if (isEmpty()){
            first ++;
            last = first;
            values[first] = element;
            size++;
        }
        else {
            last = (last + 1) % values.length;
            values[last] = element;
            size++;
        }
        //if it is full
        if (isFull()){
            resize();
        }
    }

    @Override
    public int dequeue() {
        if (isEmpty()){
            throw new RuntimeException("The queue is empty.");
        }
        int firstValue = values[first];
        //if only ont element, and including the only final element and return initial configuration
        if (first == last){
            values[first]=0;
            first = -1;
            last = -1;
            size --;
        }
        else {
            values[first]=0;
            first = first + 1;
           size--;
        }
        return 0;
    }

    @Override
    public int first() {
        return values[first];
    }

    @Override
    public int last() {
        return values[last];
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ArrayQueue().iterator();
    }

    public String toString(){
        if (isEmpty()){
            throw new RuntimeException("It is empty");
        }
        StringBuffer b = new StringBuffer();
        for (int i = first; i != last; i = (i + 1) % values.length){
            b.append(values[i]);
        }
//        for (int i = 0; i < values.length; i++)  {
//            b.append(values[i] +  "  ");
//        }
        return b.toString();
    }

}
