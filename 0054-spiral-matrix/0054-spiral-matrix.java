import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> res = new ArrayList<>();

        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

            // Top
            for (int j = startCol; j <= endCol; j++) {
                res.add(matrix[startRow][j]);
            }
            startRow++;

            // Right
            for (int i = startRow; i <= endRow; i++) {
                res.add(matrix[i][endCol]);
            }
            endCol--;

            // Bottom
            if (startRow <= endRow) {
                for (int j = endCol; j >= startCol; j--) {
                    res.add(matrix[endRow][j]);
                }
                endRow--;
            }

            // Left
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    res.add(matrix[i][startCol]);
                }
                startCol++;
            }
        }

        return res;
    }

    public static void main(String[] args) {

        Solution sol = new Solution();

        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        System.out.println(sol.spiralOrder(matrix));
    }
}