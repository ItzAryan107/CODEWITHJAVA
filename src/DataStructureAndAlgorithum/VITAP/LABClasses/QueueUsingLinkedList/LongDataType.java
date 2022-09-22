package DataStructureAndAlgorithum.VITAP.LABClasses.QueueUsingLinkedList;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LongDataType {
    private final LC06_Queue<Long> longDataType = new LC06_Queue<>();

    private final Scanner sc = new Scanner(System.in);

    private long takeInput(){
        Scanner scanner =new Scanner(System.in);
        try {
            return scanner.nextLong();
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
                longDataType.enQueue(takeInput());
                System.out.println();
            }

            case 2 -> longDataType.deQueue();
            case 3 -> longDataType.peek();

            case 4 -> System.out.println(longDataType.getRear());
            case 5 -> System.out.println(longDataType.isEmpty());

            case 6 -> longDataType.display();
        }

    }

    public void longType(){
        longDataType.operationsToPerform();
        longDataType.operationToBePerform();
        System.out.println();
        System.out.print("Enter choice ---> ");
        while (true) {

            int a = sc.nextInt();
            if (a == 7)
                break;

            if (longDataType.head == null){
                if (a == 1 || a == 5){
                    operations(a);
                    if (!longDataType.isEmpty()) {
                        longDataType.operationToBePerform();
                    }
                    System.out.print("Enter Choice ---> ");
                }else
                    System.out.print("Enter valid input ---> ");
            }
            else if (a>7 || a<=0)
                System.out.print("Enter valid input ---> ");
            else {
                operations(a);

                if (a == 2 && longDataType.isEmpty()){
                    longDataType.operationToBePerform();
                }

                if (!longDataType.isEmpty()) {
                    longDataType.operationToBePerform();
                }
                System.out.print("Enter Choice ---> ");
            }

        }
    }
}
