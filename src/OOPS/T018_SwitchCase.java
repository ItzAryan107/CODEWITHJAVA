package OOPS;

import java.util.Scanner;

public class T018_SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age --->");
        byte age = sc.nextByte();
        System.out.println();

        System.out.println("else if ---> statement");
        if(age>56){
            System.out.println("You are Experienced");
        }
        else if(age>46){
            System.out.println("You are semi-experienced");
        }
        else if(age>36){
            System.out.println("You are semi-semi-experienced");
        }
        else {
            System.out.println("You are not experienced");
        }
        System.out.println();
        System.out.println("Switch case ---> statement");
        // if we won't use break keyword in each cases' compiler will continue to compile all other cases even
        switch (age){
            case 18:
                System.out.println("You are going to become adult!");
                break;
            case 23:
                System.out.println("You are going to join a job!");
                break;
            case 68:
                System.out.println("You are going ot get retired!");
                break;
            default:
                System.out.println("Enjoy your life!");
        }
//        System.out.println();
    }
}
