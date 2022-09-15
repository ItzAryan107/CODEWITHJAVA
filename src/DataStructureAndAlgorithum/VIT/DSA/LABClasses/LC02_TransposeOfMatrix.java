package DataStructureAndAlgorithum.VIT.DSA.LABClasses;

import java.util.Scanner;

public class LC02_TransposeOfMatrix {
    Scanner sc =new Scanner(System.in);
    int [][] transposeMatrix;
    public int[][] inputMatrix(int n){
        int[][] matrix = new int[n][n];
        System.out.println("Enter all matrix data --->");
        for (int i =0;i<matrix.length;i++){
            for (int j = 0;j<matrix[i].length;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Your Given Matrix --->");
        print(matrix);

        return matrix;
    }

    public void print(int[][] matrix){
        for (int i = 0;i< matrix.length;i++){
            for (int j = 0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    int timeComplexity=0;
    public void matrixToTranspose(){
        System.out.print("Enter Dimension of Matrix ---> ");
        int[][] matrix = inputMatrix(sc.nextInt());
        transposeMatrix = new int[matrix.length][matrix.length];
        for (int i = 0;i<matrix.length;i++){
            for (int j = 0;j<matrix[i].length;j++){
                transposeMatrix[i][j] = matrix[j][i];
                timeComplexity++;
            }
        }

        System.out.println();
        System.out.println("Transpose of youe given matrix --->");
        print(transposeMatrix);
        System.out.println();

        System.out.println("Time Complexity ---> "+timeComplexity);
    }


    public static void main(String[] args) {
        LC02_TransposeOfMatrix lc02_transposeOfMatrix = new LC02_TransposeOfMatrix();
        lc02_transposeOfMatrix.matrixToTranspose();
    }
}
