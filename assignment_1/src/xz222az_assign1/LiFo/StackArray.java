package xz222az_assign1.LiFo;

public class StackArray implements StringStack {
    //creat an arrayList
    private String[] stack = new String[8];
    private int currentSize = 0; //current size

    public StackArray(int size){
        currentSize = size;
        setStack(size);
    }

    public String[] getStack() {
        return stack;
    }

    //Generate an arrayList based on size, like 12345
    public void setStack(int size) {
        //make sure the stack can contain any size of elements
        while (stack.length < size){
            resize();
        }
        //create a stack by consistent integer
        int count = 0;
        for (int i = 0; i < size; i++) {
            stack[i] = "" + count;
            count++;
        }
    }

    public void println(){
        if (isEmpty()){
            System.out.println("null");
        }
        String st = "";
        for (int i = 0; i < stack.length; i++) {
            if (stack[i] != null)
            st += stack[i];
        }
        System.out.println(st);
    }

    //current size
    @Override
    public int size() {
        return stack.length;
    }

    @Override
    public boolean isEmpty() {
        if (stack[0] == null)
            return true;
        else
            return false;
    }

    //add an element on index 0, top
    @Override
    public void push(String element) {
        //increase size
        if (currentSize == stack.length){
            resize();
        }
        //move to right
        String[] temp = new String[stack.length];
        for (int i = 0; i < currentSize; i++){
            temp[i + 1] = stack[i];
        }
        temp[0] = element;
        stack = temp;
        currentSize ++;
    }

    //remove top element
    @Override
    public String pop() {
        if (isEmpty()){
            throw new RuntimeException("Stack is empty.");
        }
        String element = stack[0];
        //check the size
        if (currentSize == stack.length)
            resize();
        //move to left
        for (int i = 0; i < currentSize; i++){
            stack[i] = stack[i + 1];
        }
        currentSize --;
        return element;
    }

    //return top element
    @Override
    public String peek() {
        if (isEmpty()){
            throw new RuntimeException("Stack is empty");
        }

        return stack[0];
    }

    //double size
    public void resize(){
        String[] temp = new String[2 * stack.length];
        System.arraycopy(stack,0,temp,0,stack.length);
        stack = temp;
    }
}
