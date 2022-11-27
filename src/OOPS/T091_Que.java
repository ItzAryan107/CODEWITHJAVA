package OOPS;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * Enter 10 names into a list. Write a program to delete first two character of the names and arrange the resulting
 * names in alphabetical order and print them out
 */
public class T091_Que {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number of Name's ---> ");
        int n= scanner.nextInt();
        System.out.format("Enter %d Name's ---> ",n);
        System.out.println();

        ArrayList<String> Name = new ArrayList<>();
        for(int i=0;i<n;i++){
            Name.add(scanner.next());
        }

        String modify;
        for (int i=0;i<n;i++){
            modify="";
            for(int j=2;j<Name.get(i).length();j++){
                modify=modify+Name.get(i).charAt(j);
            }
            Name.remove(i);
            Name.add(i,modify);
        }

        for (int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){// we can use .set(); also
                if(Name.get(i).charAt(0)>Name.get(j).charAt(0)){
                    Name.add(i,Name.get(j));
                    Name.remove(j+1);
                }
            }
        }
        System.out.println();
        System.out.println("Your sorted Name's ---> "+Name);
    }
}