package OOPS;

public class T027_ArrayForEachLoop {
    public static void main(String[] args) {
        int[] marks={98,97,78,56,74,87,40};
        System.out.println("Length of Array marks ---> "+marks.length);
        System.out.println();
        float[] mark={98.5f,97,78,56,74,87,40};
        System.out.println("Length of Array mark ---> "+mark.length);
        //printing using naive way
        System.out.println(mark[6]);
        // we can generate any data type of Array
        System.out.println();
        System.out.println("Displaying elements of Array using for loop--->");
        for(int i = 0;i<mark.length;i++) {
            System.out.println(mark[i]);
        }
        System.out.println();
        System.out.println("For Each Loop --->");
        String[] name1=new String[5];
        name1[0]="Aryan";
        name1[1]="Pallavi";
        name1[2]="Ashmit";
        name1[3]="Preeti";
        name1[4]="Manoj";
        for (String v:name1){
            System.out.println(v);
        }
    }
}
