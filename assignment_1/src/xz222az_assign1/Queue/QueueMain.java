package xz222az_assign1.Queue;

public class QueueMain {
    public static void main(String[] args) {
        LinkedQueue q = new LinkedQueue();
        q.enqueue(5);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(7);

        System.out.println(q.toString());
        q.dequeue();
        System.out.println("dequeue "+q.toString());
        System.out.println("The first is " + q.first());
        System.out.println("The last is " + q.last());
    }
}
