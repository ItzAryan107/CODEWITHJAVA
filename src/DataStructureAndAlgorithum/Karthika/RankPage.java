package DataStructureAndAlgorithum.Karthika;

import java.util.Scanner;

public class RankPage {

    public static int rank(int rank){
        if (rank%25 == 0)
            return rank/25;

        return (rank/25) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0;i<n;i++){
            System.out.println(rank(sc.nextInt()));
        }
    }
}
