package OOPS;

import java.util.Scanner;

public class T022_DoWhileLoop {
    public static void main(String[] args) {
        System.out.println("DO WHILE LOOP --->");
        int a = 0;
        do{
            System.out.println(a);
            a++;
        }while (a<=5);
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many natural numbers you want --->");
        int n = sc.nextInt();
        int b = 1;
        do {
            System.out.println(b);
            b++;
        }while (b<=n);
    }
}
