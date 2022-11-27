package OOPS;

// throws keyword Function ke sath use kiya jata hai
import java.util.Scanner;

class MyExceptionT84 extends Exception{
    @Override
    public String toString() {
        return "Radius can not be negative!";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }

    public String ex(){
        return "Arithmetic Exception!";
    }
}
public class T084_ThrowVsThrows {
    public static float area(int a) throws MyExceptionT84{// ye method Exception throw krega, to jobhi ye use kre,
        if (a<0){
            //it can also be ki user galti se koi alphabet de da, to uske liya alag Exception generate krna pdega
            throw new MyExceptionT84();
        }
        return (float) Math.PI*a*a;// manlo agar radius negative supply kr di jati h to ye ek Exception hoga
    }
    public static int divide(int a,int b) throws ArithmeticException{// throws is used, ki ye method
        // ek Arithmetic Exception Throw kr skta h
        //made by Aryan
        return a/b;
    }

    public static void main(String[] args) {
        //Harry---> uses divide function created by Aryan
//        System.out.println(divide(5,0));// using Harry, yaha p exactly Harry ko moka mil gya
        // Aryan ki burayi krne ka, bcz upar vali line error show ki
        // now harry need to but the above line in try catch block (System.out.println(divide(5,0));)
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.print("Enter 'a' of format 'a/b' ---> ");
            int a= sc.nextInt();
            System.out.print("Enter 'b' of format 'a/b' ---> ");
            int b= sc.nextInt();
            try {
                System.out.println(divide(a, b));
                break;
            } catch (Exception e) {
                System.out.println("Arithmetic Exception");
            }
        }

        System.out.println();

        while (true) {
            System.out.print("Enter Radius ---> ");
            int radius = sc.nextInt();
            try {
                System.out.println(area(radius));
                break;
            } catch (MyExceptionT84 e) {
                System.out.println(e.ex());
            }
        }
    }
}