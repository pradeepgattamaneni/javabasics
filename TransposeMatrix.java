import java.util.Scanner;

public class TransposeMatrix {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the rows of the matrix: ");
    int m = input.nextInt();
    System.out.print("Enter the coloums of the matrix: ");
    int n = input.nextInt();

    int[][] a = new int[m][n];

    System.out.println("Enter the values of first matrix: ");
    //you can write the entire matrix in a series seperated by space at once
    for(int i = 0; i < m ; i++) {
      for(int j = 0; j < n ; j++){
        a[i][j] = input.nextInt();
      }
    }

    /*int[][] aT = new int[n][m];
    for(int i = 0; i < m ; i++) {
      for (int j = 0; j < n; j++) {
        aT[j][i] = a[i][j];
      }
    }*/
    System.out.print("\nThe tanspose of the matrix is\n");
    for(int i = 0; i < n ; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(a[j][i]+" ");
      }
      System.out.println();
    }
  }
}