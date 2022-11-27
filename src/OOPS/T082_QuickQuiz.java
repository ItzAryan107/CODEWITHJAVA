package OOPS;

import java.util.Scanner;

public class T082_QuickQuiz {
    public static void main(String[] args) {
        System.out.print("Enter the Number of Member You Have in Your family ---> ");
        Scanner sc = new Scanner(System.in);
        int NoMem= sc.nextInt();
        String[] FamilyMemberName=new String[NoMem];
        System.out.println("Enter Family Member Name According To Your Priority --->");
        for (int i =0;i<NoMem;i++){
            FamilyMemberName[i]= sc.next();
        }
        System.out.println();
        System.out.print("Enter Index of Particular Member According tp your Priority ---> ");
        boolean check=true;
        while (check) {
            int indPri = sc.nextInt();
            try {
                System.out.println("According To Your Priority ---> " + FamilyMemberName[indPri - 1]);
                check=false;
            } catch (ArrayIndexOutOfBoundsException Ari) {
                System.out.println("Error !!");
                System.out.print("Enter Valid Index ---> ");
            }
        }
    }
}