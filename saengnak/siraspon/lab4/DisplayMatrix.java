package saengnak.siraspon.lab4;

import java.util.Scanner;

public class DisplayMatrix {
    static int[][] matrix;
    static int rowDim, colDim;

    static Scanner userInput = new Scanner(System.in);

    static void inputMatrix() {
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

    static void showMatrix() {
        System.out.println("Show the original matrix:");
        for (int i = 0; i < rowDim; i++) {
            for (int j = 0; j < colDim; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void showMatrixByRow() {
        System.out.print("Show the matrix, by row: ");
        for (int i = 0; i < rowDim; i++) {
            for (int j = 0; j < colDim; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }

    static void showMatrixByColumn() {
        System.out.print("Show the matrix, by column: ");
        for (int i = 0; i < colDim; i++) {
            for (int j = 0; j < rowDim; j++) {
                System.out.print(matrix[j][i] + " ");
            }
        }
        System.out.println();
    }

    static void showMatrixByRowBackward() {
        System.out.print("Show the matrix, by row, backward: ");
        for (int i = rowDim - 1; i >= 0; i--) {
            for (int j = colDim - 1; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }

    static void showMatrixByColumnBackward() {
        System.out.print("Show the matrix, by column, backward: ");
        for (int i = colDim - 1; i >= 0; i--) {
            for (int j = rowDim - 1; j >= 0; j--) {
                System.out.print(matrix[j][i] + " ");
            }
        }
        System.out.println();
    }

    static void showMatrixByDiagonalTopLeftBottomRight() {
        System.out.print("Show the diagonal elements of the matrix from top-left to bottom-right: ");
        for (int i = 0; i < rowDim && i < colDim; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
    }

    static void showMatrixByDiagonalTopRightBottomLeft() {
        System.out.print("Show the diagonal elements of the matrix from top-right to bottom-left: ");
        for (int i = 0; i < rowDim; i++) {
            System.out.print(matrix[i][colDim - 1 - i] + " ");
        }
        System.out.println();
    }

    static void showMatrixByRowZigzag() {
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

