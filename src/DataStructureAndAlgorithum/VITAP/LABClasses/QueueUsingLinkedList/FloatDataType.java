package DataStructureAndAlgorithum.VITAP.LABClasses.QueueUsingLinkedList;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FloatDataType {

    private final LC06_Queue<Float> floatDataType = new LC06_Queue<>();

    private final Scanner sc = new Scanner(System.in);

    private Float takeInput(){
        Scanner scanner =new Scanner(System.in);
        try {
            return scanner.nextFloat();
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
                floatDataType.enQueue(takeInput());
                System.out.println();
            }

            case 2 -> floatDataType.deQueue();
            case 3 -> floatDataType.peek();

            case 4 -> System.out.println(floatDataType.getRear());
            case 5 -> System.out.println(floatDataType.isEmpty());

            case 6 -> floatDataType.display();
        }

    }

    public void floatType(){
        floatDataType.operationsToPerform();
        floatDataType.operationToBePerform();
        System.out.println();
        System.out.print("Enter choice ---> ");
        while (true) {

            int a = sc.nextInt();
            if (a == 7)
                break;

            if (floatDataType.head == null){
                if (a == 1 || a == 5){
                    operations(a);
                    if (!floatDataType.isEmpty()) {
                        floatDataType.operationToBePerform();
                    }
                    System.out.print("Enter Choice ---> ");
                }else
                    System.out.print("Enter valid input ---> ");
            }
            else if (a>7 || a<=0)
                System.out.print("Enter valid input ---> ");
            else {
                operations(a);

                if (a == 2 && floatDataType.isEmpty()){
                    floatDataType.operationToBePerform();
                }

                if (!floatDataType.isEmpty()) {
                    floatDataType.operationToBePerform();
                }
                System.out.print("Enter Choice ---> ");
            }
        }
    }
}
