package OOPS;


import java.util.Scanner;

public class T082_NestedTryCatch {
    public static void main(String[] args) {
        int [] array=new int[5];
        array[0]=79;
        array[1]=56;
        array[2]=90;
        array[3]=90;
        array[4]=90;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Index Number ---> ");
        int ind= sc.nextInt();
        try{
            System.out.println("Welcome to Video No. 82");
            try {
                System.out.println(array[ind]);
            }catch (ArrayIndexOutOfBoundsException aie){
                System.out.println("Sorry This Index does not Exist");
                System.out.println("Exception In Level 2");
            }
        }catch (Exception e){
            System.out.println("Exception in level 1");
        }
    }
}