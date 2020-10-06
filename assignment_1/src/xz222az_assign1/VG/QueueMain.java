package xz222az_assign1.VG;

/*
for my resize method i just copy the array and double the size
make fist=0 last become the last element
 */

public class QueueMain {
    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.dequeue();

        for (int i:q.values){
            System.out.println(i);
        }
        System.out.println("First is "+q.first());
        System.out.println("Last is " + q.last());
        System.out.println("queue is "+q.toString());

        System.out.println("==============");
        q.dequeue();
        q.enqueue(7);
        q.enqueue(8);
        for (int i:q.values){
            System.out.println(i);
        }
        System.out.println("First is "+q.first());
        System.out.println("Last is " + q.last());
        System.out.println("queue is "+q.toString());

        System.out.println("==============");
        q.dequeue();
        q.enqueue(9);
        for (int i:q.values){
            System.out.println(i);
        }
        System.out.println("First is "+q.first());
        System.out.println("Last is " + q.last());
        System.out.println("queue is "+q.toString());

        q.enqueue(1);
        for (int i:q.values){
            System.out.println(i);
        }

    }
}
