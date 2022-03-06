import java.io.FileReader;
import java.util.Scanner;

public class Program4 {
   public static void main(String args[]) throws Exception {
      Scanner sc = new Scanner(new FileReader("matrix1.txt"));
      int rows = 4;
      int columns = 4;
      int [][] A = new int[rows][columns];
      Scanner scanner = new Scanner(new FileReader("matrix2.txt"));
      int [][] B = new int[rows][columns];
      for(int i = 0; i < rows; i++){
          for(int j = 0; j < columns; j++){
              A[i][j] = sc.nextInt();
          }
      }
      for(int i = 0; i < rows; i++){
         for(int j = 0; j < columns; j++){
             B[i][j] = scanner.nextInt();
         }
     }
     System.out.println("Ma tran A: ");
     display(A, rows, columns);
     System.out.println("Ma tran B: ");
     display(B, rows, columns);
     System.out.println("Tong hai ma tran: ");
     tinhTong(A, B, rows, columns);
     System.out.println("Tinh hai ma tran: ");
     tinhTich(A, B, rows, columns);
     System.out.println("HIeu hai ma tran: ");
     tinhHieu(A, B, rows, columns);
   }
      public static void display(int[][] array, int rows, int columns){
         for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
               System.out.print(array[i][j] + "\t");
            }
               System.out.println("\n");
         }
      }
      public static void tinhTong(int[][] A, int[][] B, int rows, int columns){
         int[][] C = new int [rows][columns];
         for (int i = 0; i< rows;i++){
            for(int j = 0; j < columns; j++){
               C[i][j] = A[i][j] + B[i][j];
            }
         }
      display(C, rows, columns);
   }
      public static void tinhTich(int[][] A, int[][] B, int rows, int columns){
         int[][] D = new int[rows][columns];
         for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
               for (int k = 0; k < columns; k++) {
                  D[i][j] = D[i][j] + A[i][k] * B[k][j];
               }
            }
      }
      display(D, rows, columns);
   }
      public static void tinhHieu(int[][] A, int[][] B, int rows, int columns){
         int [][] E = new int[rows][columns];
         for (int i = 0; i < rows;i++){
            for (int j = 0; j< columns; j++){
               E[i][j] = A[i][j] - B[i][j];
            }
         }
         display(E, rows, columns);
   }
}