package DSA.VIT.DSA.LABClasses;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LC04_SortingOfNumericAndStringArray {
    Scanner sc = new Scanner(System.in);

    int[] integerArray;
    String[] stringArray;

    LC04_SortingOfNumericAndStringArray(){
        System.out.println("Enter String or length of Integer Array --->");
        try{
            String string = sc.nextLine();
//            int countSpace = 0;
//
//            if (string.charAt(0) == ' ')
//                countSpace = -1;
//
//            for (int i = 0;i<string.length()-1;i++){
//                if (string.charAt(i) ==' '&& string.charAt(i+1) != ' ')
//                    countSpace = countSpace+1;
//            }
//            stringArrayBuilt(countSpace+1,string);
        }catch (InputMismatchException e){
            integerArray = new int[sc.nextInt()];

            System.out.println("Enter data of Array --->");
            for (int i = 0; i< integerArray.length; i++){
                integerArray[i] = sc.nextInt();
            }

//            sortingNumericArray();
        }
    }

    private void stringArrayBuilt(int countSpace, String string){
        stringArray = new String[countSpace+1];
        int index = 0;
        String newString = "";
        for (int i = 0; i<string.length();i++){

            int j;
            for (j = i;j<string.length();j++){
                if (string.charAt(j) == ' ')
                    break;

                newString = newString+string.charAt(j);
            }
            stringArray[index] = newString;
            index++;
            newString="";
            i=j;
        }
        sortingStringArray();

        System.out.print("Sorted Array ---> [");
        for (int i = 0;i<stringArray.length-1;i++){
            System.out.print(stringArray[i]+" ");
        }
        System.out.println(stringArray[stringArray.length-1]+"]");
    }

    private void sortingStringArray(){
        String temp;
        for (int i=0;i<stringArray.length-1;i++){
            for (int j=i+1;j< stringArray.length;j++){
                temp = stringArray[i];
                if (stringArray[i].length()>stringArray[j].length()){
                    stringArray[i] = stringArray[j];
                    stringArray[j] = temp;
                }
            }
        }
    }

    private void sortingNumericArray(){
        int temp ;
        for (int i=0;i<integerArray.length-1;i++){
            for (int j = i+1;j<integerArray.length;j++){
                temp = integerArray[j];
                if (integerArray[i]>integerArray[j]){
                    integerArray[j] = integerArray[i];
                    integerArray[i] = temp;
                }
            }
        }

        System.out.println("Sorted Array ---> [");
        for (int i = 0;i<integerArray.length-1;i++){
            System.out.print(integerArray[i]+" ");
        }
        System.out.println(integerArray[integerArray.length-1]+"]");
    }

    public static void main(String[] args) {
        LC04_SortingOfNumericAndStringArray test = new LC04_SortingOfNumericAndStringArray();
    }


}
