package xz222az_assign1.collection;


public class ArrayIntStack extends AbstractIntCollection implements IntStack {
    public ArrayIntStack() {
    }

    @Override
    public void push(int n) {
        if (size == values.length)
            resize();
        values[size ++] = n;
    }

    @Override
    public int pop() throws IndexOutOfBoundsException {
        if (isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return values[size--];
    }

    @Override
    public int peek() throws IndexOutOfBoundsException {
        if (isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return values[size - 1];
    }

}