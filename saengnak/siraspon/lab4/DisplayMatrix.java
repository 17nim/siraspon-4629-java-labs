package saengnak.siraspon.lab4;

import java.util.Scanner;

/**
 * This program displays matrix in various ways.
 * 
 * @author Siraspon Saengnak
 * @version 4.0
 */
public class DisplayMatrix {
    static int[][] matrix;
    static int rowDim, colDim;

    static Scanner userInput = new Scanner(System.in);

    /**
     * Receives the size and the elements of the matrix.
     */
    public static void inputMatrix() {
        System.out.print("Enter the size of the matrix: ");
        String[] rowsAndColumns = userInput.nextLine().split(" ");

        if (rowsAndColumns.length != 2) {
            System.out.println("Please enter two numbers only!");
            System.exit(0);
        }

        rowDim = Integer.parseInt(rowsAndColumns[0]);
        colDim = Integer.parseInt(rowsAndColumns[1]);
        matrix = new int[rowDim][colDim];

        for (int i = 0; i < rowDim; i++) {
            for (int j = 0; j < colDim; j++) {
                System.out.print("Enter element at row " + (i + 1) + " column " + (j + 1) + ": ");
                matrix[i][j] = userInput.nextInt();
            }
        }
    }

    /**
     * Displays the original matrix.
     */
    public static void showMatrix() {
        System.out.println("Show the original matrix:");
        for (int i = 0; i < rowDim; i++) {
            for (int j = 0; j < colDim; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Displays the matrix, by row.
     */
    public static void showMatrixByRow() {
        System.out.print("Show the matrix, by row: ");
        for (int i = 0; i < rowDim; i++) {
            for (int j = 0; j < colDim; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }

    /**
     * Displays the matrix, by column.
     */
    public static void showMatrixByColumn() {
        System.out.print("Show the matrix, by column: ");
        for (int i = 0; i < colDim; i++) {
            for (int j = 0; j < rowDim; j++) {
                System.out.print(matrix[j][i] + " ");
            }
        }
        System.out.println();
    }

    /**
     * Displays the matrix, by row, backward.
     */
    public static void showMatrixByRowBackward() {
        System.out.print("Show the matrix, by row, backward: ");
        for (int i = rowDim - 1; i >= 0; i--) {
            for (int j = colDim - 1; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }

    /**
     * Displays the matrix, by column, backward.
     */
    public static void showMatrixByColumnBackward() {
        System.out.print("Show the matrix, by column, backward: ");
        for (int i = colDim - 1; i >= 0; i--) {
            for (int j = rowDim - 1; j >= 0; j--) {
                System.out.print(matrix[j][i] + " ");
            }
        }
        System.out.println();
    }

    /**
     * Displays the matrix, diagonally from top-left to bottom-right.
     */
    public static void showMatrixByDiagonalTopLeftBottomRight() {
        System.out.print("Show the diagonal elements of the matrix from top-left to bottom-right: ");
        for (int i = 0; i < rowDim && i < colDim; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
    }

    /**
     * Displays the matrix, diagonally from top-right to bottom-left.
     */
    public static void showMatrixByDiagonalTopRightBottomLeft() {
        System.out.print("Show the diagonal elements of the matrix from top-right to bottom-left: ");
        for (int i = 0; i < rowDim; i++) {
            System.out.print(matrix[i][colDim - 1 - i] + " ");
        }
        System.out.println();
    }
    
    /**
     * Displays the matrix, by row, zigzag.
     */
    public static void showMatrixByRowZigzag() {
        System.out.print("Show the matrix, by row, zigzag: ");
        for (int i = 0; i < rowDim; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < colDim; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                for (int j = colDim - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }

    /**
     * The main program.
     */
    public static void main(String[] args) {
        inputMatrix();
        showMatrix();
        showMatrixByRow();
        showMatrixByColumn();
        showMatrixByRowBackward();
        showMatrixByColumnBackward();
        showMatrixByDiagonalTopLeftBottomRight();
        showMatrixByDiagonalTopRightBottomLeft();
        showMatrixByRowZigzag();
        userInput.close();
    }
}

/*
 * This program 'DisplayMatrix' lets the user determine the size 
 * and elements of the matrix, and display it in various ways.
 * 
 * The matrix, which entered by the user, is stored by using
 * two-dimensional integer array.
 * 
 * Made by: Siraspon Saengnak
 * ID: 653040462-9
 * Sec: 2
 * Date: January 8, 2023
 */