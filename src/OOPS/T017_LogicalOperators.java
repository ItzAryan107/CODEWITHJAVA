package OOPS;

import java.util.Arrays;
import java.util.Scanner;

public class T017_LogicalOperators {
    public static void main(String[] args) {
        System.out.println("Logical Operators ===>");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter true\\false --->");
        boolean a = sc.nextBoolean();
        System.out.print("Enter true\\false --->");
        boolean b = sc.nextBoolean();
        System.out.println();
        System.out.println("&& ---> operator");
        if(a && b){
            System.out.println("Both boolean is true");
            System.out.println("Yes");
        }
        else {
            System.out.println("Either both boolean value is false or either of one boolean value is false");
            System.out.println("No");
        }
        System.out.println();
        System.out.println("|| ---> operator");
        if(a || b){
            System.out.println("Either both boolean value is true or either of one boolean value is true");
            System.out.println("yes");
        }
        else{
            System.out.println("Both boolean value is false");
            System.out.println("No");
        }
        System.out.println();
        System.out.println("! ---> operator");
        System.out.println("!a --->"+!a);
        System.out.println("!b --->"+!b);
    }
}