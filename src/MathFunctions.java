import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/**
 * MathFuctions contains common mathematical functions used repeatedly for solving the problems
 * Created by angelica on 24/06/17.
 */
public class MathFunctions {

    /**
     * Returns n prime numbers using Sieve of Eratosthenes. Works well for finding small prime numbers.
     * @param max get primes below max
     * @return array of prime numbers
     */
    public static ArrayList<Integer> sieveOfEratosthenes(int max) {
        boolean[] sieve = new boolean[max];
        Arrays.fill(sieve,true);
        int i = 2;
        ArrayList<Integer> primes = new ArrayList<>();
        while(i < max){
            int j;
            if (sieve[i]) {
                for (j = (i*2); j < max-1; j += i) { //eliminates numbers with more than two multiples, skipping prime numbers
                    sieve[j] = false;
                }
                primes.add(i); //integer i is added if it is a prime number
            }
            i+=1;
        }
        return primes;
    }

    /**
     * Returns factors of a number
     * @param num number to get factors of
     * @return array of factors of the number
     */
    public static ArrayList<Long> getFactors(long num){
        long number = Math.round(Math.floor(Math.sqrt(num)));
        ArrayList<Long> factors = new ArrayList<>();
        for(long i = 1; i <= number; i++){
            if((num*1.0)%(i*1.0) == 0){ //if divisible
                factors.add(i);
                if (num/i != i) {
                    factors.add(num / i);
                }
            }
        }
        Collections.sort(factors);
        return factors;
    }

    /**
     * Returns factors of a number
     * @param num number to get factors of
     * @return array of factors of the number
     */
    public static ArrayList<Integer> getFactors(int num){
        int number = (int) Math.round(Math.floor(Math.sqrt(num)));
        ArrayList<Integer> factors = new ArrayList<>();
        for(int i = 1; i <= number; i++){
            if((num*1.0)%(i*1.0) == 0){ //if divisible
                factors.add(i);
                if (num/i != i) {
                    factors.add(num / i);
                }
            }
        }
        Collections.sort(factors);
        return factors;
    }

}
