package OOPS;

import java.util.Scanner;

public class T085_FinallySimpleTryBlock2 {
    public static int great(){
        Scanner sc=new Scanner(System.in);
        int a;
        int b=0;
        try {
            System.out.print("Enter value of a ---> ");
            a= sc.nextInt();
            try {
                System.out.print("Enter value of b ---> ");
                b = sc.nextInt();
            }catch (Exception e){
                System.out.println("Error!!");
            }
            return a/b;
        }catch (Exception e){
            System.out.println("Error!");
        }
        finally {// ye har hal m execute hoga, chahe tufan hi kyo n aa jye
            System.out.println("This is the End of the Program");
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(great());
    }
}
