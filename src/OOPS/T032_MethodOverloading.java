package OOPS;

public class T032_MethodOverloading {
    static void change(int a) {
        a=40;
//        System.out.println(a);
    }

    static void change2(int []arr){
        arr[0]=98;
    }

    static void tellJava() {// void return type
        System.out.println("I invented a new world!\n"+"Plagiarism!");
    }

    static void poo(){
        System.out.println("Good morning bro!");
    }
    static void poo(int a){
        System.out.println("Good morning "+a+" bro!");
    }
    static void poo(float b){
        System.out.println("Good morning "+b+" bro!");
    }
    static int poo(int c,int d){// here c and d is parameter
        int z=c+d;
        return z;
    }

    public static void main(String[] args) {
        tellJava();
        System.out.println();
        System.out.println("Changing the integer ===>");
        int x= 25;
        change(x);
        System.out.println("The value of x after changing ---> "+x);// integer couldn't get change
        System.out.println();
        System.out.println("Changing the Array ===>");
        int[] marks={12,65,90,87,67,89};
        change2(marks);
        System.out.println("First element of array got change ---> "+marks[0]);
        System.out.println();
        System.out.println("Function Overloading ===>");
        poo();
        poo(300);
        System.out.println("Sum --->"+poo(43,78));// here 43 nad 78 is argument, argument are actual
        // data type of parameter and number of parameter matters the overloading, return type won't matter overloading
    }
}
