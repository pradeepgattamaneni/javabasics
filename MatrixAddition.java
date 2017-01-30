import java.util.Scanner;

public class MatrixAddition {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the rows of the matrix: ");
    int m = input.nextInt();
    System.out.print("Enter the coloums of the matrix: ");
    int n = input.nextInt();

    int[][] a = new int[m][n];
    int[][] b = new int[m][n];

    System.out.println("Enter the values of first matrix: ");
    //you can write the entire matrix in a series seperated by space at once
    for(int i = 0; i < m ; i++) {
      for(int j = 0; j < n ; j++){
        a[i][j] = input.nextInt();
      }
    }
    System.out.println("Enter the values of second matrix: ");
    for(int i = 0; i < m ; i++) {
      for(int j = 0; j < n ; j++){
        b[i][j] = input.nextInt();
      }
    }
    int[][] sum = new int[m][n];

    for(int i = 0; i < m ; i++) {
      for(int j = 0; j < n ; j++){
        sum[i][j] = a[i][j] + b[i][j];
      }
    }
    System.out.print("\nThe sum of the matrixes are:\n");
    for(int i = 0; i < m ; i++) {
      for(int j = 0; j < n;j++) {
        System.out.print(sum[i][j] + " ");
      }
      System.out.println();
    }
  }
}