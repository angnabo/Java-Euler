import java.math.BigInteger;

/**
 *
 * n! means n × (n − 1) × ... × 3 × 2 × 1
 *
 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 *
 * Find the sum of the digits in the number 100!
 *
 * Answer:648
 *
 * Created by angelica on 20/09/17.
 */
public class Problem20FactorialDigitSum {


    public BigInteger factorial(int num) {
        BigInteger integer = new BigInteger(Integer.toString(num));
        if (num == 1) {
            return integer;
        } else {
            return integer.multiply(factorial(num - 1));
        }
    }

    public long factorialSum(String num){
        long sum = 0;
        String[] array = num.split("");
        for (String s : array) {
            sum += Long.parseLong(s);
        }
        return sum;
    }

    public static void main(String[] args) {
        Problem20FactorialDigitSum prob20 = new Problem20FactorialDigitSum();
        System.out.print(prob20.factorialSum(prob20.factorial(100).toString()));

    }
}
