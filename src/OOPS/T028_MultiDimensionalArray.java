package OOPS;

public class T028_MultiDimensionalArray {
    public static void main(String[] args) {
        System.out.println("2-D Array");
        int[][]flats;
        flats=new int[2][3];
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;
        System.out.println("Printing 2-D Array using for loop");
        /*
                for(int i=0;i< flats.length;i++){
            for (int j = 0;j<flats[i].length;j++){
                System.out.print(flats[i][j]+" ");
            }
            System.out.println();
        }
         */
        for (int[] flat : flats) {
            for(int i : flat){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
