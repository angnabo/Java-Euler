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

    public int sumSquareDifference(int num) {
        int sumOfSquare = 0;
        int squareSum = 0;
        for (int i = 1; i <= num; i++){
            sumOfSquare += i * i;
            squareSum += i;
        }
        squareSum = squareSum * squareSum;
        return squareSum-sumOfSquare;
    }

    public static void main(String[] args) {
        Problem06SumSquareDifference prob4 = new Problem06SumSquareDifference();
        System.out.println(prob4.sumSquareDifference(100));
    }
}
