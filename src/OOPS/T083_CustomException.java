package OOPS;

import java.util.Scanner;

class MyExceptionT83 extends ArithmeticException{
    @Override
    public String toString() {
        return super.toString()+" I am toString()";// here getString of super class will give null bcz it have no body,
        //therefore, we will make our own custom method
    }

    @Override
    public String getMessage() {
        return super.getMessage()+" I am getMessage()";//here getMessage of super cass will give null
    }

}
public class T083_CustomException {
    public static void main(String[] args) {
        MyExceptionT83 myExceptionT83=new MyExceptionT83();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number ---> ");
        int a = sc.nextInt();
        if (a<90){
            try {
                throw  myExceptionT83;//we throw object of Exception classes,
                // Whenever Exception is Thrown, it's thrown in conditional statement, like try catch, if-else,switch case
            }catch (MyExceptionT83 e){
//                System.out.println(e.toString());
                System.out.println(e.getMessage());
            }
        }
    }
}