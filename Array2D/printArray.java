package Array2D;

import java.util.Scanner;

public class printArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        // int[][] a = {
        //     {2,5,1,7},
        //     {8,-2,0,5},
        //     {-9,-1,3,2}
        // };
       int [][] a = new int[rows][cols];

        for(int i=0; i<a.length; i++){
            for(int j=0; j <a[i].length; j++){
                a[i][j] = sc.nextInt();     
            }
        }
        for(int i=0; i<a.length; i++){
            for(int j=0; j <a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
