package OOPS;

import java.util.EmptyStackException;
import java.util.Stack;

//Stack class always extends vector class
//its last in first out(LIFO)
public class T091_Stack {
    private static void pushElement(Stack stk,int x){
        stk.push(x);
    }
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        System.out.println("To know the capacity of Stack ---> .capacity()");
        System.out.println(stack.capacity());// its default capacity is 10

        System.out.println();

        System.out.println("Adding element to Stack ---> .push()");
        stack.push(9);
        stack.push(8);
        stack.push(7);
        stack.push(6);
        stack.push(5);
        System.out.println(stack);

        System.out.println();

        System.out.println("To remove element from stack ---> .pop()");
        stack.pop();
        System.out.println(stack);

        System.out.println();

        System.out.println("To know the element at top ---> .peek()");
        System.out.println(stack.peek());

        System.out.println();

        System.out.println("To search the index of an element ---> .search()");
        System.out.println(stack.search(7));

        System.out.println();

        System.out.println("To know the stack is empty or not ---> .empty()");
        System.out.println(stack.empty());

        System.out.println();
        for (int i=0;i<5;i++){
            try{
                stack.pop();
            }catch (EmptyStackException e){
                System.out.println("Your stack is Empty u can not pop anymore");
            }
        }
        System.out.println(stack);

        System.out.println();

        System.out.println("Making a User define Push method ---> ");
        pushElement(stack,1);
        pushElement(stack,2);
        pushElement(stack,3);
        pushElement(stack,4);
        System.out.println(stack);
    }
}