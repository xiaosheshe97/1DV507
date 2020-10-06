package xz222az_assign1.collection;

public class IntMain {
    public static void main(String[] args) {
        ArrayIntList list = new ArrayIntList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("The list is "+list.toString());
        list.addAt(4,0);
        list.addAt(5,1);
        System.out.println(list.toString());
        System.out.println("2 is located in "+list.indexOf(2));
        System.out.println("position 0 is "+list.get(0));

        ArrayIntStack stack = new ArrayIntStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("The stack is " + stack.toString());

        System.out.println("peek " + stack.peek()+ " and the stack is" + stack.toString());
        System.out.println("pop " + stack.pop()+ " and the stack is" + stack.toString());
        System.out.println("pop " + stack.pop()+ " and the stack is" + stack.toString());

    }
}
