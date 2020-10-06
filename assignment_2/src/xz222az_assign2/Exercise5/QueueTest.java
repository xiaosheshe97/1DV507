package xz222az_assign2.Exercise5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    private static int testCount = 0;

    /* Is executed before every test method (not test case).*/
    @BeforeEach
    public void setTestCount(){
        testCount ++;
        System.out.println("Test " + testCount);
    }

    @AfterEach
    public void tearDown() {
        System.out.println(" --- done with test "+ testCount);
    }

    @Test
    public void size() {
        //test the integer queue
        LinkedQueue<Integer> q1 = buildInt(0);
        assertEquals(0,q1.size());

        //test the String queue
        LinkedQueue<String> q2 = buildString(0);
        assertEquals(0,q2.size());
    }

    //test the boolean isEmpty
    @Test
    public void isEmpty() {
        //test the integer queue
        LinkedQueue<Integer> q1 = buildInt(0);
        assertEquals(true,q1.isEmpty());
        LinkedQueue<Integer> q3 = buildInt(4);
        assertEquals(false,q3.isEmpty());

        //test the String queue
        LinkedQueue<String> q2 = buildString(0);
        assertEquals(true,q2.isEmpty());
        LinkedQueue<String> q4 = buildString(4);
        assertEquals(false,q4.isEmpty());
    }

    @Test
    public void enqueue() {
        //test the integer queue
        LinkedQueue<Integer> q1 = buildInt(4); //0,1,2,3
        assertEquals(3,q1.last());
        q1.enqueue(11);
        assertEquals(11,q1.last());
        assertEquals(5,q1.size());

        q1.enqueue(9);
        assertEquals(9,q1.last());
        assertEquals(6,q1.size());

        //test the String queue
        LinkedQueue<String> q2 = buildString(5); //"0","1","2","3","4"
        assertEquals("4",q2.last());
        q2.enqueue("s1");
        assertEquals("s1",q2.last());
        assertEquals(6,q2.size());

        q2.enqueue("s2");
        assertEquals("s2",q2.last());
        assertEquals(7,q2.size());
    }

    @Test
    void dequeue() {
        //test the integer queue

        //test if empty throw exception
        LinkedQueue<Integer> q1 = buildInt(0);
        assertThrows(RuntimeException.class, q1::dequeue);

        LinkedQueue<Integer> q2 = buildInt(4); //0,1,2,3
        assertEquals(0,q2.first());
        q2.dequeue();
        assertEquals(1,q2.first());
        assertEquals(3,q2.size());

        q2.dequeue();
        assertEquals(2,q2.first());
        assertEquals(2,q2.size());

        //test the String queue

        //test if empty throw exception
        LinkedQueue<String> q3 = buildString(0);
        assertThrows(RuntimeException.class, q3::dequeue);

        LinkedQueue<String> q4 = buildString(5); //"0","1","2","3","4"
        assertEquals("0",q4.first());
        q4.dequeue();
        assertEquals("1",q4.first());
        assertEquals(4,q4.size());

        q4.dequeue();
        assertEquals("2",q4.first());
        assertEquals(3,q4.size());
    }

    @Test
    public void first() {
        //test the integer queue

        //test if empty throw exception
        LinkedQueue<Integer> q1 = buildInt(0);
        assertThrows(RuntimeException.class, q1::first);

        LinkedQueue q2 = buildInt(4); //0,1,2,3
        assertEquals(0,q2.first());
        q2.dequeue();
        assertEquals(1,q2.first());
        q2.dequeue();
        assertEquals(2,q2.first());

        //test the String queue

        //test if empty throw exception
        LinkedQueue<String> q3 = buildString(0);
        assertThrows(RuntimeException.class, q3::first);

        LinkedQueue<String> q4 = buildString(5); //"0","1","2","3","4"
        assertEquals("0",q4.first());
        q4.dequeue();
        assertEquals("1",q4.first());
        q4.dequeue();
        assertEquals("2",q4.first());

    }

    @Test
    public void last() {
        //test the integer queue

        //test if empty throw exception
        LinkedQueue<Integer> q1 = buildInt(0);
        assertThrows(RuntimeException.class, q1::first);

        LinkedQueue<Integer> q2 = buildInt(4); //0,1,2,3
        assertEquals(3,q2.last());
        q2.enqueue(10);
        assertEquals(10,q2.last());
        q2.enqueue(100);
        assertEquals(100,q2.last());

        //test the String queue

        //test if empty throw exception
        LinkedQueue<String> q3 = buildString(0);
        assertThrows(RuntimeException.class, q3::first);

        LinkedQueue<String> q4 = buildString(5); //"0","1","2","3","4"
        assertEquals("4",q4.last());
        q4.enqueue("s1");
        assertEquals("s1",q4.last());
        q4.enqueue("s2");
        assertEquals("s2",q4.last());

    }

    @Test
    void testToString() {
        //test the integer queue
        LinkedQueue<Integer> q1 = buildInt(4); //0,1,2,3
        assertEquals("0 1 2 3 ",q1.toString());

        //test the String queue
        LinkedQueue<String> q2 = buildString(5); //"0","1","2","3","4"
        assertEquals("0 1 2 3 4 ",q2.toString());


    }

    //Private help methods
    //build an Integer queue
    private LinkedQueue<Integer> buildInt(int size){
        LinkedQueue<Integer> queue = new LinkedQueue<>();
        for (int i=0;i<size;i++)
            queue.enqueue(i);
        return queue;
    }

    //Private help methods
    //build a String queue
    private LinkedQueue<String> buildString(int size){
        LinkedQueue<String> queue = new LinkedQueue<>();
        for (int i=0;i<size;i++)
            queue.enqueue(i+"");
        return queue;
    }
}