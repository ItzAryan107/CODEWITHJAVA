package OOPS;


public class T010_ResultingDataType {
    public static void main(String[] args) {
        System.out.println("Resulting data type ===>");
        int a = 654+5; // Resulting data type of 'a' will be integer
        float b = 6.5f+8+a;
        System.out.println("Resulting data type of 'b' is float --->"+b);
        System.out.println();
        System.out.println("Increment Decrement operator ===>");
        int i =56;
        System.out.println("'i' --->"+i);
        System.out.println("i++ ---> "+(i++));// means 'i' ko print karo or phir increase karo
        System.out.println("++i --->"+ ++i);// means 'i' ko increase karo phir 'i' ko print karo
        float j =76.9f;
        System.out.println("'j' --->"+ j);
        System.out.println("j-- --->"+ j--);
        System.out.println("--j --->"+--j);
        System.out.println();
        System.out.println("QUICK QUIZ ===>");
        int y =7;
        System.out.println("++y*8 --->"+ ++y*8);
        char z = 'B';
        System.out.println("z++ --->"+z++);
        System.out.println("z --->"+z);
        System.out.println(--z);
        System.out.println(--z);
        System.out.println(--z);
        System.out.println(--z);
        char t = '?';
        System.out.println(t);
        System.out.println((int)t);
    }
}
// LINk ---> https://www.youtube.com/watch?v=xGsUs3XQ0t0&list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q&index=10&ab_channel=CodeWithHarry