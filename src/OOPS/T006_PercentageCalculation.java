package OOPS;

import java.util.Scanner;

/**
 * Que --->
 * WAP to calculate percentage of a given student in CBSE board exam. His marks for
 * five subjects must be taken as in put from the user(marks are out of 100)
 */
public class T006_PercentageCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CBSE");
        System.out.println();
        System.out.print("Enter the student name --->");
        String n= sc.nextLine();
        System.out.print("Enter First subject marks --->");
        float a = sc.nextFloat();
        System.out.print("Enter Second subject marks --->");
        float b = sc.nextFloat();
        System.out.print("Enter Third subject marks --->");
        float c = sc.nextFloat();
        System.out.print("Enter Fourth subject marks --->");
        float d = sc.nextFloat();
        System.out.print("Enter Fifth subject marks --->");
        float e = sc.nextFloat();
        float p =(a+b+c+d+e)/5;
        System.out.println();
        System.out.println("Percentage of "+n+"--->"+p);
    }
}