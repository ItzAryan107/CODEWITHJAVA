package OOPS;

import java.util.Scanner;

public class T026_Array {
    public static void main(String[] args) {
        System.out.println("To take array from user using for loop --->");
        int [] m = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<5;i++){
            System.out.print("Enter "+(i+1)+" Integer ---> ");
            m[i]= sc.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.print(m[i]+" ");
        }
        System.out.println();
        System.out.println();
        System.out.println("First way to declare Array");
        // declaration + memory allocation
        int[]marks = new int[5];
        marks[0]=100;
        marks[1]=52;
        marks[2]=73;
        marks[3]=74;
        marks[4]=47;
//        marks[5]=78; ---> this will throw error
        System.out.println(marks[4]);
        System.out.println();
        System.out.println("Second way to declare Array");
        // declaration + memory allocation + initialization
        String[]name= {"Aryan","Prajapati","Pallavi","Prajapati"};
        System.out.println(name[3]);
        System.out.println();
        System.out.println("Third way to declare Array");
        int[]num;// ---> declaration
        num=new int[3];// ---> memory allocation
        num[0]=15;
        num[1]=65;
        num[2]=98;
        System.out.println(num[2]);
    }
}
