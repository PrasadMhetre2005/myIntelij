package DSAbyShraddha.TwoDArrays;

import java.util.Scanner;

public class print2DArrays {

    // Function to input 2D array
    public static int[][] input2dArray() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        return arr; // return the array
    }

    // Function to print 2D array
    public static void printArray(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        System.out.println("\nThe 2D Array is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = input2dArray(); // get array from user
        printArray(arr);              // print the array
    }
}
