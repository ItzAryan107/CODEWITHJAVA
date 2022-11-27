package OOPS;

public class T080_TryCatchBlock {
    public static void main(String[] args) {
        int a=6000;
        int b=9;
        int c=a/b;
        System.out.println("The Result is ---> "+c);
        //Let if I do Value of b '0'
        System.out.println();
        b=0;
//        System.out.println("New Result ---> "+c);// ---> It will Give To handle The Arithmetic Exception
//        so to handle the Above Exception
        try {
            c=a/b;//if the statement have any of error, compiler will go to catch and handle the Exception
        }catch (Exception e){
            System.out.println(e+"We fail to divide");
        }
        System.out.println(c);// it will print the previous value of c, bcz Compiler not entered the Try Block,
        // bcz which value of c not got change
    }
}