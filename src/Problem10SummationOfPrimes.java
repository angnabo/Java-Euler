import java.util.List;
/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 * Answer: 142915828921
 *
 * @author Anzhelika Nabozhina
 * @version 23/06/17.
 */
public class Problem10SummationOfPrimes {

    /**
     * Returns the sum of prime numbers below a given number
     * @param n primes smaller than this number are summed
     * @return the sum of prime number
     */
    public long summationOfPrimes(int n) {
        List<Integer> primes = MathFunctions.sieveOfEratosthenes(n);
        long sumOfPrimes = 0;
        for (int i: primes) {
            sumOfPrimes += i;
        }
        return sumOfPrimes;
    }

    public static void main(String[] args) {
        Problem10SummationOfPrimes prob10 = new Problem10SummationOfPrimes();
        System.out.println(prob10.summationOfPrimes(2000000));
    }
}
