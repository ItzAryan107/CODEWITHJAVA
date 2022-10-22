package CodeChef;
/**
 * You are given a String S and you have to tell if the string is good or bad.
 *
 * Good String - A string is said to be good if the string contains a contiguous substring of strictly greater than 2
 * in which all its characters are vowel.
 * note that, in english alphabet, vowel are a, e, i, o, u
 */

import java.util.Scanner;

public class ContiguousSubString {

    public boolean checkVowel(char a){
        return a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u';
    }

    public String operation(String string,int start, int end){
        if (start == string.length()-2)
            return "Bad";
        String newString = string.substring(start,end+1);
        if (checkVowel(newString.charAt(0)) && checkVowel(newString.charAt(1)) && checkVowel(newString.charAt(2)))
            return "Good";
        start++;
        end++;
        return operation(string,start,end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ContiguousSubString test = new ContiguousSubString();
        for (int i =0;i<n;i++){
            System.out.println(test.operation(sc.next(),0,2));
        }
    }
}
