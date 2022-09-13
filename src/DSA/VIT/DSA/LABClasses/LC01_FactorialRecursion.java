package DSA.VIT.DSA.LABClasses;

import java.util.Scanner;

public class LC01_FactorialRecursion {

    public int factorial(int n){
        if ( n == 0 || n == 1)
            return 1;

        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        LC01_FactorialRecursion lc01_factorialRecursion = new LC01_FactorialRecursion();
        System.out.print("Enter Number ---> ");
        System.out.println(lc01_factorialRecursion.factorial(sc.nextInt()));
    }
}
