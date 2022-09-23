package DataStructureAndAlgorithum.VITAP.LABClasses.LC06_QueueUsingLinkedList;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DoubleDataType {

    private final LC06_Queue<Double> byteDataType = new LC06_Queue<>();

    private int choiceInput(){
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.print("Enter valid Input ---> ");
            return choiceInput();
        }
    }

    private Double takeInput(){
        Scanner scanner =new Scanner(System.in);
        try {
            return scanner.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("Error!!");
            System.out.print("Enter the value in chosen range ---> ");
            return takeInput();
        }
    }
    private void operations(int a){

        switch (a){
            case 1 ->{
                System.out.print("Enter data ---> ");
                byteDataType.enQueue(takeInput());
                System.out.println();
            }

            case 2 -> byteDataType.deQueue();
            case 3 -> byteDataType.peek();

            case 4 -> System.out.println(byteDataType.getRear());
            case 5 -> System.out.println(byteDataType.isEmpty());

            case 6 -> byteDataType.display();
        }

    }

    public void doubleType(){
        byteDataType.operationsToPerform();
        byteDataType.operationToBePerform();
        System.out.println();
        System.out.print("Enter choice ---> ");
        while (true) {

            int a = choiceInput();
            if (a == 7)
                break;

            if (byteDataType.head == null){
                if (a == 1 || a == 5){
                    operations(a);
                    if (!byteDataType.isEmpty()) {
                        byteDataType.operationToBePerform();
                    }
                    System.out.print("Enter Choice ---> ");
                }else
                    System.out.print("Enter valid input ---> ");
            }
            else if (a>7 || a<=0)
                System.out.print("Enter valid input ---> ");
            else {
                operations(a);

                if (a == 2 && byteDataType.isEmpty()){
                    byteDataType.operationToBePerform();
                }

                if (!byteDataType.isEmpty()) {
                    byteDataType.operationToBePerform();
                }
                System.out.print("Enter Choice ---> ");
            }
        }
    }
}
