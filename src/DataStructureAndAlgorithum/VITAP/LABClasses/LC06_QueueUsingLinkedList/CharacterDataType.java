package DataStructureAndAlgorithum.VITAP.LABClasses.LC06_QueueUsingLinkedList;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CharacterDataType {
    private final LC06_Queue<Character> CharacterDataType = new LC06_Queue<>();

    private final Scanner sc = new Scanner(System.in);

    private Character takeInput(){
        Scanner scanner =new Scanner(System.in);
        try {
            String string = scanner.next();
            if (string.length()>1)
                throw new InputMismatchException();

            return string.charAt(0);
        }catch (InputMismatchException e){
            System.out.println("Error!!  ---> Enter a Character");
            System.out.print("Enter valid input ---> ");
            return takeInput();
        }
    }
    private void operations(int a){

        switch (a){
            case 1 ->{
                System.out.print("Enter data ---> ");
                CharacterDataType.enQueue(takeInput());
                System.out.println();
            }

            case 2 -> CharacterDataType.deQueue();
            case 3 -> CharacterDataType.peek();

            case 4 -> System.out.println(CharacterDataType.getRear());
            case 5 -> System.out.println(CharacterDataType.isEmpty());

            case 6 -> CharacterDataType.display();
        }

    }

    public void characterType(){
        CharacterDataType.operationsToPerform();
        CharacterDataType.operationToBePerform();
        System.out.println();
        System.out.print("Enter choice ---> ");
        while (true) {

            int a = sc.nextInt();
            if (a == 7)
                break;

            if (CharacterDataType.head == null){
                if (a == 1 || a == 5){
                    operations(a);
                    if (!CharacterDataType.isEmpty()) {
                        CharacterDataType.operationToBePerform();
                    }
                    System.out.print("Enter Choice ---> ");
                }else
                    System.out.print("Enter valid input ---> ");
            }
            else if (a>7 || a<=0)
                System.out.print("Enter valid input ---> ");
            else {
                operations(a);

                if (a == 2 && CharacterDataType.isEmpty()){
                    CharacterDataType.operationToBePerform();
                }

                if (!CharacterDataType.isEmpty()) {
                    CharacterDataType.operationToBePerform();
                }
                System.out.print("Enter Choice ---> ");
            }
        }
    }
}
