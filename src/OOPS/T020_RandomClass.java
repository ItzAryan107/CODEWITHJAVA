package OOPS;

import java.util.Random;
import java.util.Scanner;

public class T020_RandomClass {
    public static void main(String[] args) {
        Random r = new Random();
        int n1 = r.nextInt();
        System.out.println("Generating any random number without any bound --->"+n1);
        System.out.println();
        int n2 = r.nextInt(6);// it will give random number between 0 and 5
        System.out.println("Generating random number with a bound limit 0 to 5--->"+n2);
        // at every run compiler will print new random number
        System.out.println();
        int n3 = 6 + r.nextInt(5);// r.nextInt(); ---> will give random number between 0 and 4(excluding 5)
        // upper format is something like---> starting number + r.nextInt((ending number+1) - starting number);
        System.out.println("Generating any random number between 6 to 10 --->"+n3);
        System.out.println();
        // 1000 to 9999
        int n4 = r.nextInt(9000)+1000;
        System.out.println("Generating random number between 1000 to 9999 ---> "+n4);
        System.out.println();
        System.out.println("Using Function and Scanner class ===>>");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number ---> ");
        int a = sc.nextInt();
        System.out.print("Enter Ending number ---> ");
        int b = sc.nextInt();
        int c= rndnum(a,b);
        System.out.println("Random number ---> "+c);
    }
    public static int rndnum(int start,int finish){
        Random rd = new Random();
        // generating number from 6 to 10(including 10)
        int rn = rd.nextInt((finish+1)-start)+start;
        return rn;
        /*
        one more format ---> for above function
        {
            return (
                new random().nextInt((finish+1)-start)+start);
         }
         */
    }
}