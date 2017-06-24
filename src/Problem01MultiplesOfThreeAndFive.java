/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * This algorithm finds the sum of all the multiples of 3 and 5 below 1000.
 * Answer: 233168
 * @author Anzhelika Nabozhina
 * @version 23/06/17.
 */
public class Problem01MultiplesOfThreeAndFive {

    /**
     * Returns the sum of all multiples of 3 and 5 below a given number
     * @param number integer
     * @return total sum of the multiples
     */
    public int multiples(int number){
        int ttlSum = 0;
        for (int i = 1; i < number; i++) {
            if (i % 3 == 0) {
                ttlSum += i;
            } else if (i % 5 == 0) {
                ttlSum += i;
            }
        }
        return ttlSum;
    }

    public static void main(String[] args) {
        Problem01MultiplesOfThreeAndFive prob1 = new Problem01MultiplesOfThreeAndFive();
        System.out.println(prob1.multiples(1000));
    }
}
