import java.util.List;
/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10001st prime number?
 * Answer: 104743
 *
 * @author Anzhelika Nabozhina
 * @version 23/06/17.
 */
public class Problem07OneThousandAndFirstPrime{

    /**
     * Returns nth prime numbers using Sieve of Eratosthenes. Works well for finding small prime numbers.
     * @param n prime number
     * @return nth prime number
     */
    public long getOneThousandAndFirstPrime(int n) {
        int max = n*100; //max must be bigger than nth prime, most numbers are eliminated
        List<Integer> primes = MathFunctions.sieveOfEratosthenes(max);
        return primes.get(n-1);
    }

    public static void main(String[] args) {
        Problem07OneThousandAndFirstPrime prob7 = new Problem07OneThousandAndFirstPrime();
        System.out.println(prob7.getOneThousandAndFirstPrime(10001));
    }
}
