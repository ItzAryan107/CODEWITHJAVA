package OOPS;

public class T065_CreatingPackage {
    public static void main(String[] args) {
        System.out.println("Another Way to use Java Scanner");
        System.out.println("java.util.Scanner sc=new java.util.Scanner(System.in);");
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.print("Enter Integer ---> ");
        System.out.println("This is the Taken input --> "+sc.nextInt());
    }
}