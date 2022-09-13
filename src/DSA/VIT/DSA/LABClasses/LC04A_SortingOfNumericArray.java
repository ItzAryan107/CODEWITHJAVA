package DSA.VIT.DSA.LABClasses;

import java.util.Scanner;

public class LC04A_SortingOfNumericArray {
    Scanner sc  =new Scanner(System.in);
    int[] array ;

    LC04A_SortingOfNumericArray(int n){
        System.out.println("Enter data of Array --->");
        array = new int[n];
        for (int i = 0;i<array.length;i++){
            array[i] = sc.nextInt();
        }
    }

    public void sorting(){
        int temp ;
        for (int i=0;i<array.length-1;i++){
            for (int j = i+1;j<array.length;j++){
                temp = array[j];
                if (array[i]>array[j]){
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.print("Sorted Array ---> [");
        print();
    }

    public void print(){
        for (int i = 0;i<array.length-1;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println(array[array.length-1]+"]");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Length of Array ---> ");
        LC04A_SortingOfNumericArray test = new LC04A_SortingOfNumericArray(scanner.nextInt());
        test.sorting();

    }
}
