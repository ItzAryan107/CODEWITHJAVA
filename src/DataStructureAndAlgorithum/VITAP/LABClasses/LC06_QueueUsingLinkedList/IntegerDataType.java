package DataStructureAndAlgorithum.VITAP.LABClasses.LC06_QueueUsingLinkedList;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegerDataType {

    private int choiceInput(){
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.print("Enter valid Input ---> ");
            return choiceInput();
        }
    }
    private final LC06_Queue<Integer> integerType = new LC06_Queue<>();

    private Integer input(){
        Scanner scanner = new Scanner(System.in);
        try{
            return scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Error!! --- the entered value is either invalid or out of chosen range!! ");
            System.out.print("Enter the valid input ---> ");

            return input();
        }
    }

    private void operations(int a){

        switch (a){
            case 1 ->{
                System.out.print("Enter data ---> ");
                integerType.enQueue(input());
                System.out.println();
            }

            case 2 -> integerType.deQueue();
            case 3 -> integerType.peek();

            case 4 -> System.out.println(integerType.getRear());
            case 5 -> System.out.println(integerType.isEmpty());

            case 6 -> integerType.display();
        }

    }

    public void integerType(){
        integerType.operationsToPerform();
        integerType.operationToBePerform();
        System.out.println();
        System.out.print("Enter choice ---> ");
        while (true) {

            int a = choiceInput();
            if (a == 7)
                break;

            if (integerType.head == null){
                if (a == 1 || a == 5){
                    operations(a);
                    if (!integerType.isEmpty()) {
                        integerType.operationToBePerform();
                    }
                    System.out.print("Enter Choice ---> ");
                }else
                    System.out.print("Enter valid input ---> ");
            }
            else if (a>7 || a<=0)
                System.out.print("Enter valid input ---> ");
            else {
                operations(a);

                if (a == 2 && integerType.isEmpty()){
                    integerType.operationToBePerform();
                }

                if (!integerType.isEmpty()) {
                    integerType.operationToBePerform();
                }
                System.out.print("Enter Choice ---> ");
            }
        }
    }
}
