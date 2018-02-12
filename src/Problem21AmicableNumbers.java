import java.util.ArrayList;
import java.util.List;

/**
 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
 * If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.
 *
 * For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284.
 * The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
 *
 * Evaluate the sum of all the amicable numbers under 10000.
 *
 * Answer: 31626
 *
 * Created by angelica on 21/09/17.
 */
public class Problem21AmicableNumbers {

    /**
     *
     * @return
     */
    public long amicableNums() {
        long ttlSum = 0;
        long a = 1;
        ArrayList<Long> amicables = new ArrayList<>();
        while (a < 10000) {

            if (!amicables.contains(a)) {

                long sumFactorsA = 0;
                List<Long> arrayA = MathFunctions.getFactors(a);
                for (int j = 0; j < arrayA.size() - 1; j++) {
                    sumFactorsA += arrayA.get(j);
                }

                long sumFactorsB = 0;
                List<Long> arrayB = MathFunctions.getFactors(sumFactorsA);
                for (int j = 0; j < arrayB.size() - 1; j++) {
                    sumFactorsB += arrayB.get(j);
                }

                if (a == sumFactorsB && a != sumFactorsA) {
                    ttlSum += (a + sumFactorsA);
                    amicables.add(sumFactorsA);
                }

                a++;
            } else {
                a++;
            }
        }
        return ttlSum;
    }

    public static void main(String[] args) {
        Problem21AmicableNumbers prob21 = new Problem21AmicableNumbers();
        System.out.print(prob21.amicableNums());
    }

}
