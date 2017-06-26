/**
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
 * there are exactly 6 routes to the bottom right corner.
 * How many such routes are there through a 20×20 grid?
 *
 * Answer: 137846528820
 * @author Anzhelika Nabozhina
 * @version 23/06/17.
 */
public class Problem15LatticePaths {

    /**
     * Return a matrix with first row and column all 1s
     * @param size of the matrix
     * @return matrix
     */
    public long[][] createMatrix(int size) {
        long matrix[][] = new long[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][0] = 1;
            matrix[0][i] = 1;
        }
        return matrix;
    }

    /**
     * Returns the total number of available paths for a grid
     * @param array matrix of longs
     * @return total paths from top left to bottom right corner
     */
    public long latticePaths(long[][] array) {//The matrix size must be one more than the grid,
        // as the row and column of 1's are points on the grid rather than cells
        int size = array.length;
        for (int row = 1; row < size; row++){
            for (int col = 1; col < size; col++){
                array[row][col] = (array[row][col-1] + array[row-1][col]);
            }
        }
        return array[size-1][size-1];
    }

    public static void main(String[] args) {
        Problem15LatticePaths prob15 = new Problem15LatticePaths();

        long[][] matrix = prob15.createMatrix(21);//For a 20x20 grid, the matrix will me 21x21
        System.out.println(prob15.latticePaths(matrix));
    }
}
