import java.io.*;
import java.util.Scanner;

/**
 *
 * Find the maximum total from top to bottom of the triangle below:
 *
 * 75
 * 95 64
 * 17 47 82
 * 18 35 87 10
 * 20 04 82 47 65
 * 19 01 23 75 03 34
 * 88 02 77 73 07 63 67
 * 99 65 04 28 06 16 70 92
 * 41 41 26 56 83 40 80 70 33
 * 41 48 72 33 47 32 37 16 94 29
 * 53 71 44 65 25 43 91 52 97 51 14
 * 70 11 33 28 77 73 17 78 39 68 17 57
 * 91 71 52 38 17 14 91 43 58 50 27 29 48
 * 63 66 04 68 89 53 67 30 73 16 69 87 40 31
 * 04 62 98 27 23 09 70 98 73 93 38 53 60 04 23

 * Answer: 1074
 * The same algorithm also works for Problem 67. Answer: 7273.

 * Created by angelica on 24/07/17.
 */
public class Problem18MaximumPathSum {

    public int[][] readLines(String filename) throws IOException {

        File inFile = new File(filename);
        Scanner in = new Scanner(inFile);

        int[][] matrix = new int[101][100];

        int lineCount = 0;
        while (in.hasNextLine()) {
            String[] currentLine = in.nextLine().trim().split("\\s+");

            for (int i = 0; i < currentLine.length; i++) {
                matrix[lineCount][i] = Integer.parseInt(currentLine[i]);
            }
            lineCount++;
        }
        return matrix;
    }

    /**
     * Finds maximum path sum of a triangle matrix from bottom up.
     * @param matrix
     * @return maximum sum
     */
    public int maxPathSum(int[][] matrix) {

        for (int i = matrix.length-3; i >= 0; i--){//counts down from the second-to-last row up
            for (int j = 0; j < matrix.length-2; j++){ //iterates columns
                int left =  matrix[i][j] + matrix[i+1][j];
                int right =  matrix[i][j] + matrix[i+1][j+1];
                int sum = ( left > right) ? left : right; //sum is assigned to be the bigger number
                if (matrix[i][j] < sum) {
                    matrix[i][j] = sum;
                }

            }
        }
        return matrix[0][0];
    }


    public static void main(String[] args) {
        Problem18MaximumPathSum prob4 = new Problem18MaximumPathSum();
        int[][] array;
        try {
            array = prob4.readLines("src/68triangle.txt");
            System.out.println(prob4.maxPathSum(array));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
