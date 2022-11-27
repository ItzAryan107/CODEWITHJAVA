package OOPS;


import java.util.Scanner;

public class T005_GettingUserInput {
    public static void main(String[] args) {
        System.out.println("Getting user Input in Java --->");
        System.out.println();
        Scanner sc = new Scanner(System.in);// System.in ---> means reading input from keyboard
        Scanner t = new Scanner(System.in);// creating Scanner object t
        // nextInt(), nextFloat() vagara vagara ---> methods hote h Scanner class ke ander, to take different data types of input
        System.out.print("Enter number 1 ---> ");
//        int a = sc.nextInt();
//        boolean b1 = sc.hasNextFloat(); // (it used to know whether user entered the valid input or not)
//        System.out.println(b1);
        float a = sc.nextFloat();
//        System.out.println(a);
        System.out.print("Enter number 2 ---> ");
//        int b = sc.nextInt();
        float b = sc.nextFloat();
//        int sum = a+b;
        float sum = a + b;
        System.out.print("The sum ur given two number is ---> ");
        System.out.println(sum);
        System.out.println();
        System.out.print("Enter your string ---> ");
        String str = sc.next();// this is used to read a string(it can't read (Aryan is a good boy)(either it will read the first string, means till the first space find))
        System.out.println(str);
        System.out.println();
        // to read a line of String
        System.out.print("Enter the string ---> ");
        String s = t.nextLine();
        System.out.println(s);
    }
}
// Link for Tut5 --->https://www.youtube.com/watch?v=HRfmLqqvzUs&list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q&index=5
