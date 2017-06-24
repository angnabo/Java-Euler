/**
 * The sum of the squares of the first ten natural numbers is 12 + 22 + ... + 102 = 385
 * The square of the sum of the first ten natural numbers is (1 + 2 + ... + 10)^2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is
 * 3025 − 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * Answer: 25164150
 *
 * @author Anzhelika Nabozhina
 * @version 23/06/17.
 */
public class Problem06SumSquareDifference {

    public int sum_square_diff() {
        int sum_square = 0;
        int square_sum = 0;
        for (int i = 1; i <= 100; i++){
            sum_square += i * i;
            square_sum += i;
        }
        square_sum = square_sum * square_sum;
        return square_sum-sum_square;
    }

    public static void main(String[] args) {
        Problem06SumSquareDifference prob4 = new Problem06SumSquareDifference();
        System.out.println(prob4.sum_square_diff());
    }
}
