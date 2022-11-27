package OOPS;

import java.util.Scanner;

class myException_T83 extends Exception{
    @Override
    public String toString(){
        return "Input MisMatch Exception!";
    }

    @Override
    public String getMessage(){
        return "This Is getMessage!";
    }

    public String ex(){// You can even call your own made method
        return "Exception";
    }
}

public class T083_FactorialExceptionHandling {
    public static int fact(int n){
        if (n==1 || n==0){
            return 1;
        }
        else
            return n*fact(n-1);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Number ---> ");
        int a= sc.nextInt();
        if (a>=0) {
            System.out.println("Factorial of given Number ---> " + fact(a));
        }
        else {
            try{
                throw new myException_T83();
            }catch (myException_T83 f){
                System.out.println(f);// its understood it will call, toString() method
            }
        }
    }
}