package OOPS;

import java.util.Scanner;

public class T083_HandlingScannerInputException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0;
        double b=0.0;
        try {
            System.out.print("Enter age ---> ");
            a = sc.nextInt();// if this line get first Exception, then it will not move to other line
            // other than it will move directly to
            //catch block
            System.out.print("Enter 'b'  ---> ");
            b = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("Error");
        }

//        if(a>125 || a<1){
//            throw new ArithmeticException("Person is not eligible");
//        }else {
//            System.out.println(a);
//        }
        if (a > 125 || a < 1) {
            try {
                throw new ArithmeticException();
            } catch (Exception e) {
                System.out.println("Input MisMatch Exception!");
            }
        } else
            System.out.println(a);
        System.out.println(b);
    }
}