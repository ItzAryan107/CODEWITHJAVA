package OOPS;

import java.util.Scanner;

public class T081_ExceptionHandling {
    public static void main(String[] args) {
        int [] array=new int[5];
        array[0]=79;
        array[1]=56;
        array[2]=90;
        array[3]=90;
        array[4]=90;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number ---> ");
        int a= sc.nextInt();
        try{
            System.out.println("array contain "+array[a-1]+" at "+a+" Position");
        }catch (Exception e){
            System.out.println("Exception Got Handel --->\n"+e);
        }
        System.out.println();
        System.out.print("Enter The Number to divide ---> ");
        int div= sc.nextInt();
        try{
            System.out.println("array contain "+array[a-1]+" at "+a+" Position");
            System.out.println("Value ---> "+array[a]/div);
        }catch (ArithmeticException ar){
            System.out.println("Exception Got Handle --->\n"+ar);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception got handle --->\n"+e);
        }catch (Exception e){
            System.out.println("SomeOther Exception Occurred");
        }
        /**
         * When You Will Create both Exception in just above following code
         * you will get only ArrayOutOfIndex Exception
         * its bcz to divide first it will find element of that particular index.
         */
    }
}