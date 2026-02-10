import java.util.Scanner;

public class sumMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];
        int[][] b = new int[rows][cols];
        int[][] c = new int[rows][cols];

        // Input first matrix
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                a[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                b[i][j] = sc.nextInt();
            }
        }

        // Add matrices
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        // Print result matrix
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
