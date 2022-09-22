package DataStructureAndAlgorithum.VITAP.LABClasses.QueueUsingLinkedList;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Operation<P> {
    private final Scanner sc = new Scanner(System.in);
    private final ByteDataType byteDataType = new ByteDataType();
    private final ShortDataType shortDataType =new ShortDataType();
    private final IntegerDataType integerDataType = new IntegerDataType();
    private final LongDataType longDataType = new LongDataType();
    private final FloatDataType floatDataType = new FloatDataType();
    private final DoubleDataType doubleDataType = new DoubleDataType();
    private final StringDataType stringDataType = new StringDataType();
    private final CharacterDataType characterDataType = new CharacterDataType();

    private int operation(int a){
        try{
            if (a<=0 || a>8)
                throw new InputMismatchException();

            return a;
        }catch (Exception e){
            System.out.print("Enter Valid DataType ---> ");
            return operation(sc.nextInt());
        }
    }


    public void selectingDataType(int a){
        if (a == 1)
            byteDataType.byteType();
        else if (a == 2)
            shortDataType.shortType();
        else if (a == 3)
            integerDataType.integerType();
        else if (a == 4)
            longDataType.longType();
        else if (a == 5)
            floatDataType.floatType();
        else if (a == 6)
            doubleDataType.doubleType();
        else if (a == 7)
            characterDataType.characterType();
        else if (a == 8)
            stringDataType.stringType();
    }

    private void input(){
        System.out.println("\t\tSelect The data Type");
        System.out.println("1 -> Byte");
        System.out.println("2 -> Short");
        System.out.println("3 -> Integer");
        System.out.println("4 -> Long");
        System.out.println("5 -> Float");
        System.out.println("6 -> Decimal");
        System.out.println("7 -> Character");
        System.out.println("8 -> String");
        System.out.println();
        System.out.print("Enter Your Choice ---> ");
        selectingDataType(operation(sc.nextInt()));
    }



    public static void main(String[] args) {
        Operation<Integer> operation = new Operation<>();
        operation.input();


    }
}
