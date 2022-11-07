package LeetCode;
import java.util.Scanner;

public class ReverseInteger {
    public boolean inRange(int num){
        return num >= Integer.MIN_VALUE / 10 && num <= Integer.MAX_VALUE / 10;
    }

    int rev = 0;
    public int reverse(int x) {
        if(x == 0){
            return rev;
        }
        if(!inRange(rev)){
            return 0;
        }
        rev = rev * 10 + (x%10);
        x = x /10;
        return reverse(x);
    }

//    public int reverseRecursive(int num){
//        if (num>=0 && num<=9){
//            rev = rev * 10 + num;
//            return  rev;
//        }
//
//        int a = num%10;
//        rev = rev*10+a;
//        reverseRecursive(num/10);
//        return rev;
//    }

    public static void main(String[] args){
        ReverseInteger test = new ReverseInteger();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(test.reverse(n));
    }
}