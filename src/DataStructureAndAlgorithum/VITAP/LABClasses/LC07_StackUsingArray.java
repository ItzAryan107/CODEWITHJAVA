package DataStructureAndAlgorithum.VITAP.LABClasses;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LC07_StackUsingArray {
    int[] array;
    int length;
    int filledIndex;
    boolean check;

    public LC07_StackUsingArray(int length){
        array = new int[length];
        this.length = length;
        filledIndex = -1;
        check=false;
    }


    private void push(int data){
        array[filledIndex+1] = data;
        filledIndex++;
    }


    private int pop(){
        filledIndex--;
        return array[filledIndex+1];
    }


    private boolean isEmpty(){

        return filledIndex == -1;

    }


    private int peek(){

        return array[filledIndex];

    }


    private void display(){

        System.out.print("[");
        for (int i = filledIndex;i>0;i--){
            System.out.print(array[filledIndex]+" ");
        }
        System.out.println(array[0]+"]");

    }


    private void operationsToDo(){

        System.out.println("\t\tOperations to do");
        System.out.println("1 -push()");
        System.out.println("2 -pop()");
        System.out.println("3 -peek()");
        System.out.println("4 -isEmpty()");
        System.out.println("5 -display()");
        System.out.println("6 -exit()");
        System.out.println();

    }


    private void operationsToPerform(){

        if (filledIndex==-1){
            System.out.println();
            System.out.println("Operations To Perform");
            System.out.println("1 -push()");
            System.out.println("4 -isEmpty()");
            System.out.println("6 -exit()");
            System.out.println();
        }
        else if (filledIndex == length-1){
            System.out.println();
            System.out.println("Operation To perform");
            System.out.println("2 -pop()");
            System.out.println("3 -peek()");
            System.out.println("4 -isEmpty()");
            System.out.println("5 -display()");
            System.out.println("6 -exit()");
            System.out.println();
        }
        else
            System.out.println("All Operations can be Performed");

    }


    private int input(){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        try {

            if (check)
                return a;

            else if (filledIndex == -1) {
                if(a == 1 || a == 4 || a == 6)
                    return a;
                else
                    throw new InputMismatchException();
            }
            else if (filledIndex == length-1 ) {
                if(a == 2 || a == 3 || a == 4 || a == 5 || a == 6)
                    return a;
                else
                    throw new InputMismatchException();
            }
            else if (a>0 && a<7)
                return a;

            throw new InputMismatchException();
        }catch (InputMismatchException e){
            System.out.print("Enter valid Input ---> ");
            return input();
        }
    }


    private void outPut(int n){
        switch (n) {
            case 1 -> {
                check = true;
                System.out.print("Enter data ---> ");
                push(input());
                check = false;
            }

            case 2 -> System.out.println("popped value ---> " + pop());

            case 3 -> System.out.println("peek value ---> " + peek());

            case 4 -> System.out.println(isEmpty());

            case 5 -> display();

            case 6 -> {
                return;
            }
        }
        System.out.println();
        operationsToPerform();
        System.out.print("Enter choice ---> ");
        outPut(input());
    }


    public void operation(){
        operationsToDo();
        operationsToPerform();
        System.out.print("Enter choice ---> ");
        outPut(input());

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length Of Stack ---> ");

        LC07_StackUsingArray stackArray= new LC07_StackUsingArray(sc.nextInt());
        stackArray.operation();
    }
}
