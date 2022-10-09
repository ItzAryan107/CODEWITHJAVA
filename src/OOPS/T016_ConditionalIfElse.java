package OOPS;

import java.util.Scanner;

public class T016_ConditionalIfElse {
    public static void main(String[] args) {
        System.out.println("if-else statement ===>");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age, to know u can drive any vehicle or not --->");
        byte age = sc.nextByte();
        if(age<18)
        {
            System.out.println("No boy u can not drive now");
        }
        else
        {
            System.out.println("You can use any vehicle");
        }
        System.out.println();
        System.out.println("Relational operators");
        if(age != 18){
            System.out.println("You are not at the age of 18");
        }
        else
        {
            System.out.println("Your age ---> 18");
        }
    }
}
