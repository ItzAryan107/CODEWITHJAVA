package OOPS;

import java.util.Scanner;

public class T013_Strings {
    public static void main(String[] args) {
        System.out.println("STRING ===>");
        System.out.println("To make String --->");
        String name = new String("Aryan");
        System.out.println("Using String as class --->"+name);
        /*
        Java has a special function, which let us use string as data type.
        Actually, String is a class in java, but java provide a special support to String
        which can be used as primitive data type
        Strings are immutable and can not be changed
         */
        String n = "Ashmit";
        System.out.println("Using String as primitive data type --->"+n);
        System.out.println();
        System.out.println("Different ways to print in java ===>");
        System.out.println("System.out.printf(); --->");// printf is used for format specifier
        int a = 6;
        float b=5.6454f;
        String d= "Aryan";
        System.out.printf("The value of a is %d and value of b is %f name is %s",a,b,d);
        System.out.println();
        System.out.printf("The value of a is %d and value of b is %2f name is %s",a,b,d);
        System.out.println();
        System.out.printf("The value of a is %d and value of b is %8.2f name is %s",a,b,d);
        System.out.println();
        System.out.printf("My name is---> %S My brother's name is ---> %S",d,n);
        // %s --> jasa h vasa hi print kr dega, %S ---> sbko capital kr dega
        System.out.println();
        System.out.println();
        System.out.println("System.out.format ---> ");
        /*
        System.out.printf(); and System .out.format();
        both get use in the same way
         */
        System.out.println();
        System.out.println("Taking String input using Scanner ---> ");
        System.out.print("Enter set of Strings ---> ");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(st);
        System.out.print("Enter a String ---> ");
        String st1 = sc.next();
        System.out.println(st1);
    }
}