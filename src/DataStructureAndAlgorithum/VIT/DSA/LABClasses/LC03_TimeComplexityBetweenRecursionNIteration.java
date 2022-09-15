package DataStructureAndAlgorithum.VIT.DSA.LABClasses;

import java.util.Scanner;

public class LC03_TimeComplexityBetweenRecursionNIteration {

    int timeComplexityRecursive = 0;
    int timeComplexityIterative = 0;
    public int factorialRecursion(int n){
        if (n == 0 || n == 1)
            return 1;
        timeComplexityRecursive++;
        return n*factorialRecursion(n-1);
    }

    public void factorialIterative(int n){
        long p = 1;
        timeComplexityIterative = 0;
        for (int i = n;i>1;i--){
            p = p*i;
            timeComplexityIterative++;
        }
    }

    public static void main(String[] args) {
        LC03_TimeComplexityBetweenRecursionNIteration test = new LC03_TimeComplexityBetweenRecursionNIteration();
        System.out.println("\t\tTo find factorial");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number ---> ");
        int n = sc.nextInt();

        test.factorialRecursion(n);
        System.out.println("Time Complexity Of recursive Function ---> "+test.timeComplexityRecursive);
        test.factorialIterative(n);
        System.out.println("Time complexity Of Iterative Function ---> "+test.timeComplexityIterative);
    }
}