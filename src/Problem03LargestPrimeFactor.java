import java.util.ArrayList;
/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * This algorithm finds the largest prime factor of the number 600851475143.
 * Answer:6857
 * @author Anzhelika Nabozhina
 * @version 23/06/17.
 */
public class Problem03LargestPrimeFactor{

    /**
     * Returns the largest prime number from an array
     * @param integerArray ArrayList of longs
     * @return largest prime number in array
     */
    public long getPrime(ArrayList<Long> integerArray) {
        long primeNumber = 0;
        for (int i = integerArray.size()-1; i > 0; i--){
            ArrayList<Long> factorsAr = MathFunctions.getFactors(integerArray.get(i));
            if (factorsAr.size() == 2){
                primeNumber = factorsAr.get(1);
                break;
            }
        }
        return primeNumber;
    }

    public static void main(String[] args) {
        Problem03LargestPrimeFactor prob3 = new Problem03LargestPrimeFactor();
        System.out.println(prob3.getPrime(MathFunctions.getFactors(600851475143L)));
    }
}
