package xz222az_assign1.LiFo;

/*
LiFo should add and remove from only one side
i know it is much easier do this from the end of array
but i do from the beginning of array and move every element after add or remove
i hope it is fine
 */
import java.util.Scanner;

public class StackMain {
    public static void main(String[] args) {
        StackArray stack = new StackArray(8);
        Scanner sc = new Scanner(System.in);
        int answer = -99;

        System.out.print("The stack is " );
        stack.println();

        do {
            //1 for pop, 2 for peek, 3 for push
            System.out.print("Enter an integer(1 for pop, 2 for peek, 3 for push, and 0 is exist): ");
            String st = sc.nextLine();
            //check input
            if (isInt(st)){
                answer = Integer.parseInt(st);
                if (answer == 1){
                    System.out.print("Pop, ");
                    try {
                        System.out.print("the top element is " + stack.pop() + " and the stack is " );
                        stack.println();
                    } catch (RuntimeException ex) {
                        System.out.println("but "+ex.getMessage());
                    }
                }
                else if (answer == 2){
                    System.out.print("Peek, ");
                    try {
                        System.out.print("the top element is " + stack.peek() + " and the stack is ");
                        stack.println();
                    } catch (RuntimeException ex) {
                        System.out.println("but "+ex.getMessage());
                    }
                }
                else if (answer == 3){
                    //push element into stack
                    System.out.print("Push element in stack ");
                    stack.push("element");
                    System.out.print("and the stack is " );
                    stack.println();
                }
                else if (answer == 0){
                    break;
                }
                else
                    System.out.println("It is not an option");
            }
            else {
                System.out.println("It is not an Integer");
            }
        }while (answer != 0);
        System.out.println("Bye bye");
    }

    public static boolean isInt(String st){
        try{
            int answer = Integer.parseInt(st);
            return true;
        }catch (RuntimeException e){
            return false;
        }
    }
}
