package OOPS;

import java.util.Scanner;

public class T080_ArrayOutOfBondException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number of Element You want to in Array ---> ");
        int n= sc.nextInt();
        String[] Name=new String[n];
        for (int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+" Element of Array ---> ");
            Name[i]= sc.next();
        }
        while (true) {
            System.out.print("Enter The Element you want ---> ");
            int e = sc.nextInt();
            try {
                System.out.println(Name[e-1]);
                break;
            } catch (Exception a) {
                System.out.println(a + "\nEnter valid Input ---> ");
            }
        }
    }
}