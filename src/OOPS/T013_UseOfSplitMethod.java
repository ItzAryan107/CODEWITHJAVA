package OOPS;

import java.util.Scanner;

public class T013_UseOfSplitMethod {
    public static void counter(String sentence){
        int j;
        int countDouble=0;
        int countInteger=0;
        int countString=0;
        String[] strings=sentence.split(" ");
        for (String string : strings) {
            j = 0;
            for (int k = 0; k < string.length(); k++) {
                if (string.charAt(k) == '.') {
                    j++;
                }
            }
            if (j == 1)
                countDouble++;
            else {
                try {
                    Integer.parseInt(string);
                    countInteger++;
                } catch (NumberFormatException e) {
                    countString++;
                }
            }
        }
        System.out.println("string ---> "+countString);
        System.out.println("integer ---> "+countInteger);
        System.out.println("double ---> "+countDouble);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Sentence ---> ");
        counter(sc.nextLine());
    }
}