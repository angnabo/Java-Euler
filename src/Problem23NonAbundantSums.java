import java.util.ArrayList;

/**
 * A perfect number is a number for which the sum of its proper divisors is exactly equal to the number.
 * For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28,
 * which means that 28 is a perfect number.
 *
 * A number n is called deficient if the sum of its proper divisors is less than n and it is called abundant
 * if this sum exceeds n.
 *
 * As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16,
 * the smallest number that can be written as the sum of two abundant numbers is 24.
 *
 * By mathematical analysis, it can be shown that all integers greater than 28123 can be written as the sum of
 * two abundant numbers. However, this upper limit cannot be reduced any further by analysis even though it is known
 * that the greatest number that cannot be expressed as the sum of two abundant numbers is less than this limit.
 *
 * Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.
 *
 * Answer: 4179871
 *
 * Created by angelica on 26/09/17.
 */
public class Problem23NonAbundantSums {

    /**
     * Get all abundant numbers below a given number
     * @param num
     * @return array of abundant numbers
     */
    public ArrayList<Integer> getAbundantNumbers(int num){
        ArrayList<Integer> abundantNums = new ArrayList<>();
        for(int i = 2; i < num; i++){
            ArrayList<Integer> n = MathFunctions.getFactors(i);
            n.remove(n.size()-1);//remove the last number(the number itself)
            if(addArray(n) > i){
                abundantNums.add(i);
            }
        }
        return abundantNums;
    }

    /**
     * Sum up elements of an integer array
     * @param array
     * @return sun
     */
    public int addArray(ArrayList<Integer> array){
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    /**
     * Get the sum of all positive integers which cannot be written as the sum of two abundant numbers.
     * @param num the number below which to find the integers
     * @return sum
     */
    public int getNonAbundantSums(int num){
        // get abundant numbers before the number
        ArrayList<Integer> abundantNums = getAbundantNumbers(num);
        // create a boolean array the size of the given number + 1
        boolean[] sumsOfAbundantNums = new boolean[num+1];
        // add all abundant numbers against each other and populate the array with their sums
        for (int i = 0; i < abundantNums.size()-1; i++) {
            for (int j = 0; j < abundantNums.size()-1; j++) {
                if (abundantNums.get(i) + abundantNums.get(j) <= num) {
                    sumsOfAbundantNums[abundantNums.get(i) + abundantNums.get(j)] = true;
                }
            }
        }
        // sum up those index values where the boolean is false (the number us not a sum of two abundant numbers)
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (!sumsOfAbundantNums[i]) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Problem23NonAbundantSums prob23 = new Problem23NonAbundantSums();
        System.out.print(prob23.getNonAbundantSums(28123));
    }
}
