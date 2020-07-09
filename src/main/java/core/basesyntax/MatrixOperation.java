package core.basesyntax;

public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] mainDiagonal = new int[matrix.length];
        int g = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    mainDiagonal[g] = matrix[i][j];
                    g++;
                }
            }
        }
        return mainDiagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] mainDiagonal = new int[matrix.length];
        for (int i = matrix.length - 1; i >= 0; i--) {
            mainDiagonal[matrix.length - 1 - i] = matrix[matrix.length - 1 - i][i];
        }
        return mainDiagonal;
    }

    public int getMin(int[][] matrix) {
        int min = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == 0 && j == 0) {
                    min = matrix[i][j];
                } else if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == 0 && j == 0) {
                    max = matrix[i][j];
                } else if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
}
