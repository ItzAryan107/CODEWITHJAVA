package DataStructureAndAlgorithum.VIT.DSA.LABClasses;

import java.util.Scanner;

public class LC05_ReverseOfString {
    String string;

    LC05_ReverseOfString(String string){
        this.string = string;
    }

    public void reverse(){
        String rev = "";
        for (int i = string.length()-1;i>=0;i--){
            rev = rev + string.charAt(i);
        }
        System.out.println(rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String to Reverse ---> ");
        LC05_ReverseOfString test = new LC05_ReverseOfString(sc.nextLine());
        test.reverse();
    }
}
