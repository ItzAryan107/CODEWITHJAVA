package OOPS;

import java.util.Scanner;

public class T031_Function {
    static int logic(int x,int y){
        int z;
        if(x>y)
            z=x+y;
        else
            z=(x+y)*5;
        return z;
    }
    int ar(int x,int y){
        int z;
        z=x+y;
        return z;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ---> ");
        int x=sc.nextInt();
        System.out.print("Enter b ---> ");
        int y=sc.nextInt();
        // A function can be called by making its object or by calling it directly
        int c=logic(x,y);// calling function directly
        /*
        if I am calling a function in main function
        I can ony call static function, if I am calling that particular function without making its object
         */
        System.out.println("Without making object ---> "+c);
        System.out.println();
        T031_Function obj=new T031_Function();
        System.out.println("Sum(by making object) ---> "+obj.ar(x,y));
    }
}
