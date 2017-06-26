import java.math.BigInteger;
/**
 * 215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * What is the sum of the digits of the number 21000?
 * Answer: 1366
 *
 * @author Anzhelika Nabozhina
 * @version 23/06/17.
 */
public class Problem16PowerSums {

    /**
     * Returns the sum of all digits of a number to the power of exponent.
     * @param number string for the number.
     * @param exponent int for number's exponent.
     * @return sum of the final number's digits.
     */
    public long powerSums(String number, int exponent){
        BigInteger num = (new BigInteger(number).pow(exponent));
        String[] arr = num.toString().split("");
        long sum = 0;
        for (String digit : arr){
            sum += Integer.parseInt(digit);
        }
        return sum;
    }

    public static void main(String[] args) {
        Problem16PowerSums prob4 = new Problem16PowerSums();
        System.out.print(prob4.powerSums("2", 1000));
    }
}
