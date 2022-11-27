package OOPS;

public class T009_OperatorPrecedence {
    public static void main(String[] args) {
        System.out.println("In java BODMAS is not applicable, here precedence and associativity is applicable");
        int a = 6*5-34/2;
        /*
        =30 -34/2
        =30-17
        =13
         */
        System.out.println("6*5-34/2 --->"+a);
        int b = 60/5-34*2;
        /*
        =12-34*2
        =12-68
        =-56
         */
        System.out.println("60/5-34*2 --->"+b);
        System.out.println();
        System.out.println("QUICK QUIZ ===>");
        int x=6;
        int y=1;
        int k=x*y/2;
        System.out.println("x*y/2 --->"+k);
        int c=5;
        int l=b^2-(4*a*c)/(2*a);
        int m =b^2-4*a*c/2*a;
        System.out.println("b^2-4*a*c/2*a --->"+m);
        System.out.println("b^2-(4*a*c)/(2*a) --->"+l);
    }
}