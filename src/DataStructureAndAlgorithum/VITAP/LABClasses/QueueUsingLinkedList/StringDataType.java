package DataStructureAndAlgorithum.VITAP.LABClasses.QueueUsingLinkedList;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringDataType {

    private final Scanner sc = new Scanner(System.in);
    private final LC06_Queue<String> stringType = new LC06_Queue<>();


    private String input(){
        Scanner scanner = new Scanner(System.in);
        try{
            return scanner.nextLine();
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
                stringType.enQueue(input());
                System.out.println();
            }

            case 2 -> stringType.deQueue();
            case 3 -> stringType.peek();

            case 4 -> System.out.println(stringType.getRear());
            case 5 -> System.out.println(stringType.isEmpty());

            case 6 -> stringType.display();
        }

    }
    public void stringType(){
        stringType.operationsToPerform();
        stringType.operationToBePerform();
        System.out.println();
        System.out.print("Enter choice ---> ");
        while (true) {

            int a = sc.nextInt();
            if (a == 7)
                break;

            if (stringType.head == null){
                if (a == 1 || a == 5){
                    operations(a);
                    if (!stringType.isEmpty()) {
                        stringType.operationToBePerform();
                    }
                    System.out.print("Enter Choice ---> ");
                }else
                    System.out.print("Enter valid input ---> ");
            }
            else if (a>7 || a<=0)
                System.out.print("Enter valid input ---> ");
            else {
                operations(a);

                if (a == 2 && stringType.isEmpty()){
                    stringType.operationToBePerform();
                }

                if (!stringType.isEmpty()) {
                    stringType.operationToBePerform();
                }
                System.out.print("Enter Choice ---> ");
            }
        }
    }
}
