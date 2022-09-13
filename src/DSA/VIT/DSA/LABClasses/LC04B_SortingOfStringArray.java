package DSA.VIT.DSA.LABClasses;

import java.util.Scanner;

public class LC04B_SortingOfStringArray {
    String[] array;

    LC04B_SortingOfStringArray(String string){
        int countSpace = 0;
        for (int i = 0;i<string.length();i++){
            if (string.charAt(i) ==' ')
                countSpace = countSpace+1;
        }

        array = new String[countSpace+1];
        int index = 0;
        String newString = "";
        for (int i = 0; i<string.length();i++){

            int j;
            for (j = i;j<string.length();j++){
                if (string.charAt(j) == ' ')
                    break;

                newString = newString+string.charAt(j);
            }
            array[index] = newString;
            index++;
            newString="";
            i=j;
        }
    }

    public void sorting(){
        String temp;
        for (int i=0;i<array.length-1;i++){
            for (int j=i+1;j< array.length;j++){
                temp = array[i];
                if (array[i].length()>array[j].length()){
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        print();
    }

    public void print(){

        System.out.print("Sorted String ---> [");
        for (int i=0;i< array.length-1;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println(array[array.length-1]+"]");
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter String ---> ");
        LC04B_SortingOfStringArray test = new LC04B_SortingOfStringArray(sc.nextLine());
        test.sorting();
    }
}
