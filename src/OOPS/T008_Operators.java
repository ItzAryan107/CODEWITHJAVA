package OOPS;


public class T008_Operators {
    public static void main(String[] args)
    {
        System.out.println("OPERATORS ===>");
        System.out.println("1) Arithmetic operator --->");
        int a=4,b=a+6;// + ---> is a operator, = ---> is a assignment operator
        System.out.println("b=a+6 --->"+b);
        int c= 5,d = 2;
        double e = c%d; // % ---> gives remainder, can also return decimal remainder
        System.out.println("c%d --->"+e);
        System.out.println();
        System.out.println("2) Assignment operator --->");
        b += 4;// means, b m 4 jod do
        System.out.println("b += 4 --->"+b);
        b *= 4;
        System.out.println("b *= 4 --->"+b);
        System.out.println();
        System.out.println("3) Comparison operator --->");
        System.out.println("a==b --->"+(a==b));
        System.out.println();
        System.out.println("4) Logical operator --->");
        System.out.println("64>5 && 64 >7 --->"+(64>5 && 64>7));
        System.out.println("64>7 || 64<7 --->"+(64>7 || 64<7));
        System.out.println();
        System.out.println("5) Bitwise operator --->");
        int f = 10;
        int g = 11;
        System.out.println("f&g --->"+(f&g));
        System.out.println("f|g --->"+(f|g));
        System.out.println("bitwise operator works on bits");
    }
}
// link ---> https://www.youtube.com/watch?v=pnn2VTSr1Ko&list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q&index=13
