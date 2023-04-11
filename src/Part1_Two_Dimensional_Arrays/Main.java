package Part1_Two_Dimensional_Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initializing arrays
        int[][] array1 = initializeArray1(5, 5, 5);
        int[][] array2 = initializeArray2(5, 5);
        int[][] array3 = initializeArray3(5, 5);
        int[][] array4 = initializeArray4(5, 5);
        int[][] array5 = initializeArray5(5, 5);
        // Printing arrays
        printArray(array1);

        printArray(array2);

        printArray(array3);

        printArray(array4);

        printArray(array5);
    }

    // Initializing functions for initializing and printing the arrays
    public static int[][] initializeArray1(int N, int M, int value) {
        int[][] array = new int[N][M];
        for (int i = 0; i < N; i++) {
            Arrays.fill(array[i], value); // Trying out the Arrays.fill function
        }
        return array;
    }

    public static int[][] initializeArray2(int N, int M) {
        int[][] array = new int[N][M];
        for (int i = 0; i < N; i++) { // Outer loop for rows
            for (int j = 0; j < M; j++) { // Inner loop for columns
                array[i][j] = j;
            }
        }
        return array;
    }

    public static int[][] initializeArray3(int N, int M) {
        int[][] array = new int[N][M];
        int k = 0;
        for (int i = 0; i < N; i++) { // Outer loop for rows
            for (int j = 0; j < M; j++) { // Inner loop for columns
                array[i][j] = k;
                k++;
            }
        }
        return array;
    }

    public static int[][] initializeArray4(int N, int M) {
        int[][] array = new int[N][M];
        int k = (N * M) - 1;
        for (int i = N - 1; i >= 0; i--) { // Outer loop for rows
            for (int j = 0; j < M; j++) { // Inner loop for columns
                array[i][j] = k;
                k--;
            }
        }
        return array;
    }

    public static int[][] initializeArray5(int N, int M) {
        int[][] array = new int[N][M];
        int k = (N * M) - 1;
        for (int i = 0; i < N; i++) { // Outer loop for rows
            for (int j = 0; j < M; j++) { // Inner loop for columns
                array[i][j] = k;
                k--;
            }
        }
        return array;
    }

    public static void printArray(int[][] array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();   // Creating space between each array
        System.out.println();
    }
}